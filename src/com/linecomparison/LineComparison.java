package com.linecomparison;
import java.util.Scanner;
//uc1
public class LineComparison { 
	//calculating length
	public static void main(String[] args) {
		double lineLength = 0;
		Scanner myObj = new Scanner(System.in); 
	    System.out.println("Enter first number, second number, third number and fourth number");
	    double x1=myObj.nextDouble();
	    double y1=myObj.nextDouble();
	    double x2=myObj.nextDouble();
	    double y2=myObj.nextDouble();

	lineLength = (Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1))));

		System.out.println("Length of a line is : " + lineLength);
	}

}
