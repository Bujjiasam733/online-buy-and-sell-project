package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class User {
	
	@Id
	@Column
	private int userid;
	
	@Column
	private String firstname;
	
	@Column
	private String lastname;
	
	@Column
	private long contact;
	
	@Column
	private String email;
	
	@Column
	private long password;
	
	public User(int userid, String firstname, String lastname, long contact, String email, long password) {
		super();
		this.userid = userid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.contact = contact;
		this.email = email;
		this.password = password;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPassword() {
		return password;
	}
	public void setPassword(long password) {
		this.password = password;
	}
	
	public User() {
		// TODO Auto-generated constructor stub
	}

}
