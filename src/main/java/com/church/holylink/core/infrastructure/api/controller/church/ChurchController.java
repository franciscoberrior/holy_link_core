package com.church.holylink.core.infrastructure.api.controller.church;

import com.church.holylink.core.application.input.port.church.ChurchSaveInputPort;
import com.church.holylink.core.infrastructure.api.dto.request.ChurchSaveRequest;
import com.church.holylink.core.infrastructure.api.dto.request.mapper.ChurchSaveRequestMapper;
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
@RequestMapping("/church")
public class ChurchController {

  private final ChurchSaveInputPort churchSaveInputPort;
  private final MessageUtil messageUtil;

  @PostMapping
  public ResponseEntity<CreateResponse> createCity(
      @RequestBody ChurchSaveRequest church) {
    churchSaveInputPort.create(ChurchSaveRequestMapper.INSTANCE.toEntity(church));
    return new ResponseEntity<>(
        new CreateResponse(messageUtil.getMessage(MessageCode.CHURCH_SAVED.getType()),
            messageUtil.getMessage(MessageCode.STATUS_SUCCESSFUL.getType()),
            messageUtil.getMessage(MessageCode.CHURCH_SAVED.getType())), HttpStatus.OK);
  }


}
