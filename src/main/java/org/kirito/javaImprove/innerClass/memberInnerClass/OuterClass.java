package org.kirito.javaImprove.innerClass.memberInnerClass;

public class OuterClass {
	private String str;

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public void outerDisplay() {
		System.out.println("outerClass...");
	}

	/* 推荐使用getxxx()来获取成员内部类，尤其是该内部类的构造函数无参数时 */
	public InnerClass getInnerClass() {
		return new InnerClass();
	}

	public class InnerClass {
		public void innerDisplay() {
			// 使用外围内的属性
			str = "chenssy...";
			System.out.println(str);
			// 使用外围内的方法
			outerDisplay();
		}
	}

	public static void main(String[] args) {
		OuterClass outer = new OuterClass(); 
		OuterClass.InnerClass inner = outer.getInnerClass();  
        inner.innerDisplay(); 
	}
}