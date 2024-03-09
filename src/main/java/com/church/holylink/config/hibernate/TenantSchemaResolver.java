package com.church.holylink.config.hibernate;

import com.church.holylink.config.interceptor.context.TenantContext;
import org.hibernate.context.spi.CurrentTenantIdentifierResolver;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

@Component
public class TenantSchemaResolver implements CurrentTenantIdentifierResolver {
  public static final String DEFAULT_SCHEMA = "public";

  public TenantSchemaResolver() {
  }

  public String resolveCurrentTenantIdentifier() {
    String t = TenantContext.getCurrentTenant();
    return !ObjectUtils.isEmpty(t) ? t : "public";
  }

  public boolean validateExistingCurrentSessions() {
    return true;
  }
}
