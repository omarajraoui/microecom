package com.programmingtechie.orderservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "inventory" , value ="inventory" , url = "http://localhost:8082")
public interface InventoryClient {

    @RequestMapping(method = RequestMethod.GET , value = "/inventory")
    boolean isInStock(@RequestParam String skuCode, Integer quantity);
}
