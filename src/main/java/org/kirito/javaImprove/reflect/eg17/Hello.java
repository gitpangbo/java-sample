package org.kirito.javaImprove.reflect.eg17;

/**
 * 如果想要完成动态代理，首先需要定义一个InvocationHandler接口的子类，已完成代理的具体操作。
 */
class Hello {
	public static void main(String[] args) {
		MyInvocationHandler demo = new MyInvocationHandler();
		Subject sub = (Subject) demo.bind(new RealSubject());
		String info = sub.say("Rollen", 20);
		System.out.println(info);
	}
}