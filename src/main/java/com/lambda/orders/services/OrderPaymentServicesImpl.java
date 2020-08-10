package com.lambda.orders.services;

import com.lambda.orders.models.OrderPayment;
import com.lambda.orders.repositories.OrderPaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "orderPaymentServices")
public class OrderPaymentServicesImpl implements OrderPaymentServices
{
    @Autowired
    OrderPaymentRepository orderpayrepos;

    @Override
    public OrderPayment save(OrderPayment orderpayment){
        return orderpayrepos.save(orderpayment);
    }
}
