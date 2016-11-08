package org.kirito.multithreading.unit2.eg_2_2_7.four;

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

	public MyOneList addServiceMethod(MyOneList list, String data) {
		try {
			synchronized (list) {
				if (list.getSize() < 1) {
					Thread.sleep(2000);
					list.add(data);
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
