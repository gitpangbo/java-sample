package org.kirito.javaImprove.reflect.eg06;

/**
 * 取得其他类中的父类
 */
class Hello {
	public static void main(String[] args) {
		Class<?> demo = null;
		try {
			demo = Class.forName("org.kirito.javaImprove.reflect.eg06.Person");
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 取得父类
		Class<?> temp = demo.getSuperclass();
		System.out.println("继承的父类为：   " + temp.getName());
	}
}