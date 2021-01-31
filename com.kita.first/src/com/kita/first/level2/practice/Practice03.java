package com.kita.first.level2.practice;

public class Practice03 {
	public static void main(String[] args) {
//		2~9 구구단 찍기
//		2 * 1 = 2
//		2 * 2 = 4
//		...
//		9 * 9 = 81
		
		for(int i=2; i<10; i++) {
			for(int z=1; z<10; z++) {
					System.out.printf("%d * %d = %2d\n", i, z, i*z);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
//		2 * 1 = 2	2 * 2 =  4 ... 2 * 9 = 18
//		3 * 1 = 3	3 * 2 =  6 ... 3 * 9 = 27
//		...
//		9 * 1 = 9	9 * 2 = 18 ... 9 * 9 = 81 
		
		for(int i=2; i<10; i++) {
			for(int z=1; z<10; z++) {
				System.out.printf("%d * %d = %2d\t", i, z, i*z);
			}
			System.out.println();
		}
		
		
		
		
		
	}
}
