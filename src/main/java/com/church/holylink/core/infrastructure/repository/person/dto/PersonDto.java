package com.church.holylink.core.infrastructure.repository.person.dto;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@SQLDelete(sql = "UPDATE PERSON SET deleted = true WHERE id = ?")
@Where(clause = "deleted = false")
@Table(name = "PERSON")
public class PersonDto {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String firstName;
  private String secondName;
  private String lastName;
  private String secondLastName;
  private String numberId;
  private String typeNumberId;
  private LocalDate birthday;
  private LocalDate innitYear;
  private String cellphone;
  private String email;
  private String instagram;
  private String facebook;
  private String youtube;
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
