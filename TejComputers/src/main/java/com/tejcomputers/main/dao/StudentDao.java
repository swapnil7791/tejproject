package com.tejcomputers.main.dao;

import org.springframework.data.repository.CrudRepository;

import com.tejcomputers.main.model.StudentRegistration;

public interface StudentDao extends CrudRepository<StudentRegistration,Integer>{
	
	
	
	public StudentRegistration findByLoginidAndPassword(String loginid,String password);

}
