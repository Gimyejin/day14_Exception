package day14_Exception;

import java.util.Scanner;

public class Age {
	Scanner input = new Scanner(System.in);
	int age;

	public void inputAge() {
		System.out.print("생년월일 6자리를 입력하시오");
		try {
			age = input.nextInt();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		ageCheck();
	}

	public void ageCheck() {
		String check = Integer.toString(age);				
		int check1 = Integer.parseInt(check.substring(0, 1));
		if (check1 == 9 || check1 == 0)
			System.out.println("가입가능");
		else
			System.out.println("가입불가");

	}
}
