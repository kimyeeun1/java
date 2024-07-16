package method;

import java.util.Scanner;

public class ForSyntax {
	
	public static void sum() {
		int sum = 0;
		for (int i = 1; i < 1001; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
	
	public static void evensum() {
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		sum = 0;
		for (int i = 0; i < 101; i += 2) {
			sum += i;
		}
		System.out.println(sum);
	}
	
	public static void gugudan() {
		for (int i = 1; i < 10; i++) {
			int a = 0;
			a = 3 * i;
			System.out.println("3x" + i + "=" + a);
		}
	}
	
	public static void allgugudan() {
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.println(i + "X" + j + "=" + i*j);
			}
		}
	}
	
	public static void selectgugudan() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("구구단을 입력하세요");
		int i = keyboard.nextInt();
		System.out.println("숫자를 입력하세요");
		int j = keyboard.nextInt();
		for(int k = 1; k < j + 1; k++) {
			System.out.println(i + "x" + k + "=" + i*k);
		}
	}
	
	public static void main(String[] args) {
		sum();
		evensum();
		gugudan();
		allgugudan();
		selectgugudan();
	
	}

}
