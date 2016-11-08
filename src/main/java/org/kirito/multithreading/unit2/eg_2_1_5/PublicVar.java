package org.kirito.multithreading.unit2.eg_2_1_5;

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
public class PublicVar {
	private String username = "A";
	private String password = "AA";

	synchronized public void setValue(String username, String password) {
		try {
			this.username = username;
			Thread.sleep(5000);
			this.password = password;
			System.out.println("setValue method thread name = " + Thread.currentThread().getName() + " username = "
					+ username + " password" + password);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	synchronized public void getValue(){
		System.out.println("getValue method thread name = " + Thread.currentThread().getName() + " username = "
				+ username + " password" + password);
	}
}
