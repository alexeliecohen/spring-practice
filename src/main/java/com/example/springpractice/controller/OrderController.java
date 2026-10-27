package com.example.springpractice.controller;

import com.example.springpractice.dto.OrderRequest;
import com.example.springpractice.dto.OrderResponse;
import com.example.springpractice.service.OrderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("order")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public OrderResponse createOrder(@RequestBody OrderRequest request) {
        return orderService.createOrder(request);
    }


}
