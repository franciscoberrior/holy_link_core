package com.church.holylink.core.infrastructure.repository.events.dto;

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
@SQLDelete(sql = "UPDATE PLANNING SET deleted = true WHERE id = ?")
@Where(clause = "deleted = false")
@Table(name = "PLANNING")
public class PlanningDto {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @ManyToOne
  @JoinColumn(name = "event_id", referencedColumnName = "id")
  private EventsDto event;
  private LocalDateTime initDate;
  private LocalDateTime endDate;
  @ManyToOne
  @JoinColumn(name = "responsible_id", referencedColumnName = "id")
  private PersonDto responsible;
  private Boolean status;
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
