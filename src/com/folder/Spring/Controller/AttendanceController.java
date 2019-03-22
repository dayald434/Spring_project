package com.folder.Spring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.folder.Spring.DTO.AttendanceDTO;
import com.folder.Spring.Service.AttendanceService;
@Controller
@RequestMapping("/")
public class AttendanceController {
	@Autowired
	private AttendanceService service;
	public AttendanceController() {
		System.out.println(this.getClass().getSimpleName() + "created........");
	}
	@RequestMapping(value="/attendance.do", method=RequestMethod.POST)
	public ModelAndView attendanceSavaController(AttendanceDTO dto) {
		service.attendanceSavaService(dto);
		return new ModelAndView("/Attendance.jsp", "dto", "Attendance Save Successfully");
	}

}
