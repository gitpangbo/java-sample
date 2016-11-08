package org.kirito.multithreading.unit2.eg_2_1_4.two;

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
public class MyObject {

	synchronized public void methodA() {
		try {
			System.out.println("begin methodA threadName = " + Thread.currentThread().getName());
			Thread.sleep(5000);
			System.out.println("end endTime = " + System.currentTimeMillis());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	synchronized public void methodB() {
		try {
			System.out.println("begin methodB threadName = " + Thread.currentThread().getName() + " begin time = "
					+ System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("end");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
