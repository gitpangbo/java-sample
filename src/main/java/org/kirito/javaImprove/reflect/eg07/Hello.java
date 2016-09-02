package org.kirito.javaImprove.reflect.eg07;

import java.lang.reflect.Constructor;
/**
 * 获得其他类中的全部构造函数
 */
class Hello {
	public static void main(String[] args) {
		Class<?> demo = null;
		try {
			demo = Class.forName("org.kirito.javaImprove.reflect.eg07.Person");
		} catch (Exception e) {
			e.printStackTrace();
		}
		Constructor<?> cons[] = demo.getConstructors();
		for (int i = 0; i < cons.length; i++) {
			System.out.println("构造方法：  " + cons[i]);
		}
	}
}