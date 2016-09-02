package org.kirito.javaImprove.serializable;

import java.io.Serializable;

public class Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7244717149812434471L;

	/** 姓名 **/
	private String name;

	/** 电子邮件 **/
	private Email email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}

	public Person(String name, Email email) {
		this.name = name;
		this.email = email;
	}

	public Person(String name) {
		this.name = name;
	}

}