package com.finedu.report.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record PortfolioReportRequest(
        String name,
        String market,
        BigDecimal percent,
        LocalDateTime createdAt,
        LocalDateTime updated
) {
}
