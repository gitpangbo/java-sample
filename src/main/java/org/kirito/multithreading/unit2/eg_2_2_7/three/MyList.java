package org.kirito.multithreading.unit2.eg_2_2_7.three;

import java.util.ArrayList;
import java.util.List;

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
public class MyList {
	private List list = new ArrayList();

	public synchronized void add(String username) {
		// TODO Auto-generated method stub
		System.out.println("threadName = " + Thread.currentThread().getName() + " 执行了 add 方法");
		list.add(username);
		System.out.println("threadName = " + Thread.currentThread().getName() + " 退出了 add 方法");
	}

	public synchronized int getSize() {
		// TODO Auto-generated method stub
		System.out.println("threadName = " + Thread.currentThread().getName() + " 执行了 getSize 方法");
		int sizeValue = list.size();
		System.out.println("threadName = " + Thread.currentThread().getName() + " 退出了 getSize 方法");
		return sizeValue;
	}

}
