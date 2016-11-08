package org.kirito.multithreading.unit2.eg_2_3_6;

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
			MyService service = new MyService();
			MyThread[] thread = new MyThread[5];
			for (int i = 0; i < thread.length; i++) {
				thread[i] = new MyThread(service);
			}
			for (int i = 0; i < thread.length; i++) {
				thread[i].start();
			}
			Thread.sleep(2000);
			System.out.println(service.aiRef.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
