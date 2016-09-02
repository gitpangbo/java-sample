package org.kirito.javaImprove.reflect.eg13;

import java.lang.reflect.Field;

/**
 * 通过反射操作属性
 */
class Hello {
	public static void main(String[] args) throws Exception {
		Class<?> demo = null;
		Object obj = null;

		demo = Class.forName("org.kirito.javaImprove.reflect.eg13.Person");
		obj = demo.newInstance();

		Field field = demo.getDeclaredField("sex");
		field.setAccessible(true);
		field.set(obj, "男");
		System.out.println(field.get(obj));
	}
}// end class