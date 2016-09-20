package org.kirito.multithreading.eg03;

/***
 * Java Lib For MyProject, Powered By Kirito.
 * 
 * @since JDK1.7
 * @version 1.0.0
 * @author pangbo
 * @Description TODO(用一句话描述该文件做什么)
 * @Copyright Copyright (c) 2012-2016
 * @Create 2016年9月14日
 */
public class Test {

	public static void main(String[] args) {
		Runnable runnable = new MyRunnable();
		Thread thread = new Thread(runnable);
		thread.start();
		System.out.println("运行结束");
	}
}
