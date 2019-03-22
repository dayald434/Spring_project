package com.folder.Spring.DAO;

import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.folder.Spring.DTO.AttendanceDTO;
@Repository
public class AttendanceDAO {
	@Autowired
	private SessionFactory factory;
	public AttendanceDAO() {
		System.out.println(this.getClass().getSimpleName() + "created........");
	}

	public void attendanceSavaDAO(AttendanceDTO dto) {
		System.out.println("DAO is started............");
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		try {
			session.save(dto);
			transaction.commit();
		} catch (HibernateException he) {
			he.printStackTrace();
		}
			finally {
				session.close();
			}
		System.out.println("DAO is enddate............");
	}
}
