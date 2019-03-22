package com.folder.Spring.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.folder.Spring.DAO.AttendanceDAO;
import com.folder.Spring.DTO.AttendanceDTO;
@Service
public class AttendanceService {
	@Autowired
	private AttendanceDAO dao;
	public AttendanceService() {
		System.out.println(this.getClass().getSimpleName() + "created..........");
	}

	public void attendanceSavaService(AttendanceDTO dto) {
		System.out.println("Service is started.............");
		dao.attendanceSavaDAO(dto);
		System.out.println("Service is endded..............");
	}
}
