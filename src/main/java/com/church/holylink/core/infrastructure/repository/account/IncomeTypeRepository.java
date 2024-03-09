package com.church.holylink.core.infrastructure.repository.account;

import com.church.holylink.core.infrastructure.repository.account.dto.IncomeTypeDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncomeTypeRepository extends JpaRepository<IncomeTypeDto,Long> {

}
