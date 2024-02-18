package com.java.JavaTask.BasicTask.Main;
import java.util.*;
import com.java.JavaTask.BasicTask.Employee.Employee;
import com.java.JavaTask.BasicTask.User.User;

public class StoreManagementSystem {

	public static void main(String[] args) {
		
		Scanner Scan = new Scanner(System.in);
		
		// started  for employee
		System.out.println("Enter the Number of Employee :");
		int numberOfEmployee = Scan.nextInt();
		Employee[] arr= new Employee[numberOfEmployee];
		
		//setting  the  detail in multiple Employee 
		for(int i=0;i<numberOfEmployee;i++){
		System.out.println("Enter the empID,empName,empPerformance,empPhoneNumber of Employee : ");
		
		  String empID = Scan.next();
		  String empName = Scan.next();
		  int empPerformance = Scan.nextInt();
		  String empPhoneNumber = Scan.next();
		  
		  arr[i]= new Employee(empID,empName,empPerformance,empPhoneNumber);   
		}
		//getting correct detail by Employee Id
		for(int i=0;i<numberOfEmployee;i++){
			
			System.out.println("Enter the empID of Employee to search the details : ");
			String empIDToSearchEmployee = Scan.next();
			for(int j=0;j<numberOfEmployee;j++) {
				
				if( empIDToSearchEmployee.equalsIgnoreCase(arr[j].getEmpId()) ) {
					arr[j].displayDetails();
					break;
				}
			//else System.out.println("--Id Not Found--");
			
			}
			break;
		}
		// end for employee
		
		// started for user/customer
		
		System.out.println("Enter the Number of user :");
		int numberOfuser = Scan.nextInt();
		User[] arr1= new User[numberOfuser];
		
		//setting  the  detail in multiple Employee 
		for(int i=0;i<numberOfuser;i++){
		System.out.println("Enter the userID,userName,userCity,userPhoneNumber of user : ");
		
		  String userID = Scan.next();
		  String userName = Scan.next();
		  String userCity = Scan.next();
		  String userPhoneNumber = Scan.next();
		  
		  arr1[i]= new User(userID,userName,userCity,userPhoneNumber);   
		}
		//getting correct detail by user city
		for(int i=0;i<numberOfuser;i++){
			
			System.out.println("Enter the name of city of user to search the details : ");
			String cityToSearchUser = Scan.next();
			for(int j=0;j<numberOfuser;j++) {
				
				if(cityToSearchUser.equalsIgnoreCase(arr1[j].getuserCity())){
					arr1[j].displayDetails();
					break;
				}
			//else System.out.println("No user present in this city");
			
			}
			break;
		}
		// end for user/customer
	    
	}

}
