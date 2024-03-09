package com.church.holylink.core.infrastructure.api.dto.response;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ChurchResponse {

  private Long id;
  private String name;
  private String description;

}
