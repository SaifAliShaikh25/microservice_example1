package com.examplemicroservices.department.service.service;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.examplemicroservices.department.service.entity.Department;
import com.examplemicroservices.department.service.repository.DepartmentRepository;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
	
		Logger log = Logger.getLogger(DepartmentService.class.getName());
		log.info("Inside deprtment sve method of Deparrtment Service");
		System.out.println("Department details - ");
		System.out.println(department.toString());
		return departmentRepository.save(department);
	}

	public Department findDepartmentById(Long departmentId) {
		Logger log = Logger.getLogger(DepartmentService.class.getName());
		log.info("Inside deprtment find method of Deparrtment Service");
		System.out.println("Department id - ");
		System.out.println(departmentId);
		return departmentRepository.findByDepartmentId(departmentId);
	}
	
	

}
