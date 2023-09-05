package io.github.abstration;


public abstract class GraphicObject {
	int x, y;

	GraphicObject() {
		System.out.println("Base Abstract class");
	}
	
	void moveTo(int newX, int newY) {
		System.out.println("move to x: " + x + " and y: " + y);
	}
	
	abstract void draw();
	abstract void resize();
	
}
