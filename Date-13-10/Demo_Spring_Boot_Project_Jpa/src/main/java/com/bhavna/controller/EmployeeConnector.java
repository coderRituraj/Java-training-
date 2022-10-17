package com.bhavna.controller;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bhavna.dao.EmployeeDao;
import com.bhavna.entity.Employee;

@RestController
public class EmployeeConnector {
//	 @RequestMapping(value="/display", method=RequestMethod.GET)
//	    public String display() {
//	        return "In display";
//	    }
	    
	    @RequestMapping(value="/getEmployee", method=RequestMethod.GET)
	    public List<Employee> getEmployee() {
	        return EmployeeDao.getAllEmployee();
	    }
	    
	    @RequestMapping(value="/getEmployeeByid/{id}",method=RequestMethod.GET)
	    public Employee generateEmployeebyId(@PathVariable("id") int id) {
	        EmployeeDao obj=new EmployeeDao();
	        Employee emp=obj.generateEmployeeById(id);
	        return emp;
	        
	    }
	    
	    @GetMapping
	    public String mappingDemo() {
	        return "In Mapping demo";
	    }
	    
	    @PostMapping("/addEmployee")
	    public String addEmployee() {
	        //EmployeeDao obj=new EmployeeDao();
	        Employee e=new Employee(109,"Rahul",87);
	        return EmployeeDao.addEmployee(e);
	    }



}
