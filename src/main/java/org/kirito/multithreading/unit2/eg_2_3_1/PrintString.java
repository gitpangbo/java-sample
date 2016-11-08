package org.kirito.multithreading.unit2.eg_2_3_1;

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
public class PrintString {

	private boolean isContinuePrint = true;

	public boolean isContinuePrint() {
		return isContinuePrint;
	}

	public void setContinuePrint(boolean isContinuePrint) {
		this.isContinuePrint = isContinuePrint;
	}

	public void printStringMethod() {
		try {
			while (isContinuePrint) {
				System.out.println("threadName = " + Thread.currentThread().getName() + " time = "
						+ System.currentTimeMillis());
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
