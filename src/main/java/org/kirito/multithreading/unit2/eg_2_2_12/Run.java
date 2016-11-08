package org.kirito.multithreading.unit2.eg_2_2_12;


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
		try {
			DealThread dealThread = new DealThread();
			dealThread.setFlag("a");
			Thread threadA = new Thread(dealThread);
			threadA.start();
			Thread.sleep(1000);
			dealThread.setFlag("b");
			Thread threadB = new Thread(dealThread);
			threadB.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
