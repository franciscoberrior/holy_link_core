package com.church.holylink.core.infrastructure.repository.account;

import com.church.holylink.core.infrastructure.repository.account.dto.ExpensesCostCenterDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpensesCostCenterRepository extends JpaRepository<ExpensesCostCenterDto,Long> {

}
