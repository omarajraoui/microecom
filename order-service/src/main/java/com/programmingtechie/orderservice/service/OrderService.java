package com.programmingtechie.orderservice.service;

import com.programmingtechie.orderservice.client.InventoryClient;
import com.programmingtechie.orderservice.dto.OrderRequest;
import com.programmingtechie.orderservice.model.Order;
import com.programmingtechie.orderservice.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Transactional
public class OrderService {

    private final OrderRepository orderRepository;

    private final InventoryClient inventoryClient;

    public void placeOrder(OrderRequest orderRequest) {
       var isProductInStock = inventoryClient.isInStock(orderRequest.skuCode(), orderRequest.quantity());
       if(isProductInStock) {
           Order order = new Order();
           order.setOrderNumber(UUID.randomUUID().toString());
           order.setPrice(orderRequest.price());
           order.setQuantity(orderRequest.quantity());
           order.setSkuCode(orderRequest.skuCode());

           orderRepository.save(order);
       } else {
           throw new RuntimeException("Product is out of stock");
       }

    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
    private static Order mapToOrder(OrderRequest orderRequest) {
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());
        order.setPrice(orderRequest.price());
        order.setQuantity(orderRequest.quantity());
        order.setSkuCode(orderRequest.skuCode());
        return order;
    }
}
