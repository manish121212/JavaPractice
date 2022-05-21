package com.app.oddeven;

public class OddEvenImpl implements Runnable{
    int num;
public OddEvenImpl(int num){
   // super(name);
    this.num=num;
  //  start();
}
@Override
public void run()  {
    System.out.println(Thread.currentThread().getName()+" Started");
   
   //synchronized(this){
   try{
    for(int i=0;i<num;i++)
  {  
      if(i % 2 == 0 && Thread.currentThread().getName().equals("Even") )
    {
        //notifyAll();
       System.out.println(i +" "+ Thread.currentThread().getName()); 
      // wait();           
    }
     else//notifyAll();
      {  System.out.println(i +" "+ Thread.currentThread().getName()); 
        //wait();           
     
    }
}}catch(Exception e){}//}

}
}