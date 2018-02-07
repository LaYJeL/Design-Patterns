package CreationalPatterns.Singleton;

/**
 * 
 * @author Yevhenii R
 * 
 * @date February 07, 2018
 *
 *
 *       This class provides an demonstration of how to use singletons with
 *       enums
 */

public class SingletonMain {
	public static void main(String[] args) {
		
		SingletonEnum singletonEnum = SingletonEnum.INSTANCE;

		singletonEnum.setValue(1);
		System.out.println(singletonEnum.getValue());
		
		singletonEnum.setValue(10);
		System.out.println(singletonEnum.getValue());

	}
}
