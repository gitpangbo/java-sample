package org.kirito.multithreading.unit2.eg_2_2_7.three;

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
		MyList myList = new MyList();
		MyThreadA threadA = new MyThreadA(myList);
		threadA.setName("A");
		threadA.start();
		MyThreadB threadB = new MyThreadB(myList);
		threadB.setName("B");
		threadB.start();
		
	}
}
