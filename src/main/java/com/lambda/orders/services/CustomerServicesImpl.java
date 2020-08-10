package com.lambda.orders.services;

import com.lambda.orders.models.Customers;
import com.lambda.orders.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "customerServices")
public class CustomerServicesImpl implements CustomerServices
{
    @Autowired
    CustomerRepository custrepos;

    @Override
    public Customers save(Customers customer){
        return custrepos.save(customer);
    }
}
