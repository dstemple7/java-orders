package com.lambda.orders.repositories;

import com.lambda.orders.models.Orders;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Orders, Long>
{
}
