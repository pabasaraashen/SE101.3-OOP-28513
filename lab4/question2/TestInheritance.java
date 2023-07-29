package com.mycompany.testinheritance;
public class TestInheritance 
{
    public static void main(String[] args)
    {
        SuperB b = new SuperB();
        b2.setIt(2);
        b2.increase();
        b2.triple();
        System.out.println( b2.returnIt() );
        
        SubC c2 = new SubC();
        c2.setIt(2);
        c2.increase();
        c2.triple();
        System.out.println( c2.returnIt() );
        
    }
}
