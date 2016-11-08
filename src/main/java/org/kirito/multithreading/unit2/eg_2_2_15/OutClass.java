package org.kirito.multithreading.unit2.eg_2_2_15;

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
public class OutClass {

	static class InnerClass1 {

		public void method1(InnerClass2 class2) {
			String threadName = Thread.currentThread().getName();
			synchronized (class2) {
				System.out.println("线程： " + threadName + " 进入 InnerClass1 类种的 method1 方法");
				for (int i = 0; i < 10; i++) {
					System.out.println("线程：" + threadName + " i = " + (i + 1));
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("线程： " + threadName + " 离开 InnerClass1 类种的 method1 方法");
			}
		}

		public synchronized void method2() {
			String threadName = Thread.currentThread().getName();
			System.out.println("线程： " + threadName + " 进入 InnerClass1 类种的 method2 方法");
			for (int j = 0; j < 10; j++) {
				System.out.println("线程：" + threadName + " j = " + (j + 1));
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("线程： " + threadName + " 离开 InnerClass1 类种的 method2 方法");
		}

	}

	static class InnerClass2 {

		public synchronized void method1() {
			String threadName = Thread.currentThread().getName();
			System.out.println("线程： " + threadName + " 进入 InnerClass2 类种的 method1 方法");
			for (int k = 0; k < 10; k++) {
				System.out.println("线程：" + threadName + " k = " + (k + 1));
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("线程： " + threadName + " 离开 InnerClass2 类种的 method1 方法");
		}
	}
}
