package org.kirito.multithreading.unit2.eg_2_1_3;

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
public class HasSelfPrivateNum {
	private int num = 0;

	synchronized public void addI(String username) {
		try {
			if (username.equals("a")) {
				num = 100;
				System.out.println("a set over");
				Thread.sleep(2000);
			} else {
				num = 200;
				System.out.println("b set over");
			}
			System.out.println(username + " num=" + num);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
