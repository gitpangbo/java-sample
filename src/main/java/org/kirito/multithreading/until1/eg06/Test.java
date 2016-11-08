package org.kirito.multithreading.until1.eg06;

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
public class Test {

	public static void main(String[] args) {
//		Login a = new Login("a", "aa");
//		Login b = new Login("b", "bb");
//		a.start();
//		b.start();
		
		ALogin al = new ALogin();
		BLogin bl = new BLogin();
		al.start();
		bl.start();
		
	}
}
