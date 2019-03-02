package Test2;

import java.util.Scanner;

public class DavidSalary {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter basic salary");
	   double bs=sc.nextDouble();
	   
	  double HRA=(50*bs)/100;
	  double SA=(75*bs)/100;
	  double PF=(12*bs)/100;

	  double netPayableSalary=bs+HRA+SA+PF;
	  System.out.println( netPayableSalary);
		 
   }
}
