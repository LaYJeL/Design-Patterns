package CreationalPatterns.AbstractFactory;

import CreationalPatterns.AbstractFactory.Color.IColor;
import CreationalPatterns.AbstractFactory.Factory.AbstractFactory;
import CreationalPatterns.AbstractFactory.Factory.FactoryProducer;
import CreationalPatterns.AbstractFactory.Shape.IShape;

/**
 * 
 * @author Yevhenii R
 * 
 * @date February 08, 2018
 *
 */

public class Main {
	public static void main(String[] args) {

		AbstractFactory factory = FactoryProducer.getFactory("Shape");

		IShape shape = factory.getShape("rectangle");
		IShape shape1 = factory.getShape("circle");
		IShape shape2 = factory.getShape("square");

		shape.draw();
		shape1.draw();
		shape2.draw();

		System.out.println("*****************************************************");

		AbstractFactory factory1 = FactoryProducer.getFactory("Color");

		IColor color = factory1.getColor("red");
		IColor color1 = factory1.getColor("green");
		IColor color2 = factory1.getColor("blue");

		color.fill();
		color1.fill();
		color2.fill();
	}
}