package org.kirito.multithreading.unit2.eg_2_2_1;

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
public class Task {
	private String getData1;
	private String getData2;

	public synchronized void doLongTimeTask() {
		// TODO Auto-generated method stub
		try {
			System.out.println("begin task");
			Thread.sleep(1000);
			getData1 = "长时间处理任务后，从远程返回的值 1 threadName = " + Thread.currentThread().getName();
			getData2 = "长时间处理任务后，从远程返回的值 2 threadName = " + Thread.currentThread().getName();
			System.out.println(getData1);
			System.out.println(getData2);
			System.out.println("end task");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
