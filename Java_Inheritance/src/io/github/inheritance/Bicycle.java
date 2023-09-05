package io.github.inheritance;

class Bicycle {

	protected int gear;
	protected int speed;

	Bicycle(int startSpeed, int startGear) {
		this.gear = startGear;
		this.speed = startSpeed;
	}

	public void setGear(int newValue) {
		this.gear = newValue;
	}

	public void applyBrake(int decrement) {
		this.speed -= decrement;
	}

	public void speedUp(int increment) {
		this.speed += increment;
	}

}