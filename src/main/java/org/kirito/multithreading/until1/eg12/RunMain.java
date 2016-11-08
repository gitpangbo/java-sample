package org.kirito.multithreading.until1.eg12;

/***
 * Java Lib For MyProject, Powered By Kirito.
 * <p>
 * -----------------------------------------------------------------------------
 * <p>
 * @Description TODO(用一句话描述该文件做什么)
 * @Copyright Copyright (c) 2012-2016
 * @version	1.0.0
 * @author pangbo
 * @createDate 2016年9月14日
 * @since JDK1.7
 */
public class RunMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(10);
			thread.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("main catch");
			e.printStackTrace();
		}
	}

}
