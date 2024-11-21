package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long/*aqui estava Long, mais tava dando erro e o copilot sugeriu alterar pra OrderItemPK e corrigiu*/>  {

}
