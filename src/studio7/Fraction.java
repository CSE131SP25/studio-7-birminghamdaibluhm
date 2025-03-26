package studio7;

public class Fraction {

	private int numerator;
	private int denominator;
	
	public Fraction(int initNumerator, int initDenominator) {
		numerator = initNumerator;
		denominator = initDenominator;
	}
	
	public String toString() {
		return (numerator + "/" + denominator);
	}
	
	public double multiplication(Fraction fraction2) {
		return (this.numerator * fraction2.numerator)/(this.denominator * fraction2.denominator);
	}
	
	public double sum(Fraction fraction2) {
		return (this.numerator/this.denominator)+(fraction2.numerator/fraction2.denominator);
	}
	
	public String reciprocal() {
		return (denominator + "/" + numerator);
	}
	
	public Fraction simplification() {
		int tempNumerator = numerator;
		int tempDenominator = denominator;
		for (int i = 1; i <= tempNumerator; i ++) {
			if (tempNumerator % i == 0 && tempDenominator % i == 0) {
				tempNumerator = tempNumerator/i;
				tempDenominator = tempDenominator/i;
			}
		}
		return new Fraction(tempNumerator, tempDenominator);
	}
	
	public static void main (String[] args) {
		Fraction one = new Fraction (3,4);
		Fraction two = new Fraction (24,48);
		System.out.println(one.toString());
		System.out.println(one.multiplication(two));
		System.out.println(one.sum(two));
		System.out.println(one.reciprocal());
		System.out.println(two.simplification().toString());
	}
	
}
