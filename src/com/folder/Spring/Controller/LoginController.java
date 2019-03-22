package com.folder.Spring.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.folder.Spring.DTO.LoginDTO;
import com.folder.Spring.Service.LoginService;
@Controller
@RequestMapping("/")
public class LoginController {
	@Autowired
	private LoginService service;
public LoginController() {
System.out.println(this.getClass().getSimpleName()+"created........");
}
@RequestMapping(value="/login.do",method=RequestMethod.POST)
public ModelAndView loginControllerSava(LoginDTO dto, HttpServletRequest request) {
	HttpSession session=request.getSession();
	LoginDTO dataFromDB=service.loginServiceSava(dto);
	if(dataFromDB!=null) {
	return new ModelAndView("Success.jsp","dto",dto);
	}else
	{
		return new ModelAndView("/Login.jsp","nmsg","Invalid Usename/Password");
	}
}
}
