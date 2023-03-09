package lab1;

import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("---Decimal to binary converter (8bit)---");
		System.out.println("Enter decimal number: ");
		int decimal=sc.nextInt();
		if (decimal > 255 || decimal < 0) {
			System.out.println("Your number cannot be converted (due to overflow)!");
		} else {
			System.out.print("Converted number: ");
			converter(decimal);
		}
		sc.close();
	}
	
	public static void converter(int number) {
		int[] binary = new int[8];
		int index = 0;
		while (number > 0) {
			binary[index++] = number%2;
			number = number/2;
		}
		for (int i = index-1; i >= 0; i--) {
			System.out.print(binary[i]);
		}
	}

}
