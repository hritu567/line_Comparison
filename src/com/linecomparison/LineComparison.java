package com.linecomparison;
import java.util.Scanner;

//uc2
public class LineComparison { 
	//calculating length
	private static double calculateLength() 
	{
		Scanner sc = new Scanner(System.in);
		double x1,x2,y1,y2;
		System.out.println("Enter the values x1,x2,y1,y2");
		x1=sc.nextInt();
		x2=sc.nextInt();
		y1=sc.nextInt();
		y2=sc.nextInt();
		System.out.println("first point " + x1 + "\n second point " + y1 + "\n third point " + x2 + "\n fourth point " + y2);
		double lenOfLine =Math.sqrt((x2 - x1) * (x2 - x1) + (y2- y1) * (y2 - y1));
		return lenOfLine;
	}
	//Checking two line are equal or not
	private static void equalityCheck(double l1, double l2) 
	{ 
		if(l1 == l2)
			System.out.println("Both Lines are equal");
		else
	    	System.out.println("Both Lines are not equal ");
	}
	// calling both function
  public static void main(String[] args) {
		System.out.println("Enter Line 1 points");
		double line1 = calculateLength();
		System.out.println("Enter Line 2 points");
		double line2 = calculateLength();
		System.out.println("Length of line1 " + line1 + "\n Length of line2 " + line2);
		equalityCheck(line1, line2);
		}
}
