package com.kita.first.level1.practice;

import java.util.Scanner;

public class Practice05 {
	public static void main(String[] args) {
//		switch로 해셜
//		월을 입력해 주세요 : (1~12)
//		
//		3~5를 입력했다면 "봄입니다."
//		6~8을 입력했다면 "여름입니다."
//		9~11을 입력했다면 "가을입니다."
//		1, 2, 12를 입력했다면 "겨울입니다."
//		1~12가 아닌 갑을 입력했다면 "잘못 입력하셨습니다."
		
		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력해주세요 : (1~12)");
		int n = sc.nextInt();
		int result;
		
		if() {
			result = 1;
		} else if() {
			result = 2;
		} else if() {
			result = 3;
		} else if() {
			result = 4;
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		switch() {
		case 1: case 2: case 3: case 4:
			System.out.println();
		}
		
	}
}
