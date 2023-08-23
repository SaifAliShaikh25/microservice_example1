package com.examplemicroservices.user.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examplemicroservices.user.service.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long>{

	public Users findByUserId(Long userId);
}
