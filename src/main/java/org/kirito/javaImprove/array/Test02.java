package org.kirito.javaImprove.array;

public class Test02 {
	public static void main(String[] args) {
		int[] array_00 = new int[10];
		System.out.println("一维数组：" + array_00.getClass().getName());
		
		int[][] array_01 = new int[10][10];
		System.out.println("二维数组：" + array_01.getClass().getName());

		int[][][] array_02 = new int[10][10][10];
		System.out.println("三维数组：" + array_02.getClass().getName());
	}
}