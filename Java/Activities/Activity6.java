package activities;

public class Activity6 {

	public static void main(String[] args)throws InterruptedException {
		Plane plane = new Plane(10);
		plane.onboard("Anna");
		plane.onboard("Jon");
		plane.onboard("Joe");
		
		System.out.println("plane took off "+ plane.takeoff());
		
		System.out.println("people on aeroplane "+ plane.getPassengers());
		
		Thread.sleep(2000);
		plane.land();
		
		System.out.println("Plane landed time " + plane.getLastTimeLanded());
		System.out.println("people on the plane after landing " + plane.getPassengers());
		
		
	}

}
