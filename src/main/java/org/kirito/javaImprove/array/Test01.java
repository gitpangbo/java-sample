package org.kirito.javaImprove.array;

public class Test01 {
	public static void main(String[] args) {
		int[] array = new int[10];
		System.out.println("array的父类是：" + array.getClass().getSuperclass());
		System.out.println("array的类名是：" + array.getClass().getName());
	}
}