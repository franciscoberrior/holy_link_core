package com.church.holylink.core.infrastructure.repository.ministries.dto;

import com.church.holylink.core.infrastructure.repository.groups.dto.GroupsDto;
import com.church.holylink.core.infrastructure.repository.person.dto.PersonDto;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@SQLDelete(sql = "UPDATE MINISTRIES SET deleted = true WHERE id = ?")
@Where(clause = "deleted = false")
@Table(name = "MINISTRIES")
public class MinistriesDto {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String description;
  @ManyToOne
  @JoinColumn(name = "group_id", referencedColumnName = "id")
  private GroupsDto group;
  @ManyToOne
  @JoinColumn(name = "leader_id", referencedColumnName = "id")
  private PersonDto leader;
  @Column(name = "created_by")
  private String createdBy;
  @Column(name = "created_date")
  private LocalDateTime createdDate;
  @Column(name = "updated_by")
  private String updatedBy;
  @Column(name = "updated_date")
  private LocalDateTime updatedDate;

  private Boolean deleted;
}
