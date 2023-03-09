package lab1;

public class Q02 {
	public static void main(String[] args) {
		System.out.println("----Calculate x in equation: ax + b = 0----");
		int aNumber=Integer.parseInt(args[0]);
		int bNumber=Integer.parseInt(args[1]);
		System.out.println("a = " +aNumber);
		System.out.println("b = " +bNumber);
		float xNumber= (float)-bNumber/aNumber;
		System.out.format("Result of equation x: %.2f%n", xNumber);
	}
}
