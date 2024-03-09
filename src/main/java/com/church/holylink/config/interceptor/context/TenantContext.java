package com.church.holylink.config.interceptor.context;

public class TenantContext {
  private static final ThreadLocal<String> currentTenant = new InheritableThreadLocal();

  public static String getCurrentTenant() {
    return (String)currentTenant.get();
  }

  public static void setCurrentTenant(String tenant) {
    currentTenant.set(tenant);
  }

  public static void clear() {
    currentTenant.remove();
  }

  private TenantContext() {
  }
}