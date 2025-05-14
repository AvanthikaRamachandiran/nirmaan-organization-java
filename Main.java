package day16;

class vehicle {
	void startEngine() {
		System.out.println("vehicle engine is started");
	}
}

class car extends vehicle {
	void drive() {
		System.out.println("car is driving");
	}
}

class electriCar extends car {
	void chargebattery() {

		System.out.println("electric car is charging");
	}
}

class bike extends vehicle {
	void kickstart() {
		System.out.println("bike is kick-started");
	}

}

public class Main {
	public static void main(String[]args) {
		
		electriCar ec=new electriCar();
		ec.drive();
		ec.startEngine();
		ec.chargebattery();
		
	}

}
