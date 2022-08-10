package com.finedu.report.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PortfolioReport {
    @Id
    @SequenceGenerator(
            name = "portfolio_id_report",
            sequenceName = "portfolio_id_report"
    )
    @GeneratedValue(
            generator = "portfolio_id_report"
    )
    private int id;
    private String name;
    private String market;
    private BigDecimal percent;
    private LocalDateTime createdAt;
    private LocalDateTime updated;
}
