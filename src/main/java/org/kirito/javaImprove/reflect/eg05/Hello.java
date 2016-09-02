package org.kirito.javaImprove.reflect.eg05;

/**
 * 返回一个类实现的接口
 */
class Hello {
	public static void main(String[] args) {
		Class<?> demo = null;
		try {
			demo = Class.forName("org.kirito.javaImprove.reflect.eg05.Person");
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 保存所有的接口
		Class<?> intes[] = demo.getInterfaces();
		for (int i = 0; i < intes.length; i++) {
			System.out.println("实现的接口   " + intes[i].getName());
		}
	}
}