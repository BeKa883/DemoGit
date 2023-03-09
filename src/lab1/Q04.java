package lab1;

public class Q04 {

	public static void main(String[] args) {
		System.out.println("----Sum of 1+2+3+...+n----");
		int n=Integer.parseInt(args[0]);
		System.out.println("Inserted n: " +n);
		int sum=0;
		for (int i=1; i<=n; i++) {
			sum += i;
		}
		System.out.println("Result: " + sum);
	}

}
