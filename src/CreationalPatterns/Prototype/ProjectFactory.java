package CreationalPatterns.Prototype;

/**
 * 
 * @author Yevhenii R
 * 
 * @date February 15, 2018
 *
 */

public class ProjectFactory {
	private Project project;

	public ProjectFactory(Project project) {
		this.project = project;
	}

	public void setProject(Project project) {
		this.project = project;
	}
	public Project cloneProject() {
		return (Project) project.copy();
	}

}
