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
public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			PublicVar publicVarRef = new PublicVar();
			ThreadA threadA = new ThreadA(publicVarRef);
			threadA.start();
			Thread.sleep(100);// 打印结果受此值大小影响
			publicVarRef.getValue();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
