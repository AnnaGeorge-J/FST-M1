package activities;

public class Bicycle implements BicycleOperations,BicycleParts {
	
	
	public int gears;
	public int currentspeed;
	
	
	
	public Bicycle(int gears, int currentspeed){
		this.gears = gears;
		this.currentspeed = currentspeed;
	}
	
	public void applyBrake(int decrement){
		currentspeed -= decrement;
		System.out.println("current speed " + currentspeed);
	}
	
	public void speedUp(int increment){
		
		currentspeed-= increment;
		System.out.println("currentspeed " +  currentspeed);
	}
	
	public String bicycleDesc(){
		
		return("no:of gears " + gears + "speed of cycle " + currentspeed);
	}

	@Override
	public void speedup(int increment) {
		// TODO Auto-generated method stub
		
	}

	

}
