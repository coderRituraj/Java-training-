package com.bhavna.Task1.StreamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeLogic {
	List<Employee> emplyobj = new ArrayList<Employee>();

	public void addEmpolye() {
		Employee emp1 = new Employee(1, "Munim", 70);
		Employee emp2 = new Employee(2, "Krishna", 80);
		Employee emp3 = new Employee(3, "Mudim", 60);
		Employee emp4 = new Employee(4, "Tom", 75);
		Employee emp5 = new Employee(5, "Geeta", 77);
		Employee emp6 = new Employee(6, "mahek", 81);

		// List<Employee> emplyobj = new ArrayList<Employee>();
		emplyobj.add(emp1);
		emplyobj.add(emp2);
		emplyobj.add(emp3);
		emplyobj.add(emp4);
		emplyobj.add(emp5);
		emplyobj.add(emp6);

	}

	public void displayFilter() {
		List<Employee> fltrobj = emplyobj.stream().filter(em -> em.getName().endsWith("m"))
				.collect(Collectors.toList());

		System.out.println(fltrobj);
	}

	public void displaySort() {
		List<Employee> sort = emplyobj.stream().sorted().collect(Collectors.toList());
		System.out.println(sort);
	}

	public void displaySalarySort() {
		System.out.println("List of Employee sorted by descending order of salary");
		emplyobj.stream().sorted(Comparator.reverseOrder()).forEach(item -> System.out.println(item));
	}

	public void displaySalaryMax() {
		Optional<Employee> maxSalaryEmp = emplyobj.stream()
				.collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
		System.out.println(
				"Employee with max salary:" + (maxSalaryEmp.isPresent() ? maxSalaryEmp.get() : "Not Applicable"));

	}

	public void displayMinSalary() {
		Optional<Employee> minSalEmp = emplyobj.stream()
				.collect(Collectors.minBy(Comparator.comparing(Employee::getSalary)));
		System.out.println("Employee with min Salary:" + (minSalEmp.isPresent() ? minSalEmp.get() : "Not Applicable"));
	}

	public void displayTotalSalary() {
		Integer totalSal = emplyobj.stream().collect(Collectors.summingInt(Employee::getSalary));
		System.out.println("Total Salary paid: " + totalSal);

	}

	public void displayAbove70k() {
		List<Employee> l1 = emplyobj.stream().filter(E -> E.getSalary() > 70).collect(Collectors.toList());
		System.out.println("Total number of employees having salary greater than 70k: " + l1.size());

	}

}
