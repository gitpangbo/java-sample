package org.kirito.multithreading.until1.eg26;

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
public class MyObject {

	private String username;
	private String password;

	public void setValue(String username, String password) {
		this.username = username;
		if (Thread.currentThread().getName().equals("a")) {
			System.out.println("a线程将永远进入suspend了");
			Thread.currentThread().suspend();
		}
		this.password = password;

	}

	public void printValue() {
		System.out.println(this.username + "：" + this.password);
	}
}
