package activities;

public class Activity1 {
	
	public static void main (String args[]){
		
		Car car = new Car();
		car.make = 2014;
		car.transmission = "manual";
		car.color = "black";
		car.displayCharacteristics();
		car.accelerate();
		car.brake();
		
	}

}
