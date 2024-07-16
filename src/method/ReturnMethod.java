package method;

import java.util.Random;

public class ReturnMethod {
	
	public static int getRandomNumber() {
		Random random = new Random();
		//return 키워드의 역할
		//1. 값을 반환시킨다.
		//2. 메소드(getRandomNumber)를 종료시킨다.
		return random.nextInt();
	}
	public static void main(String[] agrs) {
		int randomNumber = getRandomNumber();
		System.out.println(randomNumber);
	}

}
