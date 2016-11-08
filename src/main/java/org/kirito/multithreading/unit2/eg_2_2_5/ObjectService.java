package org.kirito.multithreading.unit2.eg_2_2_5;

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
 * @createDate 2016年11月7日
 * @since JDK1.7
 */
public class ObjectService {
	private String getData1;
	private String getData2;

	public void serviceMethodA() {
		// TODO Auto-generated method stub
		try {
			synchronized (this) {
				System.out.println("A begin time = " + System.currentTimeMillis());
				Thread.sleep(2000);
				System.out.println("A end time = " + System.currentTimeMillis());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void serviceMethodB() {
		// TODO Auto-generated method stub
		synchronized (this) {
			System.out.println("B begin time = " + System.currentTimeMillis());
			System.out.println("B end time = " + System.currentTimeMillis());
		}
	}
}
