package StructuralPatterns.Facade;

/**
 * 
 * @author Yevhenii R
 * 
 * @date February 21, 2018
 *
 */

public class BugTracker {
	private boolean activeSprint;

	public boolean isActiveSprint() {
		return activeSprint;
	}

	public void startSprint() {
		System.out.println("Sprint is active");
		activeSprint = true;
	}

	public void finishSprint() {
		System.out.println("Sprint is not active");
		activeSprint = false;
	}
}
