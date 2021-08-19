package day14_Exception;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		/*
		 예외 상황
		 -프로그램 의도(개발자 의도)와 다르게 동작하는 것들
		 예외 종류
		 -강제 에외: throw
		 -예외 전가 :throws
		 -예외 처리: try,catch 
		 */
		Scanner input = new Scanner(System.in);
		int x,y,result;
		System.out.println("수 입력");
		x = input.nextInt();
		y=input.nextInt();
		try {
			result=x/y;
			
			System.out.println("x / y=" +result );
		} catch (ArithmeticException e) {
			//e.printStackTrace();<현재 무슨 문제가 일어났는지 예외 상황을 알려줌
			System.out.println("0으로 나눌 수 없습니다");
		}
		System.out.println("다음 문장들 실행");
		

	}

}
