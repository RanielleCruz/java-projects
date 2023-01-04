package AmountDue;

public class AmountDue{
	
	public static double computeAmountDue(double a){		
		return a + a/100*12;
	}
	
	
	public static double computeAmountDue(double a, double b) {
		return a * b + a/100*12;
	}
	
	public static double computeAmountDue(double a, double b, double c) {
		return a * b - c + a/100*12;
	}
}

