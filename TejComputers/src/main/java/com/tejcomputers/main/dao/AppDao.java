package com.tejcomputers.main.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tejcomputers.main.dto.StudentRegistrationDto;
import com.tejcomputers.main.model.Admin;
import com.tejcomputers.main.model.StudentRegistration;

@Repository
public interface AppDao extends JpaRepository<Admin, Integer>{
	
	public Admin findByLoginidAndPassword(String Loginid,String password);
	
	
	@Query("select new com.tejcomputers.main.dto.StudentRegistrationDto(s.id,s.firstname,s.middlename,s.lastname,s.adharnumber,s.whatsappnumber,s.emailid,s.loginid,s.password,s.feesPaid) from StudentRegistration s INNER JOIN s.admin a")
	public List<StudentRegistrationDto> getStudentRegistrationDto();
	
	
	public String findByLoginid(String loginid);
	
	public String findByPassword(String password);
	
	@Query("select new com.tejcomputers.main.dto.StudentRegistrationDto2(s.loginid,s.password) from StudentRegistration s INNER JOIN s.admin a")
	public StudentRegistration getStuLoginid();
	
	
	
	
	
	

}
