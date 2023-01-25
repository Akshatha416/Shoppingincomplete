package com.exp.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exp.shopping.entity.Order;

public interface OrderRepository extends JpaRepository<Order,Integer> {

}
