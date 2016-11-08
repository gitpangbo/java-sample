package org.kirito.multithreading.until1.eg28;

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
public class MyThread2 extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("MyThread2 run priority=" + this.getPriority());
		
	}
}
