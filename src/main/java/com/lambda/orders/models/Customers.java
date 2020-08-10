package com.lambda.orders.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "customers")
public class Customers
{

    //    CUSTCODE primary key, not null Long
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long custcode;

    //    CUSTNAME String, not null
    @Column(nullable = false)
    private String custname;

    //    CUSTCITY String
    private String custcity;

    //    WORKINGAREA String
    private String workingarea;

    //    CUSTCOUNTRY String
    private String custcountry;

    //    GRADE String
    private String grade;

    //    OPENINGAMT double
    private double openingamt;

    //    RECEIVEAMT double
    private double receiveamt;

    //    PAYMENTAMT double
    private double paymentamt;

    //    OUTSTANDINGAMT double
    private double outstandingamt;

    //    PHONE String
    private String phone;

    //    AGENTCODE Long foreign key (one agent to many customers) not null
    @ManyToOne
    @JoinColumn(name = "agentcode", nullable = false)
    private Agents agent;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Orders> orders = new ArrayList<>();

    public Customers()
    {
    }

    public Customers(
        String custname,
        String custcity,
        String workingarea,
        String custcountry,
        String grade,
        double openingamt,
        double receiveamt,
        double paymentamt,
        double outstandingamt,
        String phone,
        Agents agent)
    {
        this.custname = custname;
        this.custcity = custcity;
        this.workingarea = workingarea;
        this.custcountry = custcountry;
        this.grade = grade;
        this.openingamt = openingamt;
        this.receiveamt = receiveamt;
        this.paymentamt = paymentamt;
        this.outstandingamt = outstandingamt;
        this.phone = phone;
        this.agent = agent;
    }

    public long getCustcode()
    {
        return custcode;
    }

    public void setCustcode(long custcode)
    {
        this.custcode = custcode;
    }

    public String getCustname()
    {
        return custname;
    }

    public void setCustname(String custname)
    {
        this.custname = custname;
    }

    public String getCustcity()
    {
        return custcity;
    }

    public void setCustcity(String custcity)
    {
        this.custcity = custcity;
    }

    public String getWorkingarea()
    {
        return workingarea;
    }

    public void setWorkingarea(String workingarea)
    {
        this.workingarea = workingarea;
    }

    public String getCustcountry()
    {
        return custcountry;
    }

    public void setCustcountry(String custcountry)
    {
        this.custcountry = custcountry;
    }

    public String getGrade()
    {
        return grade;
    }

    public void setGrade(String grade)
    {
        this.grade = grade;
    }

    public double getOpeningamt()
    {
        return openingamt;
    }

    public void setOpeningamt(double openingamt)
    {
        this.openingamt = openingamt;
    }

    public double getReceiveamt()
    {
        return receiveamt;
    }

    public void setReceiveamt(double receiveamt)
    {
        this.receiveamt = receiveamt;
    }

    public double getPaymentamt()
    {
        return paymentamt;
    }

    public void setPaymentamt(double paymentamt)
    {
        this.paymentamt = paymentamt;
    }

    public double getOutstandingamt()
    {
        return outstandingamt;
    }

    public void setOutstandingamt(double outstandingamt)
    {
        this.outstandingamt = outstandingamt;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public Agents getAgent()
    {
        return agent;
    }

    public void setAgent(Agents agent)
    {
        this.agent = agent;
    }

    @Override
    public String toString()
    {
        return "Customers{" +
            "custcode=" + custcode +
            ", custname='" + custname + '\'' +
            ", custcity='" + custcity + '\'' +
            ", workingarea='" + workingarea + '\'' +
            ", custcountry='" + custcountry + '\'' +
            ", grade='" + grade + '\'' +
            ", openingamt=" + openingamt +
            ", receiveamt=" + receiveamt +
            ", paymentamt=" + paymentamt +
            ", outstandingamt=" + outstandingamt +
            ", phone='" + phone + '\'' +
            ", agent=" + agent +
            ", orders=" + orders +
            '}';
    }
}
