package com.kita.first.level2.practice;

import java.util.Scanner;

public class Pratice15 {
	public static void main(String[] args) {
		// 숫자야구게임
		Scanner sc = new Scanner(System.in);
		final int LEN = 3; // 게임 칸 개수
		int[] rArr = new int[LEN]; // 컴퓨터가 뽑는 값 배열
		int[] myArr = new int[LEN]; // 내가 입력한 값 배열
		int max = 9;
		int min = 1;
		int strike;
		int ball;
		int out; // LEN - strike - ball

		System.out.println("숫자야구게임 시작!");
//		컴퓨터가 랜덤한 정수값을 뽑아서 rArr에 담기
//		중복 허용X

		for (int i = 0; i < LEN; i++) {
			rArr[i] = (int) (Math.random() * (max - min + 1) + min);
			for (int z = 0; z < i; z++) {
				if (rArr[i] == rArr[z]) {
					i--;
					break;
				}
			}
		}
//		strike==LEN일 때까지 반복
		while (true) {
			strike = 0;
			ball = 0;
//			내가 정수값 3개 입력받아서 myArr에 넣기			
			for (int i = 0; i < LEN; i++) {
				System.out.printf("값%d: \n", i + 1);
				myArr[i] = sc.nextInt();
				if (myArr[i] < min || myArr[i] > max) {
					System.out.println("범위 밖의 숫자입니다.");
					i--;
					continue;
				}
				for (int z = 0; z < i; z++) {
					if (myArr[i] == myArr[z]) {
						System.out.println("중복된 숫자입니다.");
						i--;
						break;
					}
				}
			}

//			S, B, O 개수 체크
			for (int i = 0; i < LEN; i++) {
//				if (rArr[i] == myArr[i]) {
//					strike++;
//					continue;
//				}
				for (int z = 0; z < LEN; z++) {
					if (rArr[i] == myArr[i]) {
						if (i == z) {
							strike++;
						} else {
							ball++;
						}
					}
				}
			}

			if (strike == LEN) {
				break;
			}
//			S, B, O 개수 출력
			System.out.printf("S : %d B : %d O : %d", strike, ball, LEN-strike-ball);
			

//		 

		}
		sc.close();
		System.out.println("게임 종료!");
	}
}