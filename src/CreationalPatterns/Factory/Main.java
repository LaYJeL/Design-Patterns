package CreationalPatterns.Factory;

/**
 * 
 * @author Yevhenii R
 * 
 * @date February 07, 2018
 *
 */

public class Main {
	public static void main(String[] args) {
		
		DeveloperFactory developerFactory = new DeveloperFactory();
		
		IDeveloper developer = developerFactory.createDeveloperFactoryBySpeciality("java");
		
		developer.writeCode();
		
	}

}
