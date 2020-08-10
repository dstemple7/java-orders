package com.lambda.orders.models;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Orders
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long ordnum;

    private double ordamount;

    private double advanceamount;

    //    CUSTCODE Long foreign key (one customer to many orders) not null
    @ManyToOne
    @JoinColumn(name = "custcode", nullable = false)
    private Customers customer;

    private String orderdescription;

    public Orders()
    {
    }

    public Orders(
        double ordamount,
        double advanceamount,
        Customers customer,
        String orderdescription)
    {
        this.ordamount = ordamount;
        this.advanceamount = advanceamount;
        this.customer = customer;
        this.orderdescription = orderdescription;
    }

    public long getOrdnum()
    {
        return ordnum;
    }

    public void setOrdnum(long ordnum)
    {
        this.ordnum = ordnum;
    }

    public double getOrdamount()
    {
        return ordamount;
    }

    public void setOrdamount(double ordamount)
    {
        this.ordamount = ordamount;
    }

    public double getAdvanceamount()
    {
        return advanceamount;
    }

    public void setAdvanceamount(double advanceamount)
    {
        this.advanceamount = advanceamount;
    }

    public Customers getCustomer()
    {
        return customer;
    }

    public void setCustomer(Customers customer)
    {
        this.customer = customer;
    }

    public String getOrderdescription()
    {
        return orderdescription;
    }

    public void setOrderdescription(String orderdescription)
    {
        this.orderdescription = orderdescription;
    }
}
