package com.example.springpractice.service;

import com.example.springpractice.dto.OrderRequest;
import com.example.springpractice.dto.OrderResponse;
import com.example.springpractice.entity.Orders;
import com.example.springpractice.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public OrderResponse createOrder(OrderRequest order) {
        Orders orders = new Orders()
                .setPrice(order.price())
                .setQty(order.qty())
                .setSide(order.side())
                .setType(order.type());

        orderRepository.save(orders);

        return new OrderResponse(orders, "Accepted");
    }
}
