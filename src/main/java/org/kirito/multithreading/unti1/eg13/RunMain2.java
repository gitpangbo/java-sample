package org.kirito.multithreading.unti1.eg13;

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
 * @createDate 2016年9月14日
 * @since JDK1.7
 */
public class RunMain2 {
	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		thread.interrupt();
		System.out.println("是否停止1？" + thread.interrupted());
		System.out.println("是否停止2？" + thread.interrupted());
		System.out.println("是否停止3？" + thread.interrupted());
		System.out.println("end");
	}
}
