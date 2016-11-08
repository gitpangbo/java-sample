package org.kirito.multithreading.unit2.eg_2_2_7.four;

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
public class MyOneList {
	private List list = new ArrayList();

	public synchronized void add(String data) {
		list.add(data);
	}

	public synchronized int getSize() {
		return list.size();
	}

}
