package com.app.cust;

public enum CustType{

    SILVER,GOLD,PLATINUM;
    public String toString(){
        return name().toLowerCase();
    }
}