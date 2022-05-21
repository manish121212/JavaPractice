package com.app.IoUtils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

import com.app.cust.Customer;

public class CustSer {

    public static void CustSerialization( )
    {
        HashMap<Integer,Customer> customer= new HashMap<>();
        Customer[] cus={new Customer("manish@gmial.com","123"),new Customer("man@gmail.com", "111")};
        for(int i=0;i<cus.length;i++)
        {
           customer.put(i,cus[i]);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("please Enter file");
        try( ObjectOutputStream ou = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(sc.nextLine()))))
        {
           ou.writeObject(customer);
        } catch(Exception e)
        {
           System.out.println(e);
        }
        finally{
            sc.close();
        }
    }
        public static void CustDeSer()
        {  
            Scanner sc= new Scanner(System.in);
             try(ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(sc.nextLine()))))
             {
               HashMap<Integer,Customer> cust=new HashMap<>();
               cust=(HashMap<Integer,Customer>) in.readObject();

               for(Map.Entry cus:cust.entrySet())
               {
                   System.out.println(cus.getValue());
               }
               for(Customer e : cust.values())
			   System.out.println(e);
                
             }catch(Exception e){e.printStackTrace();}
        }
    
    
}
