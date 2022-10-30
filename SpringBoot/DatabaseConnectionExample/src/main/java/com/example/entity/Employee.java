package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  //maps class with table
@Table(name="Employee")

public class Employee 
{
	private int id;
	private String name;
	private String email;
	private long phone;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="eid")
	public int getId() 
	{
		return id;
	}
		public void setId(int id) 
	{
		this.id = id;
	}
	@Column(name="fullname" ,nullable=false)
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	@Column(name="emailaddress", unique=true)
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	@Column(name="phonenumber")
	public long getPhone() 
	{
		return phone;
	}
	public void setPhone(long phone) 
	{
		this.phone = phone;
	}
	
	public Employee(int id, String name, String email, long phone) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	
	public Employee() 
	{
		super();
		
	}
	
	
	
}
