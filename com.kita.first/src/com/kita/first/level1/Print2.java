package com.kita.first.level1;

public class Print2 {
	public static void main(String[] args) {
		String name = "이동관";
		int age = 28;
		
		// 제 이름은 이동관이고 나이는 28세입니다.
		System.out.println("제 이름은 " + name + "이고 나이는 " + age + "세입니다.");

//		System.out.printf("문자열 형식", 변수1, 변수2, ...);
		System.out.printf("제 이름은 %s이고 나이는 %d세입니다.\n", name, age);
//		%s 문자열, %d 정수, % (n) d n칸만큼 출력 모자란칸수는 빈칸으로 출력
		
		double grade = 3.33333333333333;
		System.out.printf("제 학점은 평균 %.2f입니다.", grade);
//		%f 실수, % (.n) f 소수점n번째자리까지 출력
		
		
		
		
	}
}
