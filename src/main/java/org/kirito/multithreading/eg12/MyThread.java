package org.kirito.multithreading.eg12;

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
 * @createDate 2016年9月14日
 * @since JDK1.7
 */
public class MyThread extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 5000000; i++) {
			if (i % 10000 == 0)
				System.out.println("i=" + (i + 1));
		}
		long endTime = System.currentTimeMillis();
		System.out.println((endTime - startTime) + "ms");
	}
}
