package org.kirito.multithreading.unit2.eg_2_1_1;

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
		HasSelfPrivateNum numRef = new HasSelfPrivateNum();
		ThreadA threadA = new ThreadA(numRef);
		threadA.start();
		ThreadB threadB = new ThreadB(numRef);
		threadB.start();
	}

}
