package com.kita.first.level1;

public class Operator6 {
	public static void main(String[] args) {
		int n1 = 3;
		int n2 = 4;
		int n3 = 3;
		
		boolean result;
		result = (n1==n2 && n2==n3 && n1==n3); // &&(and)모두 같아야  참 하나라도 다르면 거짓
		System.out.println(result);            // &&|| 중간에 거짓일경우 연산중단 &| 끝까지 연산
		result = (n1==n2 || n2==n3 || n1==n3); // ||(or)하나라도 같으면 참
		System.out.println(result);
	}
}
