package com.example.springpractice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
public class Orders {
    @Id
    UUID id;
    String type;
    String side;
    BigDecimal qty;
    BigDecimal price;

    public Orders() {
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public Orders setType(String type) {
        this.type = type;
        return this;
    }

    public String getSide() {
        return side;
    }

    public Orders setSide(String side) {
        this.side = side;
        return this;
    }

    public BigDecimal getQty() {
        return qty;
    }

    public Orders setQty(BigDecimal qty) {
        this.qty = qty;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Orders setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }
}
