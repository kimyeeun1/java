package method;

public class ArtithmaticProblem1 {

	public static int getTime(int minutes, int seconds) {
		
		return minutes * 60 + seconds;
		
	}
	public static void main(String[] args) {
		int minutes = 5;
		int seconds = 50;
		int time = getTime(minutes, seconds);
		System.out.println(time + "초");
	}
} 
