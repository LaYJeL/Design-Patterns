package StructuralPatterns.Composite;

/**
 * 
 * @author Yevhenii R
 * 
 * @date February 21, 2018
 *
 */

public class Accountant implements Employee {
	/*
	 * In this class,there are many methods which are not applicable to cashier
	 * because it is a leaf node.
	 */
	private String name;
	private double salary;

	public Accountant(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public void add(Employee employee) {
		// this is leaf node so this method is not applicable to this class.
	}

	@Override
	public Employee getChild(int i) {
		// this is leaf node so this method is not applicable to this class.
		return null;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double getSalary() {
		return salary;
	}

	@Override
	public void print() {
		System.out.println("=========================");
		System.out.println("Name = " + getName());
		System.out.println("Salary = " + getSalary());
		System.out.println("=========================");
	}

	@Override
	public void remove(Employee employee) {
		// this is leaf node so this method is not applicable to this class.
	}
}
