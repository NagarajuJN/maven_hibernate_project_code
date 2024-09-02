package com.nagaraj.HibernateDemo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// Java Beans/POJO --> plan old java object
@Entity
@Table(name="details_of_emp")
public class EmpInfo {
	@Id
	private int eid;
	@Column(name="emp_name")
	private String ename;
	private int age;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "EmpInfo [eid=" + eid + ", ename=" + ename + ", age=" + age + "]";
	}
	

}
