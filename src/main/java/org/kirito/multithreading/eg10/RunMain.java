package org.kirito.multithreading.eg10;

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
public class RunMain {

	public static void main(String[] args) {
		CountOperate c = new CountOperate();
		Thread t = new Thread(c);
		System.out.println("main begin t isAlive="+t.isAlive());
		t.setName("A");
		t.start();
		System.out.println("main end t isAlive="+t.isAlive());
	}

}
