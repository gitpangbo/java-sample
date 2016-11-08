package org.kirito.multithreading.unit2.eg_2_3_4;

import org.apache.commons.lang.Validate;

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
public class MyThread extends Thread {

	public static int count;

	synchronized private static void addCount() {
		for (int i = 0; i < 100; i++) {
			count++;
		}
		System.out.println("count = " + count);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		addCount();
	}
}
