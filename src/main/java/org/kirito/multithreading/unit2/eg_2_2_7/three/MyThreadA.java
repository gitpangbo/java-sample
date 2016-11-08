package org.kirito.multithreading.unit2.eg_2_2_7.three;

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
public class MyThreadA extends Thread {

	private MyList list;

	public MyThreadA(MyList lsit) {
		super();
		this.list = lsit;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for (int i = 0; i < 100; i++) {
			list.add("threadA" + (i + 1));
		}
	}
}
