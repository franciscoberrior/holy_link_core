package com.church.holylink.core.infrastructure.api.dto.request.mapper;

import com.church.holylink.core.domain.entities.Church;
import com.church.holylink.core.infrastructure.api.dto.request.ChurchSaveRequest;
import com.church.holylink.shared.common.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = ComponentModel.SPRING)
public interface ChurchSaveRequestMapper extends EntityToDto<ChurchSaveRequest, Church> {
  ChurchSaveRequestMapper INSTANCE = Mappers.getMapper(ChurchSaveRequestMapper.class);

}
