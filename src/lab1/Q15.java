package lab1;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your point (A, B, C, D, F): ");
		String letterPoint=sc.nextLine();
		String capitalLetterPoint= letterPoint.toUpperCase();
		char inputPoint = capitalLetterPoint.charAt(0);
		if (pointConverter(inputPoint) == -1) {
			System.out.println("Your inputted point is not available!");
		} else {
			System.out.println("Your inputted point: " + inputPoint +" and converted point: " + pointConverter(inputPoint));	
		}
		sc.close();

	}
	
	public static int pointConverter(char point) {
		switch(point) {
		case 'A':
			return 4;
		case 'B':
			return 3;
		case 'C':
			return 2;
		case 'D':
			return 1;
		case 'F':
			return 0;
		default: 
			return -1;
		}
	}

}
