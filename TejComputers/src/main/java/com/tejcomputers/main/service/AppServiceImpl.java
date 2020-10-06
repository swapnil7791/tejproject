package com.tejcomputers.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tejcomputers.main.dao.AppDao;
import com.tejcomputers.main.dao.StudentDao;
import com.tejcomputers.main.dto.StudentRegistrationDto;
import com.tejcomputers.main.model.Admin;
import com.tejcomputers.main.model.StudentRegistration;

@Service
public class AppServiceImpl implements AppService {

	@Autowired
	AppDao dao;
	
	@Autowired
	StudentDao studao;
	
	@Override
	public void save(Admin a) {
		dao.save(a);
		
	}

	@Override
	public Admin getAdmin(String loginid, String password) {
		
		return dao.findByLoginidAndPassword(loginid, password);
	}

	@Override
	public List<StudentRegistrationDto> getStuDto() {
		return dao.getStudentRegistrationDto();
	}

	

	@Override
	public StudentRegistration getStudent(String loginid, String password) {
		return studao.findByLoginidAndPassword(loginid, password);
	}

	@Override
	public StudentRegistration getStudentById(int id) {
		return studao.findById(id).get();
	}

	@Override
	public void saveStudent(StudentRegistration stu) {
		studao.save(stu);
		
	}

}
