package com.lambda.orders.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "orderpayments")
public class OrderPayment
{
    @ManyToMany
    @JoinTable(name = "orderpayment",
    joinColumns = @JoinColumn(name = "paymentid"),
        inverseJoinColumns = @JoinColumn(name = "orderid"))
    private Set<Payments> payments = new HashSet<>();

    public OrderPayment()
    {
    }

    public OrderPayment(Set<Payments> payments)
    {
        this.payments = payments;
    }

    public Set<Payments> getPayments()
    {
        return payments;
    }

    public void setPayments(Set<Payments> payments)
    {
        this.payments = payments;
    }

    @Override
    public String toString()
    {
        return "OrderPayment{" +
            "payments=" + payments +
            '}';
    }
}
