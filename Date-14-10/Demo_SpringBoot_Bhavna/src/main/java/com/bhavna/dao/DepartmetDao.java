package com.bhavna.dao;

import org.springframework.data.repository.CrudRepository;

import com.bhavna.entity.DepartmentEntity;

public interface DepartmetDao extends CrudRepository< DepartmentEntity , Integer> {
	

}
