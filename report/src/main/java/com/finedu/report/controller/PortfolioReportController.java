package com.finedu.report.controller;

import com.finedu.report.dto.PortfolioReportRequest;
import com.finedu.report.service.PortfolioReportService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/v1/report")
public record PortfolioReportController(PortfolioReportService portfolioReportService) {

    @PostMapping("/portfolio")
    public void registerRecord(PortfolioReportRequest portfolioReportRequest) {
        log.info("New share request {}", portfolioReportRequest);
        portfolioReportService.registerRecord(portfolioReportRequest);
    }
}
