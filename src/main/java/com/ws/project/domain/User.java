package com.ws.project.domain;

import org.springframework.stereotype.Component;

/**
 * User domain object
 * 
 * @author alain busokoza
 *
 */
@Component
public class User {
	
	private String firstName;
	private String lastName;
	private String occupation;
	private int age;
	private int ssn;
	
	/**
	 * Constructor
	 * @param firstName
	 * @param lastName
	 * @param occupation
	 * @param age
	 */
	public User(String firstName, String lastName, String occupation, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.occupation = occupation;
		this.age = age;
	} 
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
}
