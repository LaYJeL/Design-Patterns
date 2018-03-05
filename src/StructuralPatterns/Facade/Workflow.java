package StructuralPatterns.Facade;

/**
 * 
 * @author Yevhenii R
 * 
 * @date February 21, 2018
 *
 */

public class Workflow {
	Developer developer = new Developer();
	Job job = new Job();
	BugTracker bugTracker = new BugTracker();

	public void solveProblems() {
		job.doJob();
		bugTracker.startSprint();
		developer.doJobBeforeDeadLine(bugTracker);
	}

}
