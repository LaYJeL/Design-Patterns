package StructuralPatterns.Decorator;

/**
 * 
 * @author Yevhenii R
 * 
 * @date March 13, 2018
 *
 */

public class JavaDeveloper implements Developer {

	@Override
	public String makeJob() {
		return " Write Java Code. ";
	}
}