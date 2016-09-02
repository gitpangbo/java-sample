package org.kirito.javaImprove.array;

public class Test04 {
	public static void main(String[] args) {
		int[] array = new int[10];
		Class clazz = array.getClass();
		System.out.println(clazz.getDeclaredFields().length);
		System.out.println(clazz.getDeclaredMethods().length);
		System.out.println(clazz.getDeclaredConstructors().length);
		System.out.println(clazz.getDeclaredAnnotations().length);
		System.out.println(clazz.getDeclaredClasses().length);
	}
}