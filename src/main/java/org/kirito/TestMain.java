package org.kirito;
/**
 * @author pangbo
 * @version 创建时间：2016年5月5日 下午5:30:37
 * 类说明
 */
public class TestMain {

	public static void main(String[] args) {
		//String s = null;
		String a = "kirito";
		String b = "kirito";
		String c = new String("kirito");
		
		System.out.println("a equals b: " + a.equals(b));
		System.out.println("a equals c: " + a.equals(c));
		System.out.println("b equals c: " + b.equals(c));
		
		if(a == b){
			System.out.println("a == b: true");
		}
		if(a == c){
			System.out.println("a == c: true");
		}
		
		/*System.out.println("a == b: " + a==b?"true":"false");
		System.out.println("a == c: " + a==c?"true":"false");
		System.out.println("b == c: " + b==c?"true":"false");*/
	}
}
