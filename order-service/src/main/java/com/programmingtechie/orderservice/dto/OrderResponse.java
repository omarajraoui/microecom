package com.programmingtechie.orderservice.dto;

import java.math.BigDecimal;

public record OrderResponse (Long id, String skuCode, BigDecimal price, Integer quantity){
}
