package org.kirito.javaImprove.extend;

public class Husband extends Person {
	private String name;
	//private Wife wife;

	Husband(String name) {
		super("Kirito");
		System.out.println("Husband Constructor..."+name);
	}

	public static void main(String[] args) {
		Husband husband = new Husband("Kirito");
//		husband.age = 22;
//		System.out.println(husband.age);
		
		Person.display(husband);      //向上转型  
	}
}