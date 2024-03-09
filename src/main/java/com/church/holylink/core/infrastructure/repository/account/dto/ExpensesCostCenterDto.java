package com.church.holylink.core.infrastructure.repository.account.dto;

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
@SQLDelete(sql = "UPDATE EXPENSES_COST_CENTER SET deleted = true WHERE id = ?")
@Where(clause = "deleted = false")
@Table(name = "EXPENSES_COST_CENTER")
public class ExpensesCostCenterDto {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @ManyToOne
  @JoinColumn(name = "cost_center_id", referencedColumnName = "id")
  private CostCenterDto costCenterDto;
  @ManyToOne
  @JoinColumn(name = "expenses_id", referencedColumnName = "id")
  private ExpensesDto expenses;
  private String description;

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
