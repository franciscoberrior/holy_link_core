package com.church.holylink.core.infrastructure.api.dto.request;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ProductSaveRequest {

  private String name;
  private String description;
  private Integer amount;

}
