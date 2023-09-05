package io.github.abstration;

public class AbstractionDemo {

	public static void main(String[] args) {

		GraphicObject circle = new Circle();
		circle.draw();
		circle.resize();
		circle.moveTo(3, 5);
		
		GraphicObject rectangle = new Rectangle();
		rectangle.draw();
		rectangle.resize();
		rectangle.moveTo(4, 6);

	}

}
