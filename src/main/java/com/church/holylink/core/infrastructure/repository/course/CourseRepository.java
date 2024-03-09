package com.church.holylink.core.infrastructure.repository.course;

import com.church.holylink.core.infrastructure.repository.course.dto.CourseDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<CourseDto,Long> {

}
