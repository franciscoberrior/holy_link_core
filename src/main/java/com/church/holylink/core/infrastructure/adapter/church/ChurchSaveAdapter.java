package com.church.holylink.core.infrastructure.adapter.church;

import com.church.holylink.core.domain.entities.Church;
import com.church.holylink.core.infrastructure.repository.church.ChurchRepository;
import com.church.holylink.core.infrastructure.repository.church.mapper.ChurchDtoMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@AllArgsConstructor
public class ChurchSaveAdapter implements com.church.holylink.core.domain.service.ChurchSave {

  private final ChurchRepository churchRepository;
  private final ChurchDtoMapper churchDtoMapper;

  @Override
  public void save(Church church) {
    churchRepository.save(churchDtoMapper.toDto(church));
  }
}
