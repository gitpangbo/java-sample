package org.kirito.multithreading.unit2.eg_2_2_7.one;

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
public class Service {
	private String usernameParam;
	private String passwordParam;

	public void setUsernamePassword(String username, String password) {
		// TODO Auto-generated method stub
		try {
			String anyString = new String();
			synchronized (anyString) {
				System.out.println("线程名称：" + Thread.currentThread().getName() + " 在" + System.currentTimeMillis()
						+ "进入同步块");
				this.usernameParam = username;
				Thread.sleep(2000);
				this.passwordParam = password;
				System.out.println("线程名称：" + Thread.currentThread().getName() + " 在" + System.currentTimeMillis()
						+ "离开同步块");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
