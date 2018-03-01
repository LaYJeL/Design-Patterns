package CreationalPatterns.AbstractFactory.Factory;

import CreationalPatterns.AbstractFactory.Color.IColor;
import CreationalPatterns.AbstractFactory.Shape.IShape;

/**
 * 
 * @author Yevhenii R
 * 
 * @date February 08, 2018
 *
 */

public abstract class AbstractFactory {
	
	public abstract IShape getShape(String shape);
	
	public abstract IColor getColor(String color);

}
