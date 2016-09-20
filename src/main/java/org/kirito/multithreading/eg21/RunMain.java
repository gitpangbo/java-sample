package org.kirito.multithreading.eg21;

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
 * @createDate 2016年9月20日
 * @since JDK1.7
 */
public class RunMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			SynchronizedObject object = new SynchronizedObject();
			MyThread thread = new MyThread(object);
			thread.start();
			Thread.sleep(1000);
			thread.stop();
			System.out.println(object.getUsername() + ":"
					+ object.getPassword());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("main end");

	}

}
