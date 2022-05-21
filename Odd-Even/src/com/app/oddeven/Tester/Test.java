package com.app.oddeven.Tester;

import java.util.Scanner;

import com.app.oddeven.OddEven;
import com.app.oddeven.OddEvenImpl;

public class Test {
    
    public static void main(String [] s)
    {
        try{
        Scanner sc=new Scanner(System.in);
        int i =sc.nextInt();
        
        OddEvenImpl od=new OddEvenImpl(i );
        // OddEvenImpl ev= new OddEvenImpl(i);
        
         Thread t1= new Thread(od,"odd");
         Thread t2= new Thread(od,"Even");
         t1.start();
         t1.join();
         t2.start();
         t2.join();

    }catch(InterruptedException e)
    {
        System.out.println(e);
    }

}
}
