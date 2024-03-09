package com.church.holylink.core.infrastructure.repository.course;

import com.church.holylink.core.infrastructure.repository.course.dto.PersonCourseDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonCourseRepository extends JpaRepository<PersonCourseDto,Long> {

}
