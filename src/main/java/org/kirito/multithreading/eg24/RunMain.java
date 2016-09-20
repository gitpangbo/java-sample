package org.kirito.multithreading.eg24;

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
 * @createDate 2016年9月18日
 * @since JDK1.7
 */
public class RunMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			final SynchronizedObject object = new SynchronizedObject();
			// A 线程
			Thread threadA = new Thread(){
				@Override
				public void run() {
					object.printString();
				};
			};
			threadA.setName("a");
			threadA.start();
			Thread.sleep(1000);
			
			
			// B 线程
			Thread threadB = new Thread(){
				@Override
				public void run() {
					System.out.println("B线程启动了，但是进不了object.printString()方法，只打印了1个printString begin");
					System.out.println("因为object.printString()被A线程锁定并且永远suspend暂停了");
					object.printString();
				};
			};
			threadB.start();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end");
	}

}
