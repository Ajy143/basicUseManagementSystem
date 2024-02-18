package com.java.JavaTask.BasicTask.Employee;
import com.java.JavaTask.Interface.Details;

public class Employee implements Details {
	
	   private String empID;
	   private String empName;
	   private int empPerformance;
	   private String empPhoneNumber;
	   
	   public Employee(String empID, String empName, int empPerformance, String empPhoneNumber) {
	       this.empID = empID;
	       this.empName = empName;
	       this.empPerformance = empPerformance;
	       this.empPhoneNumber = empPhoneNumber;
	   }
	   
	   public String getEmpId() {
		   
		  return empID ; 
		   
	   }
	   
	   // Method to analyze performance
	   public String performanceAnalysis(int performance) {
	       if (performance >= 80 && performance <= 100)
	           return "A";
	       else if (performance >= 60 && performance < 80)
	           return "B";
	       else
	           return "C";
	   }
	   // Method to display employee details
	   public void displayDetails() {
	       System.out.println("Employee ID: " + empID);
	       System.out.println("Employee Name: " + empName);
	       System.out.println("Employee Performance: " + performanceAnalysis(empPerformance));
	       System.out.println("Employee Phone Number: " + empPhoneNumber);
		
	}

	
	
	
	

}
