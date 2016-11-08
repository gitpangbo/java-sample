package org.kirito.multithreading.unit2.eg_2_3_3;

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
		RunThread runThread = new RunThread();
		runThread.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		runThread.setRunning(false);
		System.out.println("已经赋值 false 了");
	}

}
