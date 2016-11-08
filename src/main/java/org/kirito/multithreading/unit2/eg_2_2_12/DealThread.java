package org.kirito.multithreading.unit2.eg_2_2_12;

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
public class DealThread implements Runnable {

	public String username;
	public Object lock1 = new Object();
	public Object lock2 = new Object();

	public void setFlag(String username) {
		this.username = username;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		if ("a".equals(username)) {
			synchronized (lock1) {
				try {
					System.out.println("username = " + username);
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (lock2) {
					System.out.println("按lock1 -> lock2 的代码顺序执行了");
				}
			}
		}
		if ("b".equals(username)) {
			synchronized (lock2) {
				try {
					System.out.println("username = " + username);
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (lock1) {
					System.out.println("按lock2 -> lock1 的代码顺序执行了");
				}
			}
		}
	}
}
