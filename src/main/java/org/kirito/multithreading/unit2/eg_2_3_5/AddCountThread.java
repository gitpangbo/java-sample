package org.kirito.multithreading.unit2.eg_2_3_5;

import java.util.concurrent.atomic.AtomicInteger;

import org.apache.commons.lang.Validate;
import org.apache.hadoop.fs.shell.Count;

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
public class AddCountThread extends Thread {

	private AtomicInteger count = new AtomicInteger(0);

	private void addCount() {
		for (int i = 0; i < 10000; i++) {
			System.out.println(count.incrementAndGet());
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		addCount();
	}
}
