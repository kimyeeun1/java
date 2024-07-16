package method;

import java.util.Scanner;

/** (도큐먼트 주석 클래스 및 메소드 위에다가 적는 주석)
 * <pre>
 * 사칙연산을 지원하는 계산기
 * 
 * 더하기 연산이 가능
 * 	- 두 숫자를 파라미터로 받아서 두 수의 합을 출력
 * 빼기 연산이 가능
 * 	- 두 숫자를 파라미터로 받아서 두 수의 차를 출력
 * 곱하기 연산이 가능
 *  - 두 숫자를 파라미터로 받아서 두 수의 곱을 출력
 * 나누기 연산이 가능
 *  - 두 숫자를 파라미터로 받아서 두 수를 나눈 몫을 출력
 *  
 *  main(String[] args) 메소드에서 호출
 * <pre>
 */
public class SimpleCalculator {
	
	public static void sum(double i, double j) {
		System.out.println(i + j);
	}
	
	public static void sub(double i, double j) {
		System.out.println(i - j);
	}
	
	public static void mult(double i, double j) {
		System.out.println(i * j);
	}
	
	public static void div(double i, double j) {
		System.out.println(i / j);
	}
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("첫 번째 숫자를 입력하세요");
		int i = keyboard.nextInt();
		System.out.println("두 번째 숫자를 입력하세요");
		int j = keyboard.nextInt();
		
		sub(i, j);
		div(i, j);
		mult(i, j);
		sum(i, j);
		
	}

}
