package com.ecommerce.application.dto;

public class Empl {
	private int empid;
	private String name;
	private int age;
	private String organization;
	private String ctc;
	
	public Empl() {
		super();
	}

	public Empl(int empid, String name, int age, String organization, String ctc, int mobileNuber) {
		super();
		this.empid = empid;
		this.name = name;
		this.age = age;
		this.organization = organization;
		this.ctc = ctc;
		this.mobileNuber = mobileNuber;
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

	public String getCtc() {
		return ctc;
	}

	public void setCtc(String ctc) {
		this.ctc = ctc;
	}

	public int getMobileNuber() {
		return mobileNuber;
	}

	public void setMobileNuber(int mobileNuber) {
		this.mobileNuber = mobileNuber;
	}

	private int mobileNuber;

}


