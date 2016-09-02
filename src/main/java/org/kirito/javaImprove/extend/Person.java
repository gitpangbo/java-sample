package org.kirito.javaImprove.extend;

public class Person {
	protected String name;
	protected int age;
	protected String sex;

	public Person() {
		// super();
		System.out.println("Person Constrctor...");
	}

	Person(String name) {
		System.out.println("Person Constrctor..." + name);
	}

	public void display() {
		System.out.println("Play Person...");
	}

	static void display(Person person) {
		person.display();
	}
}