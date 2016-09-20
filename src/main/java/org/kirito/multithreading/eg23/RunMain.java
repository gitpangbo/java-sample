package org.kirito.multithreading.eg23;

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
public class RunMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(100);
			// A段 暂停线程
			thread.suspend();
			System.out.println("A="+System.currentTimeMillis()+" i="+thread.getI());
			Thread.sleep(100);
			System.out.println("A="+System.currentTimeMillis()+" i="+thread.getI());
			// B段 恢复线程
			thread.resume();
			System.out.println("B="+System.currentTimeMillis()+" i="+thread.getI());
			Thread.sleep(100);
			System.out.println("B="+System.currentTimeMillis()+" i="+thread.getI());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end");
	}

}
