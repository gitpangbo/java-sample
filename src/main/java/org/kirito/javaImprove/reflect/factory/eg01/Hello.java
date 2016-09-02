package org.kirito.javaImprove.reflect.factory.eg01;

/**
 * 不用反射的工厂模式
 */
class Hello {
	public static void main(String[] a) {
		Fruit f = Factory.getInstance("Orange");
		f.eat();
	}

}