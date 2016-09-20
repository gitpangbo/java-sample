package org.kirito.multithreading.eg21;

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
 * @createDate 2016年9月20日
 * @since JDK1.7
 */
public class MyThread extends Thread {
	private SynchronizedObject object;
	
	public MyThread(SynchronizedObject object) {
		// TODO Auto-generated constructor stub
		this.object = object;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		object.printString("b", "bb");
	}
}
