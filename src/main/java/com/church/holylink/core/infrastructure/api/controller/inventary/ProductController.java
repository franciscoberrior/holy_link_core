package com.church.holylink.core.infrastructure.api.controller.inventary;

import com.church.holylink.core.application.input.port.inventary.ProductSaveInputPort;
import com.church.holylink.core.infrastructure.api.dto.request.ProductSaveRequest;
import com.church.holylink.core.infrastructure.api.dto.request.mapper.ProductSaveRequestMapper;
import com.church.holylink.shared.common.response.CreateResponse;
import com.church.holylink.shared.utils.MessageCode;
import com.church.holylink.shared.utils.MessageUtil;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/product")
public class ProductController {

  private final ProductSaveInputPort productSaveInputPort;
  private final MessageUtil messageUtil;

  @PostMapping
  public ResponseEntity<CreateResponse> createCity(
      @RequestBody ProductSaveRequest product) {
    productSaveInputPort.create(ProductSaveRequestMapper.INSTANCE.toEntity(product));
    return new ResponseEntity<>(
        new CreateResponse(messageUtil.getMessage(MessageCode.PRODUCT_SAVED.getType()),
            messageUtil.getMessage(MessageCode.STATUS_SUCCESSFUL.getType()),
            messageUtil.getMessage(MessageCode.PRODUCT_SAVED.getType())), HttpStatus.OK);
  }

}
