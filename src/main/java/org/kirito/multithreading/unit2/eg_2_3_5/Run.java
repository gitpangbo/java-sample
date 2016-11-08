package org.kirito.multithreading.unit2.eg_2_3_5;

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
		// TODO Auto-generated method stub
		AddCountThread countService = new AddCountThread();

		Thread thread1 = new Thread(countService);
		thread1.start();
		Thread thread2 = new Thread(countService);
		thread2.start();
		Thread thread3 = new Thread(countService);
		thread3.start();
		Thread thread4 = new Thread(countService);
		thread4.start();
		Thread thread5 = new Thread(countService);
		thread5.start();
		
	}

}
