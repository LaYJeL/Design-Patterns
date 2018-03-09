package StructuralPatterns.Composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * @author Yevhenii R
 * 
 * @date February 21, 2018
 *
 */

public class BankManager implements Employee {

	private String name;
	private double salary;

	public BankManager(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	private List<Employee> employees = new ArrayList<Employee>();

	@Override
	public void add(Employee employee) {
		employees.add(employee);
	}

	@Override
	public Employee getChild(int i) {
		return employees.get(i);
	}

	@Override
	public void remove(Employee employee) {
		employees.remove(employee);
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
		System.out.println("==========================");
		System.out.println("Name = " + getName());
		System.out.println("Salary = " + getSalary());
		System.out.println("==========================");

		Iterator<Employee> it = employees.iterator();

		while (it.hasNext()) {
			Employee employee = it.next();
			employee.print();
		}
	}
}
