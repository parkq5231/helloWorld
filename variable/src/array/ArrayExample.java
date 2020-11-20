package array;

public class ArrayExample {
	public static void main(String[] args) {
		int[] intAry = new int[5];
		intAry[0] = 15;
		intAry[4] = 33;
		for (int i = 0; i < 5; i++) {
			System.out.println(intAry[i]);
		}

		double[] doubleAry;
		doubleAry = new double[] { 2.3, 2, 4.5, 2.2, 1.6 };
		System.out.println(doubleAry[0]);
		double sum = 0;
		for (int i = 0; i < doubleAry.length; i++) {
			sum += doubleAry[i];
		}

		System.out.println(sum);
		System.out.println("-----------------");
		// enhanced for

		sum = 0;
		for (double dbl : doubleAry) {

			sum += dbl;
			System.out.println(sum);
		}

	}// end of main
}
