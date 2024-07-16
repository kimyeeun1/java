package method;

public class ArtithmaticProblem3 {
	
	public static double getFahrenheit(int celsius) {
		
		return ((double) celsius * 9 / 5) + 32;
	}
	public static void main(String[] args) {
		int celsius = 38;
		double fahrenheit = getFahrenheit(celsius);
		System.out.println(fahrenheit);
	}

}
