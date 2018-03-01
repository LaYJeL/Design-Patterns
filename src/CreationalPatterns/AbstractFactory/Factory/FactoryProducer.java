package CreationalPatterns.AbstractFactory.Factory;

/**
 * 
 * @author Yevhenii R
 * 
 * @date February 08, 2018
 *
 */

public class FactoryProducer {
	public static AbstractFactory getFactory(String factoryName) {

		if (factoryName.equalsIgnoreCase("color")) {
			return new ColorFactory();
		}

		else if (factoryName.equalsIgnoreCase("shape")) {
			return new ShapeFactory();
		} 
		
		else return null;
	}

}
