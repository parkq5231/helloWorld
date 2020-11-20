package variable;

public class MorningCode {
	public static void main(String[] args) {
		int intNumbers[] = { 23, 56, 34, 65, 28, 21 };
		int sum = 0;
		int avg = 0;

		for (int i = 0; i < 6; i++) {
			if (intNumbers[i] % 2 != 0) {
				sum += intNumbers[i];
			}
		}
		avg = sum / 3;

		System.out.println(sum);
		System.out.println(avg);

	}// end of main
}
