package org.kirito.multithreading.eg06;

/***
 * Java Lib For MyProject, Powered By Kirito.
 * 
 * @since JDK1.7
 * @version 1.0.0
 * @author pangbo
 * @Description TODO(用一句话描述该文件做什么)
 * @Copyright Copyright (c) 2012-2016
 * @Create 2016年9月14日
 */
public class LoginServlet {

	private static String usernameRef;
	private static String passwordRef;

	synchronized public static void doPost(String username, String password) {
		// TODO Auto-generated method stub
		try {
			usernameRef = username;
			if (username.equals("a")) {
				Thread.sleep(5000);
			}
			passwordRef = password;
			System.out.println("由" + Thread.currentThread().getName()
					+ "线程，username=" + usernameRef + "，password=" + passwordRef);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
