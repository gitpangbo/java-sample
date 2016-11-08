package org.kirito.multithreading.unit2.eg_2_1_6.one;

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
	synchronized public void service1(){
		System.out.println("service1 start");
		service2();
		System.out.println("service1 end");
	}
	synchronized public void service2(){
		System.out.println("service2 start");
		service3();
		System.out.println("service2 end");
	}
	synchronized public void service3(){
		System.out.println("service3 start");
		System.out.println("service3 end");
	}
	
}
