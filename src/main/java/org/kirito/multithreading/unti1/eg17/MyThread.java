package org.kirito.multithreading.unti1.eg17;

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
		try {
			System.out.println("run start");
			Thread.sleep(100000);
			System.out.println("run end");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("在沉睡中被停止，进入catch！	this.isInterrupted()="+this.isInterrupted());
			e.printStackTrace();
		}
	}
}
