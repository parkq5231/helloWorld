package variable;

public class ArrayExample1 {
	public static void main(String[] args) {
		int[] numbers = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.println(numbers[i]);
				sum += numbers[i];

			}

		}
		System.out.println(sum);
	}
}
