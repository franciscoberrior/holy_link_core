package com.church.holylink.core.infrastructure.repository.person;

import com.church.holylink.core.infrastructure.repository.person.dto.PersonDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<PersonDto,Long> {

}
