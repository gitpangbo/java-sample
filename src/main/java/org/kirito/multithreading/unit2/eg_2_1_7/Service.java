package org.kirito.multithreading.unit2.eg_2_1_7;

/***
 * Java Lib For MyProject, Powered By Kirito.
 * <p>
 * -----------------------------------------------------------------------------
 * <p>
 * 
 * @Description TODO(用一句话描述该文件做什么)
 * @Copyright Copyright (c) 2012-2016
 * @version 1.0.0
 * @author pangbo
 * @createDate 2016年11月7日
 * @since JDK1.7
 */
public class Service {

	synchronized public void testMethod() {
		if ("a".equals(Thread.currentThread().getName())) {
			System.out.println("Thread name = " + Thread.currentThread().getName() + " begin time = "
					+ System.currentTimeMillis());
			int i = 1;
			while (1 == i) {
				if ("0.123456".equals(("" + Math.random()).substring(0, 8))) {
					System.out.println("Thread name = " + Thread.currentThread().getName() + " run exceptiontime = "
							+ System.currentTimeMillis());
					Integer.parseInt("a");
				}
			}
		} else {
			System.out.println("Thread B run time = " + System.currentTimeMillis());
		}
	}

}
