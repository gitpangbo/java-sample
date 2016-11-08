package org.kirito.multithreading.unit2.eg_2_3_4;

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
		MyThread[] thread = new MyThread[100];
		for (int i = 0; i < thread.length; i++) {
			thread[i] = new MyThread();
		}
		
		for (int i = 0; i < thread.length; i++) {
			thread[i].start();
		}
	}

}
