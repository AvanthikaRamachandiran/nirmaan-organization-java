package day5;

import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Simple calculator");
		
		System.out.println("Enter the first number");
		int num1= sc.nextInt();
		System.out.println("Enter the second number");
		int num2= sc.nextInt();
		System.out.println("Enter 1 for Addition:");
		System.out.println("Enter 2 for Subraction:");
		System.out.println("Enter 3 for Multiplication:");
		System.out.println("Enter 4 for Division:");
		System.out.println("Enter 5 for Modules:");
		int key = sc.nextInt();
		
		switch(key) {
         case 1: {
			System.out.println("Addition"+(num1+num2));
			break;
		}case 2: {
			System.out.println("Subraction"+(num1-num2));
			break;
		}case 3: {
			System.out.println("Multiplication"+(num1*num2));
			break;
		}case 4: {
			System.out.println("Division"+(num1/num2));
			break;
		}case 5: {
			System.out.println("Modules"+(num1%num2));
			break;
		}
		default:
			System.out.println("Invalid");
		}
		
	}

}
