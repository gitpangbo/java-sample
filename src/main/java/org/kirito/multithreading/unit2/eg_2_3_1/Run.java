package org.kirito.multithreading.unit2.eg_2_3_1;

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
public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintString printString = new PrintString();
		printString.printStringMethod();
		System.out.println("stop printStringMethod, stopThreadName = " + Thread.currentThread().getName());
		printString.setContinuePrint(false);
	}

}
