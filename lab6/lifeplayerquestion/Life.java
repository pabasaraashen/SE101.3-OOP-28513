package com.mycompany.life;
public class Life 
{
    public static void main(String[] args)
    {
        NewPlayer np1=new NewPlayer();
        OppositeDirection op1=new OppositeDirection();
        
        np1.up();
        np1.down();
        np1.right();
        np1.left();
        
        op1.up();
        op1.down();
        op1.right();
        op1.left();
    }
}
