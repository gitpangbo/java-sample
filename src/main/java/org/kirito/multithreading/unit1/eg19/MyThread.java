package org.kirito.multithreading.unit1.eg19;

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
			while (true) {
				i++;
				Thread.sleep(1000);
				System.out.println("i=" + i);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("run进入catch！	this.isInterrupted()="
					+ this.isInterrupted());
			e.printStackTrace();
		}
	}
}
