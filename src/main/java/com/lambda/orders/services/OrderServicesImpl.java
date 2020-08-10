package com.lambda.orders.services;

import com.lambda.orders.models.Orders;
import com.lambda.orders.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "orderServices")
public class OrderServicesImpl implements OrderServices
{
    @Autowired
    OrderRepository orderrepos;

    @Override
    public Orders save(Orders order){
        return orderrepos.save(order);
    }
}
