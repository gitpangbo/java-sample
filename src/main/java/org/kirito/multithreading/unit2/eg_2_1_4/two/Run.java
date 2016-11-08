package org.kirito.multithreading.unit2.eg_2_1_4.two;

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
public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyObject object = new MyObject();
		ThreadA threadA = new ThreadA(object);
		threadA.setName("A");
		ThreadB threadB = new ThreadB(object);
		threadB.setName("B");
		threadA.start();
		threadB.start();
	}

}
