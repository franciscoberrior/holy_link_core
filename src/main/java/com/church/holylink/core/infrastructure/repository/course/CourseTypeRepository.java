package com.church.holylink.core.infrastructure.repository.course;

import com.church.holylink.core.infrastructure.repository.course.dto.CourseTypeDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseTypeRepository extends JpaRepository<CourseTypeDto,Long> {

}
