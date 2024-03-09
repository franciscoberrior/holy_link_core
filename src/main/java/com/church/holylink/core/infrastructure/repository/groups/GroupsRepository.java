package com.church.holylink.core.infrastructure.repository.groups;

import com.church.holylink.core.infrastructure.repository.groups.dto.GroupsDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupsRepository extends JpaRepository<GroupsDto, Long> {

}
