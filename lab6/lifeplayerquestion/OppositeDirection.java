package com.mycompany.life;
public class OppositeDirection extends PlayerControl
{
    public void up()
    {
        System.out.println("down(2spaces)");
    }
    public void down()
    {
        System.out.println("up(2spaces)");
    }
    public void right()
    {
        System.out.println("left(2spaces)");
    }
    public void left()
    {
        System.out.println("right(2spaces)");
    }
}
