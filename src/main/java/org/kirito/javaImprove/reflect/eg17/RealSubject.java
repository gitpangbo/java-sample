package org.kirito.javaImprove.reflect.eg17;

// 定义真实项目
class RealSubject implements Subject {
	@Override
	public String say(String name, int age) {
		return name + "  " + age;
	}
}