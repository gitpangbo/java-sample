package org.kirito.multithreading.until1.eg27;

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
public class MyThread extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		long startTime = System.currentTimeMillis();
		int count = 0;
		for (int i = 0; i < 50000000; i++) {
			MyThread.yield();
			count = count + (i + 1);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("用时：" + (endTime - startTime) + "ms: count=" + count);
	}
}
