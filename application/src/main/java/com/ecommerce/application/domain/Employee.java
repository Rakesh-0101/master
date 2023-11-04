package com.ecommerce.application.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@Column(name = "empid")
	private int empid;
	@Column(name = "name")
	private String name;
	@Column(name = "age")
	private int age;
	@Column(name = "organization")
	private String organization;
	@Column(name = "ctc")
	private int ctc;

	public Employee() {
		super();
	}

	public Employee(int empid, String name, int age, String organization, int ctc ) {
		super();
		this.empid = empid;
		this.name = name;
		this.age = age;
		this.organization = organization;
		this.ctc = ctc;
		
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public int getCtc() {
		return ctc;
	}

	public void setCtc(int ctc) {
		this.ctc = ctc;
	}

	


}
