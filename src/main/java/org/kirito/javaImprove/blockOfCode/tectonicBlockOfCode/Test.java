package org.kirito.javaImprove.blockOfCode.tectonicBlockOfCode;

public class Test {
	/**
	 * 构造代码
	 */
	{
		System.out.println("执行构造代码块...");
	}

	/**
	 * 无参构造函数
	 */
	public Test() {
		System.out.println("执行无参构造函数...");
	}

	/**
	 * 有参构造函数
	 * 
	 * @param id
	 *            id
	 */
	public Test(String id) {
		System.out.println("执行有参构造函数...");
	}

	public static void main(String[] args) {
		new Test();
		System.out.println("----------------");
		new Test("1");
	}
}