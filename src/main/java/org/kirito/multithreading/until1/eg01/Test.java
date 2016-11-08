package org.kirito.multithreading.until1.eg01;

/***
 * Java Lib For MyProject, Powered By Kirito.
 * 
 * @version 1.0.0
 * @author pangbo
 * @Description TODO(用一句话描述该文件做什么)
 * @Copyright Copyright (c) 2012-2016
 * @Create 2016年9月14日
 */
public class Test {
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.setName("myThread");
		// thread.start();
		thread.run();

		try {
			for (int i = 0; i < 10; i++) {
				int time = (int) Math.random() * 1000;
				Thread.sleep(time);
				System.out.println("main=" + Thread.currentThread().getName());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
