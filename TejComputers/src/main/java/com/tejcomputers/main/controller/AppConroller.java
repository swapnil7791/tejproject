package com.tejcomputers.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tejcomputers.main.dto.StudentRegistrationDto;
import com.tejcomputers.main.model.Admin;
import com.tejcomputers.main.model.StudentCredential;
import com.tejcomputers.main.model.StudentRegistration;
import com.tejcomputers.main.service.AppService;

@CrossOrigin("*")
@RestController
@RequestMapping("/tejcomputer")
public class AppConroller {

	@Autowired
	AppService appservice;

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ResponseEntity<Object> toRegister(@RequestBody Admin a) {

		StudentCredential scrd = new StudentCredential();

		StudentRegistration stu = new StudentRegistration();
		Admin a1 = new Admin();
		for (StudentRegistration s : a.getStudentregistration()) {

			stu.setFirstname(s.getFirstname());
			stu.setLastname(s.getLastname());
			stu.setMiddlename(s.getMiddlename());
			stu.setAdharnumber(s.getAdharnumber());
			stu.setWhatsappnumber(s.getWhatsappnumber());
			stu.setEmailid(s.getEmailid());
			stu.setFeesPaid("no");
			
			scrd.setStuloginid(s.getEmailid());// new change setting login id and password of student in student
				// credentials
			
			String sno=String.valueOf(s.getWhatsappnumber());
			
			scrd.setStupassword(s.getFirstname().substring(0, 2)+sno.substring(sno.length()-2));
			a1.setStudentCredential(scrd);
			stu.setLoginid(a1.getStudentCredential().getStuloginid());
			stu.setPassword(a1.getStudentCredential().getStupassword());
		}

		a1.setAdminid(a.getAdminid());
		a1.setFirstname(a.getFirstname());
		a1.setLastname(a.getLastname());
		a1.setMiddlename(a.getMiddlename());
		a1.setAdharnumber(a.getAdharnumber());
		a1.setWhatsappnumber(a.getWhatsappnumber());
		a1.setLoginid(a.getLoginid());
		a1.setPassword(a.getPassword());
		a1.setEmailid(a.getEmailid());

		a1.getStudentregistration().add(stu);
		stu.setAdmin(a1);
		appservice.save(a1);

		return new ResponseEntity<Object>(HttpStatus.OK);
	}

	
	@RequestMapping(value="login/{loginid}/{password}",method = RequestMethod.GET)
	public String login(@PathVariable("loginid")String loginid,@PathVariable("password")String password) {
		
		Admin a=appservice.getAdmin(loginid,password);
		StudentRegistration stu=appservice.getStudent(loginid,password);
		if(a!=null) {
			
			return a.getFirstname();
		}else if(stu!=null){
			
			return stu.getFirstname();
		}else {
			
			return "not matches";
		}
		
	
	}
	
	
	@RequestMapping(value="/getAllStudent",method = RequestMethod.GET)
	public List<StudentRegistrationDto> getAllStudent(){
		
		List<StudentRegistrationDto> sdto=appservice.getStuDto();

		return sdto;
	}
	
	
	

	
	
	

	
}
