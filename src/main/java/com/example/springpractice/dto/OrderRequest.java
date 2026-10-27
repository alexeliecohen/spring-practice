package com.example.springpractice.dto;

import java.math.BigDecimal;
import java.util.UUID;

public record OrderRequest(
        String type,
        String side,
        BigDecimal qty,
        BigDecimal price
) {
}
