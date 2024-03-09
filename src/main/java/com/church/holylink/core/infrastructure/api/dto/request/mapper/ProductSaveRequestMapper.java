package com.church.holylink.core.infrastructure.api.dto.request.mapper;

import com.church.holylink.core.domain.entities.Product;
import com.church.holylink.core.infrastructure.api.dto.request.ProductSaveRequest;
import com.church.holylink.shared.common.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = ComponentModel.SPRING)
public interface ProductSaveRequestMapper extends EntityToDto<ProductSaveRequest, Product> {
  ProductSaveRequestMapper INSTANCE = Mappers.getMapper(ProductSaveRequestMapper.class);
}
