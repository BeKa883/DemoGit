package lab1;

public class Q05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number_a=Integer.parseInt(args[0]);
		int number_b=Integer.parseInt(args[1]);
		if(number_b < 2) {
			System.out.println("There is no prime number!");
			System.exit(0);
		}
		System.out.println("All prime numbers from number a: " + number_a + " to number b: " +number_b);
		for (int i=number_a; i<=number_b; i++) {
			if (isPrimeNumber(i)) {
				System.out.print(i + " ");
			}
		}
		
	}
	
	public static boolean isPrimeNumber(int n) {
		if (n < 2) {
			return false;
		}
		int squareRoot = (int) Math.sqrt(n);
		for (int i = 2; i <= squareRoot; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
