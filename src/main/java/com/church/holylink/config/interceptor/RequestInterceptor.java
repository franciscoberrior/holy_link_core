package com.church.holylink.config.interceptor;

import com.church.holylink.config.interceptor.context.TenantContext;
import com.church.holylink.shared.exception.TenantException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.AsyncHandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class RequestInterceptor implements AsyncHandlerInterceptor {
  private static final Logger log = LoggerFactory.getLogger(RequestInterceptor.class);
  private static final String TENANT_ID_HEADER = "X-TenantID";
  private static final String PUBLIC_SCHEMA = "public";
  @Value("${multitenant.schemas}")
  private String defaultSchema;

  public RequestInterceptor() {
    super();
  }

  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object object) throws TenantException {
    String requestURI = request.getRequestURI();
    String tenantID = StringUtils.isNotEmpty(request.getHeader("X-TenantID")) ? request.getHeader("X-TenantID") : this.getDefaultSchema();
    log.info("RequestURI: {} - Search for X-TenantID  : {}", requestURI, tenantID);
    if (StringUtils.isNotEmpty(tenantID)) {
      TenantContext.setCurrentTenant(tenantID);
      return true;
    } else {
      throw new TenantException("Tenant header not found.");
    }
  }

  public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    TenantContext.clear();
  }

  private String getDefaultSchema() {
    return StringUtils.isNotEmpty(this.defaultSchema) && !this.defaultSchema.contains(",") ? this.defaultSchema : "public";
  }
}