package org.kirito.multithreading.unit2.eg_2_2_7.tow;

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
public class Service {
	private String anyString = new String();

	public void a() {
		// TODO Auto-generated method stub
		try {
			synchronized (anyString) {
				System.out.println("a begin");
				Thread.sleep(2000);
				System.out.println("a end");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public synchronized void b() {
		// TODO Auto-generated method stub
		System.out.println("b begin");
		System.out.println("b end");
	}

}
