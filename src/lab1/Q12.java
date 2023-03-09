package lab1;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("---Find divisors---");
		System.out.println("Enter number n: ");
		int nNumber=sc.nextInt();
		printDivisor(nNumber);
		sc.close();
	}
	public static void printDivisor (int n) {
		for (int i=1; i<=n; i++) {
			if (n % i == 0) {
				System.out.print(i + "    ");
			}
		}
	}

}
