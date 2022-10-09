package com.bhavna.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private int eId;
	private String name;
	private double salary;
	private String cName;
	
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public Employee(int eId, String name, double salary, String cName) {
		super();
		this.eId = eId;
		this.name = name;
		this.salary = salary;
		this.cName = cName;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", name=" + name + ", salary=" + salary + ", cName=" + cName + "]";
	}
	
	

}
