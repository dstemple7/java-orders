package com.lambda.orders.repositories;

import com.lambda.orders.models.Payments;
import org.springframework.data.repository.CrudRepository;

public interface PaymentsRepository extends CrudRepository<Payments, Long>
{
}
