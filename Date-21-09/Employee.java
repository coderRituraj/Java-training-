package com.bhavna.Task1.StreamApi;

import java.util.concurrent.Callable;

/*
 * Write program to having list of Emplyee (eId, name,salary) object and
1.obtain list of employees having name ends with "m"

2.Obtain list employees in sorted order of name
3. obtain list of employees in descending order of salary

4. Obtain total salary paid on employees
5. obtain maximum  and minimum salary paid

6. Count total number of employees having salary greater than 70k
USE STREAM API
 */

public class Employee implements Comparable<Employee> {
	private int eId;
	private String name;
	private int salary;

	protected int geteId() {
		return eId;
	}

	protected void seteId(int eId) {
		this.eId = eId;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected int getSalary() {
		return salary;
	}

	protected void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee(int eId, String name, int salary) {
		super();
		this.eId = eId;
		this.name = name;
		this.salary = salary;
	}

	public String toString() {
		return eId + " " + name + " " + salary;
	}

	public int compareTo(Employee obj) {
		return this.name.compareTo(obj.name);
	}

}
