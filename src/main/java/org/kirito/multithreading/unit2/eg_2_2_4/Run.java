package org.kirito.multithreading.unit2.eg_2_2_4;

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
public class Run {

	public static void main(String[] args) {
		Task task = new Task();
		MyThread1 myThread1 = new MyThread1(task);
		myThread1.start();
		MyThread2 myThread2 = new MyThread2(task);
		myThread2.start();
	}
}
