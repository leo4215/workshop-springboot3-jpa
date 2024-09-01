package com.studies.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studies.course.entities.OrderItem;
import com.studies.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}