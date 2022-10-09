package com.bhavna.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.bhavna.entity.Employee;

public class EmployeeDao {
	public static void addEmployee() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("unit1");
		System.out.println("Database information readed");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Employee employee = new Employee(102,"Shomit",57.33,"Accenture");
		entityManager.getTransaction().begin();
		entityManager.persist(employee);
		entityManager.getTransaction().commit();
			
	}
	
	public static void updateEmployee() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("unit1");
		System.out.println("Database information readed");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Employee employee = new Employee(102,"Shomit",800,"Bhavna");
		entityManager.getTransaction().begin();
		//entityManager.persist(employee);
		entityManager.merge(employee);
		entityManager.getTransaction().commit();
		entityManager.close();		
	}
	
	public static void deleteEmployee() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("unit1");
		System.out.println("Database information readed");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		Employee employee = entityManager.find(Employee.class, 103);
		if(employee != null) {
			entityManager.remove(employee);
			
		}
		else {
			System.out.println("Record not found");
		}
		
		entityManager.getTransaction().commit();
		entityManager.close();		
	}
	
	public static void selectEmployee() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("unit1");
		System.out.println("Database information readed");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		Employee employee = entityManager.find(Employee.class, 101);
		if(employee != null) {
			System.out.println(employee);
		}
		else {
			System.out.println("Record not found");
		}
		
		entityManager.close();		
	}
}
