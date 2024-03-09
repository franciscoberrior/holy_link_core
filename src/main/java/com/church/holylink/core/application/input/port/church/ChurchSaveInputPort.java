package com.church.holylink.core.application.input.port.church;

import com.church.holylink.core.domain.entities.Church;

public interface ChurchSaveInputPort {

  void create(Church church);

}
