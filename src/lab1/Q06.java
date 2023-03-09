package lab1;

public class Q06 {

	public static void main(String[] args) {
		int number_m=Integer.parseInt(args[0]);
		int number_n=Integer.parseInt(args[1]);
		if ((number_n <= 0) && (number_m <= 0)) {
			System.out.println("----There is no square number between m (" + number_m + ") and n (" + number_n +")----");
		} else {
			System.out.println("----Square numbers between m (" + number_m + ") and n (" + number_n +")----");
			for (int i=number_m; i<=number_n; i++) {
				if (isSquareNumber((double)i)) {
					System.out.print(i + " ");
				}
			}
		}
		
	}
	
	public static boolean isSquareNumber(double x) {
		double square=Math.sqrt(x);
		return ((square - Math.floor(square)) == 0);
	}

}
