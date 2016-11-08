package org.kirito.multithreading.unit2.eg_2_2_4;

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
public class Task {
	private String getData1;
	private String getData2;

	public void doLongTimeTask() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			System.out.println("nosynchronized threadName = " + Thread.currentThread().getName() + " i = " + (i + 1));
		}
		System.out.println("");
		synchronized (this) {
			for (int i = 0; i < 100; i++) {
				System.out.println("synchronized threadName = " + Thread.currentThread().getName() + " i = "
						+ (i + 1));
			}
		}
	}
}
