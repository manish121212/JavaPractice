package com.app.Tester;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.app.Cus_Comp.CustComp;
import com.app.IoUtils.CustSer;
import com.app.cust.CustType;
import com.app.cust.Customer;

public class TestCustomer {
    
public static void main(String [] s)
{
    
    try(Scanner sc= new Scanner(System.in))
    {
    HashMap<String, Customer> customer=new HashMap<>();

    System.out.println("Options 1: Create A/C \n " + "2 : Display all accts \n"
							+ "3 : A/C summary \n 4:Funds Transfer \n10 : Exit");
					System.out.println("Enter option");
                    switch(sc.nextInt())
                    {
                        case 1:
                        {

                            System.out.println("Enter New Customer");
                            SimpleDateFormat ss=new SimpleDateFormat("dd-MM-yyyy");
                            try {
                                Customer cc=new Customer(sc.nextLine(),sc.nextLine(),sc.nextDouble(),CustType.valueOf(sc.nextLine()),ss.parse(sc.nextLine()));

                             if(!customer.containsKey(cc.getEmail()))   customer.put(cc.getEmail(), cc);
                            else{
                                System.out.println("Email already existed");
                            }
                            } catch (ParseException e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                            }
                        }break;
                        case 2:
                        {
                            System.out.println("Customer Login");
                           Customer cc= customer.get(sc.nextLine());
                         if(cc != null)
                          {
                            
                           System.out.println("able to login");

                           System.out.println(cc.getRegDate() + cc.getEmail());   
                        
                        }

                        }
                        break;
                        case 3:
                        {
                            System.out.println("Remove Customer");
                            Customer cc=customer.remove(sc.nextLine());

                            System.out.println("Customer removed : "+ cc);

                        }break;
                        case 4:
                        {
                            System.out.println("Please enter type of customer details");

                        CustType cust= CustType.valueOf(sc.nextLine());

                         for(Map.Entry custt:customer.entrySet() )
                         {
                             if(((Customer)custt.getValue()).getCustType() == cust)
                             {
                                 System.out.println(custt.getValue());
                             }
                         }

                    }
                    break;
                    case 5:
                    {
                        Collection<Customer> cu=customer.values();
                        ArrayList<Customer> cus= new ArrayList<>(cu);
                        Collections.sort(cus);

                    }
                    break;
                    case 6:
                    {
                        Collection<Customer> cu=customer.values();
                        ArrayList<Customer> cus= new ArrayList<>(cu);
                        Collections.sort(cus,new CustComp());
                    }
                    break;
                    case 7:
                    {
                        CustSer.CustSerialization();
                    }break;
                    case 8:
                    {
                        CustSer.CustDeSer();
                    }
    }

}
}
}
