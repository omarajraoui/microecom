package com.tpexam.customer.controller;

import com.tpexam.customer.dto.CustomerRequest;
import com.tpexam.customer.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;






}
