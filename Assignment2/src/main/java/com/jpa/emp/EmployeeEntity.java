/*
 * 2)Develop an application using JPA try to insert employee Information
 * (empno,name,designation,sal ..etc) 
	into database and also fetch all the data from the database then display on console

 */

package com.jpa.emp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="empdetails")

public class EmployeeEntity 
{
	@Id
	private int eno;
	private String ename;
	private String des;
	private double sal;
	
	public EmployeeEntity(int empno, String name, String desgination, double sal)
	{
		super();
		this.eno = eno;
		this.ename = ename;
		this.des = des;
		this.sal = sal;
	}
	
	public EmployeeEntity()
	{
		super();
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	
	

	
	

}
