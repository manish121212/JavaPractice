package com.app.Cus_Comp;

import java.util.Comparator;

import com.app.cust.Customer;

public class CustComp implements Comparator<Customer> {

    @Override
    public int compare(Customer o1, Customer o2) {
        // TODO Auto-generated method stub
        return o1.getRegDate().compareTo(o2.getRegDate());
    }
    
}
