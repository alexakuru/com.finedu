package com.finedu.report.repository;

import com.finedu.report.entity.PortfolioReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PortfolioReportRepository extends JpaRepository<PortfolioReport, Integer> {
}
