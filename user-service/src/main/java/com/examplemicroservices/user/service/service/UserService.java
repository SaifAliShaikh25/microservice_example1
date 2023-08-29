package com.examplemicroservices.user.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.examplemicroservices.user.service.VO.Department;
import com.examplemicroservices.user.service.VO.ResponseTemplateVO;
import com.examplemicroservices.user.service.customexception.MyCustomException;
import com.examplemicroservices.user.service.entity.Users;
import com.examplemicroservices.user.service.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RestTemplate restTemplate;
	public Users saveUser(Users user) {
	
		return userRepository.save(user);
	}

	public ResponseTemplateVO getUserWithDepartment(Long userId) {
		ResponseTemplateVO vo = new ResponseTemplateVO();
		Users user = userRepository.findByUserId(userId);
		System.out.println("Department details inside ResponseTemplateVO - ");
		Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" + user.getDepartmentId(), Department.class);
		// Department department = restTemplate.getForObject("http://localhost:9001/departments/" + user.getDepartmentId(), Department.class);
	if(department == null)
		throw new MyCustomException("Custom exception raised.");
		System.out.println("Department details - "+department.toString());
		vo.setUser(user);
		vo.setDepartment(department);
		
		return vo;
	}
}
