package org.kirito.multithreading.unit2.eg_2_2_9.tow;

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

	public synchronized static void printA() {
		try {
			System.out.println("线程名称：" + Thread.currentThread().getName() + " 在" + System.currentTimeMillis()
					+ "进入 printA");
			Thread.sleep(2000);
			System.out.println("线程名称：" + Thread.currentThread().getName() + " 在" + System.currentTimeMillis()
					+ "离开 printA");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public synchronized static void printB() {
		try {
			System.out.println("线程名称：" + Thread.currentThread().getName() + " 在" + System.currentTimeMillis()
					+ "进入 printB");
			Thread.sleep(2000);
			System.out.println("线程名称：" + Thread.currentThread().getName() + " 在" + System.currentTimeMillis()
					+ "离开 printB");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
