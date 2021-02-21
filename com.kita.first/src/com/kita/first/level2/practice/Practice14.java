package com.kita.first.level2.practice;

import java.util.Arrays;

import com.kita.first.level2.Method1;

public class Practice14 {
	public static void main(String[] args) {
		// 성적 배열
		int[][] arr = { { 67, 49, 87 }, // 국어성적
				{ 89, 92, 56 }, // 수학성적
				{ 76, 39, 98 } // 영어성적
		};

//		과목이름 배열
		String[] clsArr = { "국어", "수학", "영어" };
//		각 과목 성적 합계 배열
		int[] sumArr = new int[clsArr.length];
//		국어합계: ?, 평균: ? 00.0
//		수학합계: ?, 평균: ?
//		영어합계: ?, 평균: ?		
		for (int i = 0; i < arr.length; i++) {
			for (int z = 0; z < arr[i].length; z++) {
				sumArr[i] += arr[i][z];
			}
		}

		for (int i = 0; i < clsArr.length; i++) {
			System.out.printf("%s합계: %d, 평균: %.1f\n", clsArr[i], sumArr[i], (float) sumArr[i] / arr[i].length);
		}

//		전체합계: ?, 전체평균: ?

		int totalSum = 0;
		int totalCnt = 0;

		for (int i = 0; i < sumArr.length; i++) {
			totalSum += sumArr[i];
			totalCnt += arr[i].length;
		}

		System.out.printf("전체합계: %d, 평균: %.1f\n", totalSum, (float) totalSum / totalCnt);

		int result = Method1.sum(totalSum, totalSum / totalCnt);
		System.out.println(result);

	}
}
