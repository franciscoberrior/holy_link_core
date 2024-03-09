package com.church.holylink.core.infrastructure.repository.events;

import com.church.holylink.core.infrastructure.repository.events.dto.EventsDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventsRepository extends JpaRepository<EventsDto,Long> {

}
