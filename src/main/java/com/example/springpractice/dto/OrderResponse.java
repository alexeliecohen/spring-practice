package com.example.springpractice.dto;

import com.example.springpractice.entity.Orders;

public record OrderResponse (
        Orders order,
        String status
) {}
