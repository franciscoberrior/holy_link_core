package com.church.holylink.core.infrastructure.repository.church;

import com.church.holylink.core.infrastructure.repository.church.dto.ChurchDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChurchRepository extends JpaRepository<ChurchDto, Long> {

}
