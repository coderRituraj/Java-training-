package com.bhavna.controller;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bhavna.bean.Department;
import com.bhavna.dao.DepartementDaoImp;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class DepartmentController {
	@Autowired
	DepartementDaoImp dao;
	// Create method

	@RequestMapping(value = "/createDepartment", method = RequestMethod.POST)
	public String createDepartment(@RequestBody Department department) {

		return dao.addDepartment(department);
	}
	
	//update method
	
	@RequestMapping(value="/updateDepartment", method = RequestMethod.PUT)
	public String updateDepartment(@RequestBody Department department ) {
		return dao.addDepartment(department);
	}
	//Delete method
	@RequestMapping(value="/deleteDepartment", method = RequestMethod.DELETE)
	public String deleteDepartment(@RequestBody int dId) {
		return dao.deleteDepartment(dId);
	}

	@RequestMapping(value = "/display", method = RequestMethod.GET)
	public String display() {
		return "In display";
	}

}
