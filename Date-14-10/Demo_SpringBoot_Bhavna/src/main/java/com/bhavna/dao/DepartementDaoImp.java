package com.bhavna.dao;

import org.springframework.stereotype.Repository;

import com.bhavna.bean.Department;

import com.bhavna.entity.DepartmentEntity;

import org.springframework.beans.factory.annotation.Autowired;

@Repository
public class DepartementDaoImp {
	@Autowired
	private DepartmetDao dao;

	public String addDepartment(Department department) {
		DepartmentEntity departmentEntity = new DepartmentEntity();
		departmentEntity.setdId(department.getdId());
		departmentEntity.setdName(department.getdName());
		departmentEntity.setdHead(department.getdHead());
		dao.save(departmentEntity);
		return "Department Add Sucessfully";

	}

	public Department updateDepartment(Department department) {
		DepartmentEntity departmentEntity = new DepartmentEntity();
		java.util.Optional<DepartmentEntity> departmentEntity1 = dao.findById(department.getdId());
		if (departmentEntity1.isPresent()) {

			departmentEntity = departmentEntity1.get();
			departmentEntity.setdId(department.getdId());
			departmentEntity.setdName(department.getdName());
			departmentEntity.setdHead(department.getdHead());
		} else {
			department = null;
		}
		// System.out.println(departmentEntity1);
		return department;

	}

	public String deleteDepartment(int eId) {
// Converted Bean to Entity
		dao.deleteById(eId);
		return "Deleted Successfully" + eId;
	}

}
