package org.kirito.multithreading.unit2.eg_2_2_3;

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
		Task task = new Task();
		MyThread1 myThread1 = new MyThread1(task);
		myThread1.start();
		MyThread2 myThread2 = new MyThread2(task);
		myThread2.start();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		long beginTime = CommonUtils.beginTime1;
		if(CommonUtils.beginTime2 < CommonUtils.beginTime1){
			beginTime = CommonUtils.beginTime2;
		}
		
		long endTime  = CommonUtils.endTime1;
		if(CommonUtils.endTime2 > CommonUtils.endTime1 ){
			endTime = CommonUtils.endTime2;
		}
		
		System.out.println("耗时：" + (endTime - beginTime) + "ms");
	}
}
