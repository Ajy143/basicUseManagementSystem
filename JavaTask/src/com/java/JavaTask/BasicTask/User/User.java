package com.java.JavaTask.BasicTask.User;
import com.java.JavaTask.Interface.Details;

import java.util.Scanner;

public class User implements Details {
	
	private String userID;
	   private String userName;
	   private String userCity;
	   private String userPhoneNumber;
	   
	   public User(String userID, String userName, String userCity, String userPhoneNumber) {
	       this.userID = userID;
	       this.userName = userName;
	       this.userCity = userCity;
	       this.userPhoneNumber = userPhoneNumber;
	   }
	   //getting the data for user city
	   public String getuserCity() {
			 return userCity ;    
		   }
	   // Method to display user details
	 
	   public void displayDetails() {
	       System.out.println("User ID: " + userID);
	       System.out.println("User Name: " + userName);
	       System.out.println("User City: " + userCity);
	       System.out.println("User Phone Number: " + userPhoneNumber);
	}
}
	
	
