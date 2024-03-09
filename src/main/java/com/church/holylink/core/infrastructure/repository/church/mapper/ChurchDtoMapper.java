package com.church.holylink.core.infrastructure.repository.church.mapper;

import com.church.holylink.core.domain.entities.Church;
import com.church.holylink.core.infrastructure.repository.church.dto.ChurchDto;
import com.church.holylink.shared.common.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING)
public interface ChurchDtoMapper extends EntityToDto<ChurchDto, Church> {

}
