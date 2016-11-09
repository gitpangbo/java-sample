package org.kirito.multithreading.unit1.eg04;

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
public class MyThread extends Thread {
	private int count = 5;

	public MyThread(String name) {
		// TODO Auto-generated constructor stub
		super();
		this.setName(name);// 设置线程名称
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		while (count > 0) {
			count--;
			System.out.println("由" + Thread.currentThread().getName()
					+ "计算，count=" + this.count);
		}
	}
}
