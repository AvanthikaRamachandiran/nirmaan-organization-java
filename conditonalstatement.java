package day4;
import java.util.Scanner;
public class conditonalstatement {
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your marks");
	int mark = sc.nextInt();
	if(mark>=10 && mark<=100) {
		System.out.println("pass");
		if(mark>=60)
			System.out.println("grades A");
		else if(mark>=35)
			System.out.println("grades B");
		else
			System.out.println("grades C");}

     
	else{
		System.out.println("invalid");
	}
	
	}
	}

