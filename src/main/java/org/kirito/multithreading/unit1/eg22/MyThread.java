package org.kirito.multithreading.unit1.eg22;

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
		while (true) {
			if (this.isInterrupted()) {
				System.out.println("run 线程停止了");
				return;
			}
			System.out.println("timer=" + System.currentTimeMillis());
		}
	}
}
