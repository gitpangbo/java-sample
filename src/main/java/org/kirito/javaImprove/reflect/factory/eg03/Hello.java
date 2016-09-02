package org.kirito.javaImprove.reflect.factory.eg03;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * 结合属性文件的工厂模式
 */
class Hello {
	public static void main(String[] a) throws FileNotFoundException,
			IOException {
		Properties pro = Init.getPro();
		Fruit f = Factory.getInstance(pro.getProperty("apple"));
		if (f != null) {
			f.eat();
		}
	}

}