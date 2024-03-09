package com.church.holylink.shared.exception;

public class TenantException extends RuntimeException {
  public TenantException(String message) {
    super(message);
  }
}