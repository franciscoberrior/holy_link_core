package com.church.holylink.core.infrastructure.repository.groups;

import com.church.holylink.core.infrastructure.repository.groups.dto.PersonGroups;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonGroupsRepository extends JpaRepository<PersonGroups,Long> {

}
