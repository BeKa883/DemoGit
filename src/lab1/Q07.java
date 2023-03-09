package lab1;

public class Q07 {

	public static boolean checkPerfect(int x) {
		int temp=0;
		for (int i=1; i<=x/2; i++) {
			if(x % i == 0) {
				temp += i;
			}
		}
		return (temp == x);
	}
	public static void main(String[] args) {
		int number_n=Integer.parseInt(args[0]);
		System.out.println("All perfect number from 1 to n (" + number_n + "):");
		for (int i=1; i<number_n; i++) {
			if (checkPerfect(i)) {
				System.out.println(i + " ");
			}
		}
	}

}
