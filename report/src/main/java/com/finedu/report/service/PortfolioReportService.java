package com.finedu.report.service;

import com.finedu.report.dto.PortfolioReportRequest;
import com.finedu.report.entity.PortfolioReport;
import com.finedu.report.repository.PortfolioReportRepository;
import org.springframework.stereotype.Service;

@Service
public record PortfolioReportService(PortfolioReportRepository portfolioReportRepository) {

    public void registerRecord(PortfolioReportRequest portfolioReportRequest) {
        PortfolioReport portfolioReport = PortfolioReport.builder()
                .market(portfolioReportRequest.market())
                .name(portfolioReportRequest.name())
                .createdAt(portfolioReportRequest.createdAt())
                .updated(portfolioReportRequest.updated())
                .build();

        portfolioReportRepository.save(portfolioReport);
    }
}
