package org.kirito.multithreading.unit1.eg26;

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
			final MyObject object = new MyObject();
			// A 线程
			Thread threadA = new Thread(){
				@Override
				public void run() {
					// TODO Auto-generated method stub
					super.run();
					object.setValue("a", "aa");
				}
			};
			threadA.setName("a");
			threadA.start();
			Thread.sleep(1000);
			
			// B 线程
			Thread threadB = new Thread(){
				@Override
				public void run() {
					// TODO Auto-generated method stub
					super.run();
					object.printValue();
				}
			};
			threadB.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end");
	}

}
