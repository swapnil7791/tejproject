package com.tejcomputers.main.service;

import java.util.List;

import com.tejcomputers.main.dto.StudentRegistrationDto;
import com.tejcomputers.main.model.Admin;
import com.tejcomputers.main.model.StudentRegistration;

public interface AppService {

	void save(Admin a);

	Admin getAdmin(String loginid, String password);

	List<StudentRegistrationDto> getStuDto();



	StudentRegistration getStudent(String loginid, String password);

}
