package org.kirito.test;

import java.util.Arrays;

/***
 *
 * Java Lib For MyProject, Powered By Kirito.
 *
 * Package: org.kirito.test
 *
 * Filename: TestSplit.java
 *
 * Description: TODO(用一句话描述该文件做什么)
 *
 * Copyright: Copyright (c) 2001-2014
 *
 * Company: null
 *
 * @author: pangbo
 *
 * @version: 1.0.0
 *
 *           Create at: 2016年6月7日 下午5:42:17
 *
 *           Revision:
 *
 *           2016年6月7日 下午5:42:17 - first revision
 *
 */
public class TestSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strContent="data[1][10200027]";

		String[] myProductArray = strContent.split("\\]|\\[");
		
		for (int i = 0; i < myProductArray.length; i++) {
			System.out.println(i+":"+myProductArray[i]);
		}
		System.out.println(Arrays.toString(myProductArray));
	}
}
