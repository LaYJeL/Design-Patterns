package CreationalPatterns.AbstractFactory.Factory;

import CreationalPatterns.AbstractFactory.Color.Blue;
import CreationalPatterns.AbstractFactory.Color.Green;
import CreationalPatterns.AbstractFactory.Color.IColor;
import CreationalPatterns.AbstractFactory.Color.Red;
import CreationalPatterns.AbstractFactory.Shape.IShape;

/**
 * 
 * @author Yevhenii R
 * 
 * @date February 08, 2018
 *
 */

public class ColorFactory extends AbstractFactory {

	@Override
	public IColor getColor(String color) {
		
		if (color.equalsIgnoreCase("red")) {
			return new Red();
		}

		else if (color.equalsIgnoreCase("blue")) {
			return new Blue();
		} 
		
		else if (color.equalsIgnoreCase("green")) {
			return new Green();
		}
		
		else return null;
	}

	@Override
	public IShape getShape(String shape) {
		return null;
	}

}