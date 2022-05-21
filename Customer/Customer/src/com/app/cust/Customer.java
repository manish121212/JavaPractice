package com.app.cust;

import java.io.Serializable;
import java.util.Date;

public class Customer implements Comparable<Customer>,Serializable{

String email;
String password;
double regAmount;
CustType custType;
Date regDate;
 transient Address address;
 private static final long SerialVersionUID = 10l;

public Customer(String email,String password)
{
    this.email=email;
    this.password=password;
}

public Customer(String email,String password,double regAmount,CustType custtype,Date rDate )
{
    this.email=email;
    this.password=password;
    this.regAmount=regAmount;
    this.custType=custtype;
    this.regDate=rDate;
}
public Customer(){}


public void linkAddress(String city,String state,String country,String phoneNo,String type)
{
    this.address.cty=city;
    this.address.state=state;
    this.address.country=country;
    this.address.type=type;
}

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getRegAmount() {
        return this.regAmount;
    }

    public void setRegAmount(double regAmount) {
        this.regAmount = regAmount;
    }

    public CustType getCustType() {
        return this.custType;
    }

    public void setCustType(CustType custType) {
        this.custType = custType;
    }

    public Date getRegDate() {
        return this.regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    @Override
    public int compareTo(Customer o) {
        return this.email.compareTo(o.getEmail());
    }

    @Override
    public String toString() {
        return "{" +
            " email='" + getEmail() + "'" +
            ", password='" + getPassword() + "'" +
            ", regAmount='" + getRegAmount() + "'" +
            ", custType='" + getCustType() + "'" +
            ", regDate='" + getRegDate() + "'" +
            "}";
    }



}