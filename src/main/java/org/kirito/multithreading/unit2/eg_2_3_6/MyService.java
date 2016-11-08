package org.kirito.multithreading.unit2.eg_2_3_6;

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
public class MyService {

	public static AtomicLong aiRef = new AtomicLong();

	synchronized public void addNum() {
		System.out.println("threadName = " + Thread.currentThread().getName() + " aiRef加了100之后的值 "
				+ aiRef.addAndGet(100) + " time = " + System.currentTimeMillis());
		aiRef.addAndGet(1);
	}
}
