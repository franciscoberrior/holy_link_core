package com.church.holylink.core.infrastructure.repository.inventary.mapper;

import com.church.holylink.core.domain.entities.Product;
import com.church.holylink.core.infrastructure.repository.inventary.dto.ProductDto;
import com.church.holylink.shared.common.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING)
public interface ProductDtoMapper extends EntityToDto<ProductDto, Product> {

}
