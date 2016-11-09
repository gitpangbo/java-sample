package org.kirito.multithreading.unit1.eg06;

/***
 * Java Lib For MyProject, Powered By Kirito.
 * 
 * @since	JDK1.7
 * @version 1.0.0
 * @author pangbo
 * @Description TODO(用一句话描述该文件做什么)
 * @Copyright Copyright (c) 2012-2016
 * @Create 2016年9月14日
 */
public class Login extends Thread {

	private String username;
	private String password;
	
	public Login(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		LoginServlet.doPost(this.username, this.password);
	}
}
