package CreationalPatterns.Factory;

/**
 * 
 * @author Yevhenii R
 * 
 * @date February 07, 2018
 *
 */

public class DeveloperFactory {

	public IDeveloper createDeveloperFactoryBySpeciality(String developer) {

		if (developer.equalsIgnoreCase("java")) {
			return new JavaDeveloper();
		} 
		
		else if (developer.equalsIgnoreCase("c++")) {
			return new CppDeveloper();
		} 
		
		else
			throw new RuntimeException(developer + "is unknown speciality");

	}

}
