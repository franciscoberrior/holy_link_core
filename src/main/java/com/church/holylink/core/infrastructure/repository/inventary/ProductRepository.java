package com.church.holylink.core.infrastructure.repository.inventary;

import com.church.holylink.core.infrastructure.repository.inventary.dto.ProductDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductDto, Long> {

}
