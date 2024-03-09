package com.church.holylink.core.application.impl.inventary;

import com.church.holylink.core.application.input.port.inventary.ProductSaveInputPort;
import com.church.holylink.core.domain.entities.Product;
import com.church.holylink.core.domain.service.ProductSave;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ProductSaveService implements ProductSaveInputPort {

  private final ProductSave productSave;

  public void create(Product product){
    productSave.save(product);
  }
}
