package com.church.holylink.shared.utils;

import lombok.Getter;

@Getter
public enum MessageCode {
  STATUS_SUCCESSFUL("HLK-001", "Message.STATUS_SUCCESSFUL"),
  CHURCH_SAVED("HLK-002", "Message.CHURCH_SAVED"),
  PRODUCT_SAVED("HLK-003", "Message.PRODUCT_SAVED");

  private final String code;
  private final String type;

  MessageCode(String code, String type) {
    this.code = code;
    this.type = type;
  }

}