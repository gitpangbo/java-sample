package org.kirito.multithreading.unit2.eg_2_2_9.tow;

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
		Service service1 = new Service();
		Service service2 = new Service();
		MyThreadA threadA = new MyThreadA(service1);
		threadA.setName("A");
		threadA.start();
		MyThreadB threadB = new MyThreadB(service2);
		threadB.setName("B");
		threadB.start();
		
	}
}
