package com.church.holylink.core.infrastructure.repository.account;

import com.church.holylink.core.infrastructure.repository.account.dto.IncomeCostCenterDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncomeCostCenterRepository extends JpaRepository<IncomeCostCenterDto,Long> {

}
