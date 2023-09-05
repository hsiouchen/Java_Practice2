package io.github.inheritance;

class MountainBike extends Bicycle {
	
	public int seatHeight;
	
	MountainBike(
					int startHeight,
					int startSpeed,
					int startGear		) {
		
		super(startSpeed, startGear);
		this.seatHeight = startHeight;
		
	}
	
	public void setHeight(int newValue) {
		
		this.seatHeight = newValue;
		
	}

}