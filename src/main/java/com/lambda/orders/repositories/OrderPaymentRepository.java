package com.lambda.orders.repositories;

import com.lambda.orders.models.OrderPayment;
import org.springframework.data.repository.CrudRepository;

public interface OrderPaymentRepository extends CrudRepository<OrderPayment, Long>
{
}
