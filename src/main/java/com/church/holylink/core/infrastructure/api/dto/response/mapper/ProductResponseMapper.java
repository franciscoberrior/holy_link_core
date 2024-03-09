package com.church.holylink.core.infrastructure.api.dto.response.mapper;

import com.church.holylink.core.domain.entities.Product;
import com.church.holylink.core.infrastructure.api.dto.response.ProductResponse;
import com.church.holylink.shared.common.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING)
public interface ProductResponseMapper extends EntityToDto<ProductResponse, Product> {

}
