package lab1;

public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] pointArray = new double[10];
		randomPoints(pointArray);
		printArrayPoints(pointArray);
		availablePoints(pointArray);
	}
	public static void randomPoints(double[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (double) (Math.random()*5.5+5);
		}
	}
	
	public static void printArrayPoints(double[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.format("   %.1f   |", array[i]);
		}
	}
	public static void availablePoints(double[] array) {
		System.out.println("\nAll points that are greater than five: ");
		for (int i=0; i < array.length; i++) {
			if (array[i] < 5 || array[i] > 10) {
				System.out.format("---NULL---|");
			} else {
				System.out.format("   %.1f   |", array[i]);
			}
		}
	}
}
