package com.bhavna.employeeEntity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
//@NamedQuery(
//		name = "findAllEmployeeByName",
//		query="select e From EmployeeEntity e"
//		)
//@NamedQueries({
//		@NamedQuery(name="showName",query="select e.name from EmployeeEntity e"),
//		@NamedQuery(name="showid",query="select e.id from EmployeeEntity e")
//		
//})

@NamedQueries(
        {
        @NamedQuery(name="findAllEmployeesByName",query="select e FROM EmployeeEntity e WHERE e.name='Ankur'"),
        @NamedQuery(name="findEmployeesWithSalaryOver50",query="select e FROM EmployeeEntity e WHERE e.salary>50")
        }
)

public class EmployeeEntity {
	@Id
	private int eId;
	private String name;
	private double salary;
	private String adrress;
	@Override
	public String toString() {
		return "EmployeeEntity [eId=" + eId + ", name=" + name + ", salary=" + salary + ", adrress=" + adrress + "]";
	}
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
	public String getAdrress() {
		return adrress;
	}
	public void setAdrress(String adrress) {
		this.adrress = adrress;
	}
	public EmployeeEntity(int eId, String name, double salary, String adrress) {
		super();
		this.eId = eId;
		this.name = name;
		this.salary = salary;
		this.adrress = adrress;
	}
	
	public EmployeeEntity() {
		
	}
	

}
