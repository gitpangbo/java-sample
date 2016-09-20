package org.kirito.multithreading.eg16;

import com.sun.jdi.InternalException;

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
		super.run();
		try {
			for (int i = 0; i < 500000; i++) {
				if (this.interrupted()) {
					System.out.println("当前线程已经是停止状态，我要退出了");
					throw new InternalException();
				}
				System.out.println("i=" + (i + 1));
			}
			System.out.println("我在for下面");
		} catch (Exception e) {
			System.out.println("进入MyThread.java类中的run方法中的catch了");
			e.printStackTrace();
		}
	}
}
