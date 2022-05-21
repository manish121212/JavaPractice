package com.app.oddeven.Tester;

import java.util.Scanner;

import com.app.oddeven.OddEven;

public class Test1 {
    
    public static void main(String [] s)
    {
        try{
        Scanner sc=new Scanner(System.in);
        int i =sc.nextInt();
        
        OddEven od=new OddEven(i );
         OddEven ev= new OddEven(i);
         od.setName("odd");
         ev.setName("Even");
                  od.join();
         ev.join();
    }catch(InterruptedException e)
    {
        System.out.println(e);
    }

}
}
