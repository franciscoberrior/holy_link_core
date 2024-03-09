package com.church.holylink.config.interceptor;

import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class PathMatchingConfigurationAdapter implements WebMvcConfigurer {
  private final RequestInterceptor requestInterceptor;

  public void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor(this.requestInterceptor).excludePathPatterns(URLExceptions.EXCLUDED_URLS);
  }

  public void configureContentNegotiation(ContentNegotiationConfigurer contentNegotiationConfig) {
    contentNegotiationConfig.favorPathExtension(false);
  }

  public void configurePathMatch(PathMatchConfigurer pathMatchConfig) {
    pathMatchConfig.setUseSuffixPatternMatch(false);
  }

  public PathMatchingConfigurationAdapter(RequestInterceptor requestInterceptor) {
    this.requestInterceptor = requestInterceptor;
  }
}