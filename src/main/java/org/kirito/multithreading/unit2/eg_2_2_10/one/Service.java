package org.kirito.multithreading.unit2.eg_2_2_10.one;

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

	public static void print(String stringParam) {
		try {
			synchronized (stringParam) {
				while (true) {
					System.out.println("线程名称：" + Thread.currentThread().getName() + " 时间" + System.currentTimeMillis());
					Thread.sleep(2000);
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
