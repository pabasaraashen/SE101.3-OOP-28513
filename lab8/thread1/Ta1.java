package com.mycompany.thread1;
public class Ta1 implements Runnable
{
    
    public void run()
    {
        for(int i=1;i<6;i++)
        {
            try
            {
                thread.sleep(5000);
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
            System.out.println(i);
        }
    }
}
