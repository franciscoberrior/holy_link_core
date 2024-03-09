package com.church.holylink.core.infrastructure.repository.events;

import com.church.holylink.core.infrastructure.repository.events.dto.AttendanceDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendanceRepository extends JpaRepository<AttendanceDto,Long> {

}
