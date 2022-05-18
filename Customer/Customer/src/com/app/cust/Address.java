package com.app.cust;

public class Address {
    public String cty,state,country,phoneNo,type;
   
    public Address()
    {

    }

    public Address(String cty, String state, String country, String phoneNo, String type) {
        this.cty = cty;
        this.state = state;
        this.country = country;
        this.phoneNo = phoneNo;
        this.type = type;
    }
    

    public String getCty() {
        return this.cty;
    }

    public void setCty(String cty) {
        this.cty = cty;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhoneNo() {
        return this.phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }


}
