package lab1;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your point: ");
		float point = sc.nextFloat();
		if (point > 10 || point < 0) {
			System.out.println("Your point is not valid!");
		} else {
		System.out.format("Your rounded point: %.1f and converted point: %c", point, pointConverter(point));
		}
		sc.close();
	}
	
	public static int pointConverter(float number) {
		if (number >= 8.5 && number <= 10) {
			return 65;
		} else if (number < 8.5 && number >=7) {
			return 66;
		} else if (number < 7 && number >= 5.5) {
			return 67;
		} else if (number < 5.5 && number >= 4) {
			return 68;
		} else if (number < 4 && number >= 0) {
			return 70;
		}
		return 0;
	}

}
