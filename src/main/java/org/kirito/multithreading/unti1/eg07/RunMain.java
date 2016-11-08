package org.kirito.multithreading.unti1.eg07;

/***
 * Java Lib For MyProject, Powered By Kirito.
 * 
 * @since	JDK1.7
 * @version 1.0.0
 * @author pangbo
 * @Description TODO(用一句话描述该文件做什么)
 * @Copyright Copyright (c) 2012-2016
 * @Create 2016年9月14日
 */
public class RunMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread myThread = new MyThread();
		Thread t1 = new Thread(myThread);
		Thread t2 = new Thread(myThread);
		Thread t3 = new Thread(myThread);
		Thread t4 = new Thread(myThread);
		Thread t5 = new Thread(myThread);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}
