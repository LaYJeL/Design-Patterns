package CreationalPatterns.AbstractFactory.Factory;

import CreationalPatterns.AbstractFactory.Color.IColor;
import CreationalPatterns.AbstractFactory.Shape.Circle;
import CreationalPatterns.AbstractFactory.Shape.IShape;
import CreationalPatterns.AbstractFactory.Shape.Rectangle;
import CreationalPatterns.AbstractFactory.Shape.Square;

/**
 * 
 * @author Yevhenii R
 * 
 * @date February 08, 2018
 *
 */

public class ShapeFactory extends AbstractFactory {

	@Override
	public IShape getShape(String shape) {
		
		if (shape.equalsIgnoreCase("rectangle")) {
			return new Rectangle();
		}

		else if (shape.equalsIgnoreCase("circle")) {
			return new Circle();
		} 
		
		else if (shape.equalsIgnoreCase("square")) {
			return new Square();
		}
		
		else return null;
	}

	@Override
	public IColor getColor(String color) {
		return null;
	}

}