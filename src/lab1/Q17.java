package lab1;

import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("---Binary to decimal converter---");
		System.out.println("Enter binary number: ");
		String binary=sc.nextLine();
		int decimal=converter(binary);
		if (decimal == -1) {
			System.out.println("Program has stopped and exited!");
			System.exit(0);
		} else {
			System.out.print("Converted successfully! \nResult: " + decimal);
		}
		sc.close();
		
	}
	
	public static int converter(String binary) {
		long decimal=Long.parseLong(binary);
		long remainder = 0;
		while (decimal>0) {
			remainder = decimal%10;
			decimal = decimal/10;
			if (remainder != 0 && remainder != 1) {
				System.out.println("Error!");
				return -1;
			}
		}
		return Integer.parseInt(binary, 2);
	}

}
