package method;

public class ArtithmaticProblem4 {
	
	public static int getSum(int korScore, int engScore, int mathScore, int progScore) {
		return korScore + engScore + mathScore + progScore;
	}
	
	public static double getAve(int sum, int subjectCount) {
		return (double) sum / subjectCount;
	}
	
	public static String getRank(double average) {
		
		if (average >= 95 ) {
			return "A+";
		}
		else if (average >= 90) {
			return "A";
		}
		else if (average >= 85) {
			return "B+";
		}
		else if (average >= 80) {
			return "B";
		}
		else if (average >= 70) {
			return "C";
		}
		else {
			return "F";
		}
		
	}
	public static void main(String[] args) {
		int korScore = 90;
		int engScore = 88;
		int mathScore = 70;
		int progScore = 80;
		int sum = getSum(korScore,engScore,mathScore,progScore);
		double average = getAve(sum, 4);
		String rank = getRank(average);
		
		System.out.println("합계: " + sum + "점");
		System.out.println("평균: " + average + "점");
		System.out.println("성적: " + rank);
		
	}

}
