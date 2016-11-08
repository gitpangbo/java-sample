package org.kirito.multithreading.unit2.eg_2_2_15;

import org.kirito.multithreading.unit2.eg_2_2_15.OutClass.InnerClass1;
import org.kirito.multithreading.unit2.eg_2_2_15.OutClass.InnerClass2;


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
		final InnerClass1 innerClass1 = new InnerClass1();
		final InnerClass2 innerClass2 = new InnerClass2();

		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				innerClass1.method1(innerClass2);
			}
		}, "A");

		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				innerClass1.method2();
			}
		}, "B");
		
		Thread thread3 = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				innerClass2.method1();
			}
		}, "C");

		thread1.start();
		thread2.start();
		thread3.start();
	}

}
