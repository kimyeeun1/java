package method;

public class SimpleParameter {

	public static void printHello(String name, String message) {
		System.out.println(name + "씨," + message);
	}
	public static void main(String[] args) {
		printHello("까칠이", "안녕하세요");
		printHello("기쁨이", "반갑습니다");
		printHello("불안이", "안녕");
		printHello("따분이", "안녕히 가세요");
		printHello("부럽이", "부러워요");
	}
}
