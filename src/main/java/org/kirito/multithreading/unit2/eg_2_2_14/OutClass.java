package org.kirito.multithreading.unit2.eg_2_2_14;

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

	static class Inner {

		public void method1() {
			synchronized ("other") {
				for (int i = 0; i < 10; i++) {
					System.out.println("线程：" + Thread.currentThread().getName() + " i = " + (i + 1));
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}

		public synchronized void method2() {
			for (int i = 11; i < 20; i++) {
				System.out.println("线程：" + Thread.currentThread().getName() + " i = " + (i + 1));
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}
}
