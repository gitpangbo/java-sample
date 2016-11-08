package org.kirito.multithreading.unti1.eg13;

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
public class RunMain {

	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(10);
			thread.interrupt();
			System.out.println("是否停止1？" + thread.interrupted());
			System.out.println("是否停止2？" + thread.interrupted());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end");
	}
}
