package com.finedu.shares.dto;

import java.math.BigDecimal;

public record ShareRegistrationRequest(
        String fullName,
        String nyse,
        BigDecimal price,
        BigDecimal dividend
) {
}
