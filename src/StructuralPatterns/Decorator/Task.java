package StructuralPatterns.Decorator;

/**
 * 
 * @author Yevhenii R
 * 
 * @date March 13, 2018
 *
 */

public class Task {
	public static void main(String[] args) {
		Developer developer = new JavaTeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));

		System.out.println(developer.makeJob());

	}
}