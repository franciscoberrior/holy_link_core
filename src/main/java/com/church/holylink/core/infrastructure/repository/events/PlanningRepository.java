package com.church.holylink.core.infrastructure.repository.events;

import com.church.holylink.core.infrastructure.repository.events.dto.PlanningDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanningRepository extends JpaRepository<PlanningDto,Long> {

}
