package method;
/** (도큐먼트 주석 클래스 및 메소드 위에다가 적는 주석)
 * <pre>
 * 사칙연산을 지원하는 계산기
 * 
 * 더하기 연산이 가능
 * 	- 두 숫자를 파라미터로 받아서 두 수의 합을 반환
 * 빼기 연산이 가능
 * 	- 두 숫자를 파라미터로 받아서 두 수의 차를 반환
 * 곱하기 연산이 가능
 *  - 두 숫자를 파라미터로 받아서 두 수의 곱을 반환
 * 나누기 연산이 가능
 *  - 두 숫자를 파라미터로 받아서 두 수를 나눈 몫을 반환
 *  
 *  main(String[] args) 메소드에서 호출하여 반환된 값을 출력
 * <pre>
 */
public class ReturnSimpleCaculator {
	
	public static int getAddResult(int i, int j) {
		return i + j;
	}
	
	public static int getSubResult(int i , int j) {
		return i - j;
	}
	
	public static int getMultResult(int i, int j) {
		return i * j;
	}
	
	public static int getDivResult(int i , int j) {
		return i / j;
	}
	public static void main(String[] args) {
		int addresult = getAddResult(10,4);
		System.out.println(addresult);
		int subresult = getSubResult(10,4);
		System.out.println(subresult);
		int multresult = getMultResult(10,4);
		System.out.println(multresult);
		int divresult = getDivResult(10,4);
		System.out.println(divresult);
		
	}

}
