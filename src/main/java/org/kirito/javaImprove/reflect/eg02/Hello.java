package org.kirito.javaImprove.reflect.eg02;

/**
 * 实例化Class类对象
 * 所有类的对象其实都是Class的实例
 */
class Hello {
	public static void main(String[] args) {
		Class<?> demo1 = null;
		Class<?> demo2 = null;
		Class<?> demo3 = null;
		try {
			// 一般尽量采用这种形式
			demo1 = Class.forName("org.kirito.javaImprove.reflect.eg02.Demo");
		} catch (Exception e) {
			e.printStackTrace();
		}
		demo2 = new Demo().getClass();
		demo3 = Demo.class;

		System.out.println("类名称   " + demo1.getName());
		System.out.println("类名称   " + demo2.getName());
		System.out.println("类名称   " + demo3.getName());

	}
}