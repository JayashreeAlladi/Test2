package Test2;

import java.util.Scanner;

public class SammyProgrammer {
	
  public static void main(String[] args) {
	  System.out.println("enter employee details");
	  employeedetails();
  }

 private static void employeedetails()  {
	// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	String name=sc.next();
	Long contact=sc.nextLong();
	int age=sc.nextInt();
	if(age<20 && age>55) {
		 try {
			   throw new MyException("exception");
		   }
		 
		   catch(MyException e) {
		  // System.out.println("my employee exception");
	    }
     }
 }
 class MyException extends Exception 
 { 
     public MyException(String s) 
     { 
         // Call constructor of parent Exception 
         super(s); 
     } 
 } 
}
