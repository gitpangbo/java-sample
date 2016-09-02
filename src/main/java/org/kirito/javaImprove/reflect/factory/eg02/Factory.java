package org.kirito.javaImprove.reflect.factory.eg02;

// 构造工厂类
// 也就是说以后如果我们在添加其他的实例的时候只需要修改工厂类就行了
class Factory {
	public static Fruit getInstance(String ClassName) {
		Fruit f = null;
		try {
			f = (Fruit) Class.forName(ClassName).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}
}