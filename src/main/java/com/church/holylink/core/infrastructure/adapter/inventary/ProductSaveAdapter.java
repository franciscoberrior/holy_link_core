package com.church.holylink.core.infrastructure.adapter.inventary;

import com.church.holylink.core.domain.entities.Product;
import com.church.holylink.core.infrastructure.repository.inventary.ProductRepository;
import com.church.holylink.core.infrastructure.repository.inventary.mapper.ProductDtoMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class ProductSaveAdapter implements com.church.holylink.core.domain.service.ProductSave {

  private final ProductRepository productRepository;
  private final ProductDtoMapper productDtoMapper;

  @Override
  public void save(Product product) {
    productRepository.save(productDtoMapper.toDto(product));
  }
}
