package org.kirito.javaImprove.reflect.eg08;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/**
 * 获取修饰符
 */
class Hello {
	public static void main(String[] args) {
		Class<?> demo = null;
		try {
			demo = Class.forName("org.kirito.javaImprove.reflect.eg08.Person");
		} catch (Exception e) {
			e.printStackTrace();
		}
		Constructor<?> cons[] = demo.getConstructors();
		for (int i = 0; i < cons.length; i++) {
			Class<?> p[] = cons[i].getParameterTypes();
			System.out.print("构造方法：  ");
			int mo = cons[i].getModifiers();
			System.out.print(Modifier.toString(mo) + " ");
			System.out.print(cons[i].getName());
			System.out.print("(");
			for (int j = 0; j < p.length; ++j) {
				System.out.print(p[j].getName() + " arg" + i);
				if (j < p.length - 1) {
					System.out.print(",");
				}
			}
			System.out.println("){}");
		}
	}
}