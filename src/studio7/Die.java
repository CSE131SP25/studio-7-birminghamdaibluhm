package studio7;

public class Die {
	
	private int Sides;

	public Die(int initSides) {
		Sides = initSides;
		
	}
	public int Random() {
		return (int)(Math.random() * Sides) + 1;
		
	}
	
	public static void main(String[] args) {
		Die one = new Die (6);
		System.out.print(one.Random());

	}

}
