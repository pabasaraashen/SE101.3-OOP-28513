package com.mycompany.trycatch2;
public class trycatch2
{
    public static void main(String[] args)
    {
        int array[]=new int[6];
        try
        {
            array[6]=44;
            System.out.println("Array value is :"+array[6]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Out of the array size");
        }
    }
}
