package org.kirito.multithreading.unit1.eg02;

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
		MyThread thread1 = new MyThread(1);
		MyThread thread2 = new MyThread(2);
		MyThread thread3 = new MyThread(3);
		MyThread thread4 = new MyThread(4);
		MyThread thread5 = new MyThread(5);
		MyThread thread6 = new MyThread(6);
		MyThread thread7 = new MyThread(7);
		MyThread thread8 = new MyThread(8);
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		thread6.start();
		thread7.start();
		thread8.start();

	}

}
