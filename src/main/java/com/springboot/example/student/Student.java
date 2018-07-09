package com.springboot.example.student;

public class Student {

	private Long id;
	private String name;
	private String passport;
	
	public Student(Long id, String name, String passport) {
		super();
		this.id = id;
		this.name = name;
		this.passport = passport;
	}

	public Student(String name, String passport) {
		super();
		this.name = name;
		this.passport = passport;
	}

	public Student() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassport() {
		return passport;
	}

	public void setPassport(String passport) {
		this.passport = passport;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", passport=" + passport + "]";
	}
	
	
}