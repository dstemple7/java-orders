package com.lambda.orders.repositories;

import com.lambda.orders.models.Customers;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customers, Long>
{
}
