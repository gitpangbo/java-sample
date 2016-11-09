package org.kirito.multithreading.unit1.eg15;

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
 * @createDate 2016年9月14日
 * @since JDK1.7
 */
public class MyThread extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for (int i = 0; i < 500000; i++) {
			if (this.interrupted()) {
				System.out.println("当前线程已经是停止状态，我要退出了");
				break;
			}
			System.out.println("i=" + (i + 1));
		}
		System.out.println("我是被输出，如果此代码是for又继续运行，线程并未停止");
	}
}
