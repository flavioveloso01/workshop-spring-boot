package com.projetosflavio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetosflavio.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
