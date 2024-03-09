package com.church.holylink.core.infrastructure.api.dto.response.mapper;

import com.church.holylink.core.domain.entities.Church;
import com.church.holylink.core.infrastructure.api.dto.response.ChurchResponse;
import com.church.holylink.shared.common.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING)
public interface ChurchResponseMapper extends EntityToDto<ChurchResponse, Church> {

}
