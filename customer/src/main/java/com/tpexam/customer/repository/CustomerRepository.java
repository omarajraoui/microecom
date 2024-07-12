package com.tpexam.customer.repository;

import com.programmingtechie.orderservice.model.Customer;
import com.programmingtechie.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
