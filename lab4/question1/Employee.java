package com.mycompany.employeetest;
public class Employee 
{
    private int empId;
    private String empName,empDesignation;
    
    public void setEmpId(int empId)
    {
        this.empId=empId;
    }
    public void setEmpNmae(String empName)
    {
        this.empName=empName;
    }
    public void setEmpDesignation(String empDesignation)
    {
        this.empDesignation=empDesignation;
    }
    
    public int getEmpId()
    {
        return empId;
    }
    public String getEmpNmae()
    {
        return empName;
    }
    public String getEmpDesignation()
    {
        return empDesignation;
    }
    
}
