package StructuralPatterns.Proxy;

/**
 * 
 * @author Yevhenii R
 * 
 * @date March 5, 2018
 *
 */

public class ProjectRunner {
	public static void main(String[] args) {
		Project project = new ProxyProject("https://github.com/LaYJeL/PhoneBook");
		project.run();
	}

}
