package day12;
import java.util.Scanner;

public class trafficfine {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter vehicle type:");
		int vehicle=sc.nextInt();
		System.out.println("enter your speed");
		int speed=sc.nextInt();
		System.out.println("enter speed limit");
		int limit=sc.nextInt();
		int Extraspeed=speed-limit;
		if(vehicle==2) {
			if(Extraspeed>=1&&Extraspeed<10)
			System.out.println("fine amount 500");
			else if(Extraspeed>=10&&Extraspeed<20)
			System.out.println("fine amount 1000");
			else if(Extraspeed>20)
				System.out.println("fine amount 2000");
			else
				System.out.println("no Fine.Drive safely!");
		}
		else if(vehicle==4) {
			if(Extraspeed>=1&& Extraspeed<10)
				System.out.println("fine amount 1000");
			else if(Extraspeed>=10&& Extraspeed<20)
				System.out.println("fine amount 2000");
			else if(Extraspeed>=20)
				System.out.println("fine amount 3000");
			else
				System.out.println("no fine.drive safely!");
		}
		else {
			System.out.println("Wrong vehicle");
		}
	}
				
			
			
				
		
		
	}


