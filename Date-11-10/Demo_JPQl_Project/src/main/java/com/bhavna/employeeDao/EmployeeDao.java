package com.bhavna.employeeDao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.bhavna.employeeEntity.EmployeeEntity;

public class EmployeeDao {
	public static void addEmployee() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("unit1");
		System.out.println("Database information readed");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EmployeeEntity employee = new EmployeeEntity(103, "Nakul", 777.33, "Chandigarh");
		entityManager.getTransaction().begin();
		entityManager.persist(employee);
		entityManager.getTransaction().commit();
	}

	public static void getAllDetails() {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("unit1");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query query = entityManager.createQuery("Select e from EmployeeEntity e");
		List<EmployeeEntity> list = query.getResultList();
		for (EmployeeEntity emp : list) {
			System.out.println(emp);
		}
	}

	public static void updateEmployee() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("unit1");
		System.out.println("Database information readed");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		/*
		 *  Query query = entityManager //
		 * .createQuery("UPDATE EmployeeEntity e SET e.salary = e.salary + :increment "
		 * + "WHERE e.eId = :eId"); // query.setParameter("increment", 500d); //
		 * query.setParameter("eId", 101);
		 */
		
		
		Query query = entityManager.createQuery("update EmployeeEntity e set e.name='Mohot' where e.eId=101");
		int rowsUpdated = query.executeUpdate();
		System.out.println("entities Updated: " + rowsUpdated);
		entityManager.getTransaction().commit();
		entityManager.close();

	}
	
	public static void getDetailsFromEmployeeTableAsParametarized() {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("unit1");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query query = entityManager.createQuery("Select e.salary from EmployeeEntity e where e.salary>:value");
		query.setParameter("value", 10000d);
		List<EmployeeEntity> list = query.getResultList();
		for (EmployeeEntity emp : list) {
			System.out.println(emp);
		}
	}
	
	public static void getDetailsFromEmployeeTableAsParametarizedWithName() {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("unit1");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query query = entityManager.createQuery("Select e.salary from EmployeeEntity e where e.salary>?1");
		query.setParameter(1, 20000d);
		List<EmployeeEntity> list = query.getResultList();
		for (EmployeeEntity emp : list) {
			System.out.println(emp);
		}
	}
	
	public static void getAllDetailsByName() {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("unit1");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query query = entityManager.createNamedQuery("findAllEmployeeByName");
		List<EmployeeEntity> list = query.getResultList();
		for (EmployeeEntity emp : list) {
			System.out.println(emp);
		}
	}
	
	public static void getAllDetailsByNames() {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("unit1");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query query = entityManager.createNamedQuery("findAllEmployeesByName");
		List<EmployeeEntity> list = query.getResultList();
		for (EmployeeEntity emp : list) {
			System.out.println(emp);
		}
	}
	public static void getAllDetailsById() {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("unit1");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query query = entityManager.createNamedQuery("findAllEmployeesByName");
		List<EmployeeEntity> list = query.getResultList();
		for (EmployeeEntity emp : list) {
			System.out.println(emp);
		}
	}


}
