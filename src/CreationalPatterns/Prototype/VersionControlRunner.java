package CreationalPatterns.Prototype;

/**
 * 
 * @author Yevhenii R
 * 
 * @date February 15, 2018
 *
 */

public class VersionControlRunner {
	public static void main(String[] args) {
		Project master = new Project(1,"My Project","SourceCode = sourceCode = new SourceCode();");
		System.out.println(master.toString());
		
		ProjectFactory factory = new ProjectFactory(master);
		Project cloneMaster = factory.cloneProject();
		
		System.out.println("\n=======================================================\n");
		System.out.println(cloneMaster.toString());
	}

}
