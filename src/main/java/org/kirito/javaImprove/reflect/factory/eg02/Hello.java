package org.kirito.javaImprove.reflect.factory.eg02;

/**
 * 利用反射机制的工厂模式
 */
class Hello {
	public static void main(String[] a) {
		Fruit f = Factory.getInstance("org.kirito.javaImprove.reflect.factory.eg02.Apple");
		if (f != null) {
			f.eat();
		}
	}

}