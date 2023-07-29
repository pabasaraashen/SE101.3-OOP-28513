package com.mycompany.employeetest;
public class EmployeeTest 
{
    public static void main(String[] args) 
    {
        Employee Bogdan=new Employee();
        Employee Bird=new Employee();
        
        Bogdan.setEmpId(1234);
        Bogdan.setEmpNmae("Bogdan");
        Bogdan.setEmpDesignation("CEO");
        
        Bird.setEmpId(5678);
        Bird.setEmpNmae("Bird");
        Bird.setEmpDesignation("Manager");
        
        System.out.println("Employee Id is :"+Bogdan.getEmpId());
        System.out.println("Employee Name is :"+Bogdan.getEmpNmae());
        System.out.println("Employee Designation is :"+Bogdan.getEmpDesignation());
        
        System.out.println("Employee Id is :"+Bird.getEmpId());
        System.out.println("Employee Name is :"+Bird.getEmpNmae());
        System.out.println("Employee Designation is :"+Bird.getEmpDesignation());
        
    }
}
