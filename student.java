package day9;

public class student {
	String name;
	int rollno;
	long phoneno;
	public static void main(String[]args) {
		student std1=new student();
		std1.name="Asika";
		std1.rollno=123;
		std1.phoneno=978763674;
		
		
		student std2=new student();
		std2.name="akshaya";
		std2.rollno=321;
		std2.phoneno=668838779;
		
		
		student std3=new student();
		std3.name="abi";
		std3.rollno=333;
		std3.phoneno=664525359;
		System.out.println(std1.name);
		System.out.println(std2.name);
		System.out.println(std3.name);
		System.out.println(std2.rollno);
		System.out.println(std3.phoneno);
		
		
		
	}
	

}
