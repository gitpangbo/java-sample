package org.kirito.multithreading.unit2.eg_2_1_8;

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
public class Sub extends Main {
	@Override
	synchronized public void serviceMethod() {
		// TODO Auto-generated method stub
		try {
			System.out.println("int sub next sleep begin thread name = " + Thread.currentThread().getName() + " time"
					+ System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("int sub next sleep end thread name = " + Thread.currentThread().getName() + " time"
					+ System.currentTimeMillis());
			super.serviceMethod();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
