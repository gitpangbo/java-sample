package org.kirito.multithreading.unit1.eg09;

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
		MyThread myThread = new MyThread();
		try {
			System.out.println("start="+myThread.isAlive());
			myThread.start();
			Thread.sleep(1000);
			System.out.println("end="+myThread.isAlive());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
