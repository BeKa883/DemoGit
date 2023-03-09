package lab1;

public class Q03 {
	public static void main(String[] args) {
		System.out.println("----Calculate x in equation: a^2*x + b*x + c = 0----");
		float a=Float.parseFloat(args[0]);
		float b=Float.parseFloat(args[1]);
		float c=Float.parseFloat(args[2]);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		
		float delta= -(b*b)/(4*a*c);
		System.out.format("Delta is: %.3f%n" , delta);
		
		if (delta < 0) {
			System.out.println("Equation has no root!");
		} else {
			if (delta == 0) {
				float x0= -b/(2*a);
				System.out.format("Equation has double root x: %.3f%n", x0);
			} else {
				float x1= (float) -(b-Math.sqrt(delta))/(2*a);
				float x2= (float) -(b+Math.sqrt(delta))/(2*a);
				System.out.format("Equation has two roots x1: %.3f, and x2: %.3f%n", x1, x2);
			}
		}
	}
}
