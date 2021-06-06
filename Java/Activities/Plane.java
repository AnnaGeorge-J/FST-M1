package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Plane {
	
	public List<String> passengers;
	public int maxpassangers;
	public Date lastTimeTookof;
	public Date lastTimeLanded;


public Plane(int maxpassangers){

	this.maxpassangers = maxpassangers;
	this.passengers = new ArrayList<>();
}

public void onboard(String passenger){
	
	this.passengers.add(passenger);

}

public Date getLastTimeLanded(){
	return lastTimeLanded;
}

public void land(){
	this.lastTimeLanded = new Date();
	this.passengers.clear();
}

public List<String> getPassengers(){
	return passengers;
			
}

public Date takeoff(){
	this.lastTimeTookof = new Date();
	return lastTimeTookof;
}

}
