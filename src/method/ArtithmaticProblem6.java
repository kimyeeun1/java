package method;

public class ArtithmaticProblem6 {
	
	public static void getOneWayFlightFare(int age) {
		final int ADULT_AGE = 19;
		
		int ADULT_ONE_WAY_FLIGHT_FARE = 300_000;
		int KID_ONE_WAY_FLIGHT_FARE = 120_000;
		
		if (age >= ADULT_AGE) {
			return ADULT_ONE_WAY_FLIGHT_FARE;
		}
		else {
			return KID_ONE_WAY_FLIGHT_FARE;
		}
	}
	public static void main(String[] args) {
		int money = 1_000_000;
		
		int father = 40;
		int mother = 36;
		int daughter = 11;
		
		int flightFare = 0;
		flightFare += getOneWayFlightFare(father);
		flightFare += getOneWayFlightFare(mother);
		flightFare += getOneWayFlightFare(daughter);
		
		System.out.println(flightFare);
		
		if (flightFare <= money) {
			System.out.println("여행가자!");
		}
		else {
			System.out.println("다음에 가자!");
		}
		
		
	}

}
