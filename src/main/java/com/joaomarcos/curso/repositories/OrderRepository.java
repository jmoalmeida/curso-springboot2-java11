package com.joaomarcos.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaomarcos.curso.entities.Order;

public interface OrderRepository  extends JpaRepository<Order, Long>{

}
