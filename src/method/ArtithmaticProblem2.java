package method;

public class ArtithmaticProblem2 {

	public static int getMinutes(int processTime) {
		
		return processTime / 60;
		
	}
	
	public static int getSeconds(int processTime) {
		
		return processTime % 60;
		
	}
	public static void main(String[] args) {
		
		int processTime = 145;
		int minutes = getMinutes(processTime);
		int seconds = getSeconds(processTime);
		System.out.print(minutes + "분 ");
		System.out.println(seconds + "초");
		
	}
}
