package com.church.holylink.core.infrastructure.repository.account;

import com.church.holylink.core.infrastructure.repository.account.dto.ExpensesTypeDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpensesTypeRepository extends JpaRepository<ExpensesTypeDto,Long> {

}
