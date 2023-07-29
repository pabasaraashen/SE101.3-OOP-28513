package com.mycompany.test;
public class Test 
{
    public static void main(String[] args)
    {
        Student s11=new Student();
        Lecturer l11=new Lecturer();
        s11.setId(1234);
        s11.setName("Lakamal");
        s11.setCourse("Compter Science");
        l11.setId(5678);
        l11.setName("Kasun");
        l11.setProgramme("Computer");
        
        System.out.println("Student Id is :"+s11.getId());
        System.out.println("Student Name is :"+s11.getName());
        System.out.println("Student Course is :"+s11.getCourse());
        
        System.out.println("Lecturer Id is :"+l11.getId());
        System.out.println("Lecturer Name is :"+l11.getName());
        System.out.println("Lecturer Programme is :"+l11.getProgramme());


    }
}
