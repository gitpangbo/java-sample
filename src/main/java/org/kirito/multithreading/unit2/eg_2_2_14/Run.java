package org.kirito.multithreading.unit2.eg_2_2_14;

import org.kirito.multithreading.unit2.eg_2_2_14.OutClass.Inner;

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
 * @createDate 2016年11月8日
 * @since JDK1.7
 */
public class Run {

	public static void main(String[] args) {
		final Inner inner = new Inner();

		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				inner.method1();
			}
		}, "A");

		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				inner.method2();
			}
		}, "B");

		thread1.start();
		thread2.start();
	}

}
