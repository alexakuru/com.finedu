package com.finedu.shares.entity;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class Share {
    private int id;
    private String fullName;
    private String nyse;
    private BigDecimal price;
    private BigDecimal dividend;
}
