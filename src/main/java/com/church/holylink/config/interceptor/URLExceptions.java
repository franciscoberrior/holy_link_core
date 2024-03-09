package com.church.holylink.config.interceptor;

public class URLExceptions {
  public static final String[] EXCLUDED_URLS = new String[]{"/swagger-resources/**", "/swagger-ui.html", "/v2/api-docs", "/v2/api-docs/**", "/webjars/**", "/actuator/**", "/v3/api-docs/**", "/v3/api-docs", "/swagger-ui/index.html", "/swagger-ui/**", "/csrf", "/error", "/"};

  private URLExceptions() {
  }
}