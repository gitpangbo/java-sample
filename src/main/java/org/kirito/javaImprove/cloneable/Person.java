package org.kirito.javaImprove.cloneable;

public class Person implements Cloneable {
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

	protected Person clone() {
		Person person = null;
		try {
			person = (Person) super.clone();
			person.setEmail(new Email(person.getEmail().getObject(),person.getEmail().getContent()));  
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return person;
	}
}