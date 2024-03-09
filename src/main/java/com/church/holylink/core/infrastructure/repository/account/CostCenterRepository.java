package com.church.holylink.core.infrastructure.repository.account;

import com.church.holylink.core.infrastructure.repository.account.dto.CostCenterDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CostCenterRepository extends JpaRepository<CostCenterDto,Long> {

}
