package com.church.holylink.core.application.input.port.inventary;

import com.church.holylink.core.domain.entities.Product;

public interface ProductSaveInputPort {

  void create(Product product);
}