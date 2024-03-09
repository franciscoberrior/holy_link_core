package com.church.holylink.core.infrastructure.repository.account;

import com.church.holylink.core.infrastructure.repository.account.dto.ExpensesDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpensesRepository extends JpaRepository<ExpensesDto,Long> {

}
