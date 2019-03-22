package com.folder.Spring.DTO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name ="Satsang_Attendance_sava")
public class AttendanceDTO implements Serializable {
	@Id
	@GenericGenerator(name = "incr", strategy ="increment")
	@GeneratedValue(generator = "incr")
	@Column(name = "Id")
	public int id;
	@Column(name = "First_Name")
	public String fname;
	@Column(name = "Last_Name")
	public String lname;
	@Column(name = "SKSR")
	public String sksr;
	@Column(name = "Pathi")
	public String pathi;
	@Column(name = "Shabed")
	public String shabad;
	@Column(name = "Saint")
	public String saint;
	@Column(name = "Book")
	public String book;
	@Column(name = "Date")
	public String date;
	@Column(name = "Children")
	public String children;
	@Column(name = "Two_Wheeler")
	public String two_wheeler;
	@Column(name = "Four_Wheeler")
	public String four_wheeler;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getSksr() {
		return sksr;
	}

	public void setSksr(String sksr) {
		this.sksr = sksr;
	}

	public String getPathi() {
		return pathi;
	}

	public void setPathi(String pathi) {
		this.pathi = pathi;
	}

	public String getShabad() {
		return shabad;
	}

	public void setShabad(String shabad) {
		this.shabad = shabad;
	}

	public String getSaint() {
		return saint;
	}

	public void setSaint(String saint) {
		this.saint = saint;
	}

	public String getBook() {
		return book;
	}

	public void setBook(String book) {
		this.book = book;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getChildren() {
		return children;
	}

	public void setChildren(String children) {
		this.children = children;
	}

	public String getTwo_wheeler() {
		return two_wheeler;
	}

	public void setTwo_wheeler(String two_wheeler) {
		this.two_wheeler = two_wheeler;
	}

	public String getFour_wheeler() {
		return four_wheeler;
	}

	public void setFour_wheeler(String four_wheeler) {
		this.four_wheeler = four_wheeler;
	}

	@Override
	public String toString() {
		return "AttendanceDTO [id=" + id + ", fname=" + fname + ", lname=" + lname + ", sksr=" + sksr + ", pathi="
				+ pathi + ", shabad=" + shabad + ", saint=" + saint + ", book=" + book + ", date=" + date
				+ ", children=" + children + ", two_wheeler=" + two_wheeler + ", four_wheeler=" + four_wheeler + "]";
	}

}
