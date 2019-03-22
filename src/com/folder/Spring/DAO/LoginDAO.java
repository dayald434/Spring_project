package com.folder.Spring.DAO;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.folder.Spring.DTO.LoginDTO;
@Repository
public class LoginDAO {
	@Autowired
	private SessionFactory factory;
public LoginDAO() {
System.out.println(this.getClass().getSimpleName()+"created.......");
}
public LoginDTO loginDAOSava(LoginDTO dto) {
	System.out.println("Logindao is started............");
	String hql="from LoginAttendance R where R.username=:username and R.password=:password";
	Session session=factory.openSession();
	Query query=session.createQuery(hql);
	query.setParameter("username", dto.getUsername());
	query.setParameter("password", dto.getPassword());
	LoginDTO dataFromDB=(LoginDTO) query.uniqueResult();
	System.out.println("LoginDAO is endend.............");
	return dataFromDB;
}
}
