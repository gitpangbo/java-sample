package org.kirito.multithreading.until1.eg20;

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
	private int i = 0;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		try {
			this.stop();
		} catch (ThreadDeath e) {
			// TODO Auto-generated catch block
			System.out.println("run进入catch方法了");
			e.printStackTrace();
		}
	}
}
