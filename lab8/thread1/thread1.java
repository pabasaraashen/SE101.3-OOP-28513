package com.mycompany.thread1;
public class thread1 
{
    public static void main(String[] args)
    {
        Ta1 t0=new Ta1();
        Ta1 t1=new Ta1();
        
        thread b0=new thread(t1);
        thread b0=new thread(t2);
        
        b0.start();
        b1.start();
    }
}
