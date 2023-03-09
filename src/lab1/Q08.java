package lab1;

public class Q08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nNumber=Integer.parseInt(args[0]);
		int fibo0=0;
		int fibo1=1;
		int fiboNumberN;
		if (nNumber < 0) {
			System.out.println("Number n is not available!");
			System.exit(0);
		}
		if (nNumber == 0) {
			System.out.print("Fibonacci:" +fibo0);
		} else {
			System.out.print("Fibonacci to n: " +fibo0 +" "+ fibo1);
			for (int i=1; i<nNumber; i++) {
				fiboNumberN=fibo0+fibo1;
				if (fiboNumberN > nNumber) {
					break;
				}
				System.out.print(" " + fiboNumberN);
				fibo0=fibo1;
				fibo1=fiboNumberN;
			}
		}
	}

}
