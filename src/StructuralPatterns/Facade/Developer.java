package StructuralPatterns.Facade;

/**
 * 
 * @author Yevhenii R
 * 
 * @date February 21, 2018
 *
 */

public class Developer {

	public void doJobBeforeDeadLine(BugTracker bugTracker) {
		if (bugTracker.isActiveSprint()) {
			System.out.println("Developer is solving problems...");
		} else {
			System.out.println("Developer is reading Habrahabr...");
		}
	}

}
