package com.fashionFrontend2.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.fashionBackend.dao.UserDetailDAO;
import com.fashionBackend.model.UserDetail;

@Controller
public class InsertUserController 
{
	
	@Autowired
	UserDetailDAO userDetailDAO;
	
	@RequestMapping(value="/insertUser",method=RequestMethod.POST)
	public String insertCategory(@RequestParam("uName")String userName,@RequestParam("uPass")String upass,@RequestParam("ucName")String ucname,@RequestParam("uAdd")String uadd,@RequestParam("uEID")String ueid,@RequestParam("uPhNo")String uphno,Model m)
	{
		UserDetail user=new UserDetail();
		user.setUsername(userName);
		user.setPassword(upass);
		user.setCustomerName(ucname);;
		user.setAddress(uadd);
		user.setEmailId(ueid);
		user.setPhoneNo(uphno);;
		user.setRole("ROLE_USER");
		user.setEnabled(true);
		userDetailDAO.addUserDetail(user);
				
		return "UserDetail";
	}
	
	
}
