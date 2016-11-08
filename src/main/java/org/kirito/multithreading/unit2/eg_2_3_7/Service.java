package org.kirito.multithreading.unit2.eg_2_3_7;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

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
public class Service {

	private boolean isContineRun = true;

	public void runMethod() {
		String anyString = new String();
		while (isContineRun) {
			synchronized (anyString) {
			}
		}
		System.out.println("停下了了");
	}

	public void stopMethod() {
		this.isContineRun = false;
	}
}
