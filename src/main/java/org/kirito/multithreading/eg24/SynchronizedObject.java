package org.kirito.multithreading.eg24;

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
 * @createDate 2016年9月20日
 * @since JDK1.7
 */
public class SynchronizedObject {
	synchronized public void printString() {
		// TODO Auto-generated method stub
		System.out.println("printString begin");
		if(Thread.currentThread().getName().equals("a")){
			System.out.println("a线程永远suspend了");
			Thread.currentThread().suspend();
		}
		System.out.println("printString end");
	}
}
