package StructuralPatterns.Composite;

/**
 * 
 * @author Yevhenii R
 * 
 * @date February 21, 2018
 *
 */

public interface Employee {

	public String getName();

	public double getSalary();

	public void print();

	public void add(Employee employee);

	public void remove(Employee employee);

	public Employee getChild(int i);
}
