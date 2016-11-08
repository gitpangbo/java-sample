package org.kirito.multithreading.unit2.eg_2_3_3;

import org.apache.commons.lang.Validate;

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
public class RunThread extends Thread {

	volatile private boolean isRunning = true;

	public boolean isRunning() {
		return isRunning;
	}

	public void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("进入 run 了");
		while (isRunning) {
		}
		System.out.println("离开 run 了");
	}
}
