package org.kirito.multithreading.until1.eg01;

/***
 * *
 *
 * @version 1.0.0
 * @author pangbo
 * @Description TODO(用一句话描述该文件做什么)
 * @Copyright Copyright (c) 2012-2016
 * @Create 2016年9月14日
 */
public class MyThread extends Thread {

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				int time = (int) Math.random() * 1000;
				Thread.sleep(time);
				System.out.println("run=" + Thread.currentThread().getName());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
