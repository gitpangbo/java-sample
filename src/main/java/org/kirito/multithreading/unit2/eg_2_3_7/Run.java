package org.kirito.multithreading.unit2.eg_2_3_7;

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
		try {
			Service service = new Service();
			MyThreadA threadA = new MyThreadA(service);
			threadA.start();
			Thread.sleep(2000);
			MyThreadB threadB = new MyThreadB(service);
			threadB.start();
			System.out.println("已经发起停止的命令了");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
