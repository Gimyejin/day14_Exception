package day14_Exception;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		/*
		 ���� ��Ȳ
		 -���α׷� �ǵ�(������ �ǵ�)�� �ٸ��� �����ϴ� �͵�
		 ���� ����
		 -���� ����: throw
		 -���� ���� :throws
		 -���� ó��: try,catch 
		 */
		Scanner input = new Scanner(System.in);
		int x,y,result;
		System.out.println("�� �Է�");
		x = input.nextInt();
		y=input.nextInt();
		try {
			result=x/y;
			
			System.out.println("x / y=" +result );
		} catch (ArithmeticException e) {
			//e.printStackTrace();<���� ���� ������ �Ͼ���� ���� ��Ȳ�� �˷���
			System.out.println("0���� ���� �� �����ϴ�");
		}
		System.out.println("���� ����� ����");
		

	}

}
