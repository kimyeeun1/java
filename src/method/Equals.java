package method;

import java.util.Scanner;

public class Equals {
	public static void main(String[] args) {
		/*
		 * 비교연산자 : 숫자만 처리 가능!
		 * ==
		 * !=
		 * >
		 * >=
		 * <
		 * <=
		 */
		Scanner keyboard = new Scanner(System.in);
		String operator = keyboard.nextLine();
		System.out.println(operator == "+"); // false!
		// 문자열 비교
		
		System.out.println(operator.equals("+"));
	}
}
