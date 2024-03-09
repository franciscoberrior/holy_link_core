package com.church.holylink.core.application.impl.church;

import com.church.holylink.core.application.input.port.church.ChurchSaveInputPort;
import com.church.holylink.core.domain.service.ChurchSave;
import com.church.holylink.core.domain.entities.Church;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ChurchSaveService implements ChurchSaveInputPort {

  private final ChurchSave churchSave;

  public void create(Church church){
    churchSave.save(church);
  }
}
