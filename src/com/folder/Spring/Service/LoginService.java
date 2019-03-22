package com.folder.Spring.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.folder.Spring.DAO.LoginDAO;
import com.folder.Spring.DTO.LoginDTO;
@Service
public class LoginService {
	@Autowired
	private LoginDAO dao;
	public LoginService() {
System.out.println(this.getClass().getSimpleName()+"created............");
	}
public LoginDTO loginServiceSava(LoginDTO dto) {
	System.out.println("loginservice is started.......");
	LoginDTO dataFromDB=dao.loginDAOSava(dto);
	System.out.println("Login Service is endend");
	return dataFromDB;
}
}
