package com.church.holylink.core.infrastructure.repository.ministries;

import com.church.holylink.core.infrastructure.repository.ministries.dto.MinistriesDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MinistriesRepository  extends JpaRepository<MinistriesDto,Long> {

}
