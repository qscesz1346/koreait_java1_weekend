package com.kita.first.level2.practice;

public class Practice09 {
	public static void main(String[] args) {
//		정수 배열 만들어서
//		1~100까지의 값을 각각 배열에 넣고
//		배열 안에 든 값을 forEach문으로 출력
//		1, 2, 3, 4, ..., 100
		int[] arr = new int[100];		
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		for(int val :arr) {
			if(val==arr.length) {
				System.out.print(val);
				break;
			}
			System.out.printf(val + ", ");
		}
		
	}
}
