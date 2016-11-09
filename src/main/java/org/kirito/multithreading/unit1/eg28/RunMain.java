package org.kirito.multithreading.unit1.eg28;

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
 * @createDate 2016年9月18日
 * @since JDK1.7
 */
public class RunMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main thread begin priority="+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(6);
		MyThread1 thread1 = new MyThread1();
		thread1.start();
		System.out.println("main thread end priority="+Thread.currentThread().getPriority());
	}

}
