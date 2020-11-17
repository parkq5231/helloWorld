package iteration;

public class MorningCoda {
	public static void main(String[] args) {
		int sum7 = 0, sum8 = 0, i = 0;

		for (i = 1; i <= 50; i++) {
			if (i % 7 == 0) {
				sum7 += i;
			} else if (i % 8 == 0) {
				sum8 += i;
			}
		}
		while (true) {
			if (i % 7 == 0 && i % 8 == 0) {
				break;
			}
		}
		System.out.println(sum7);
		System.out.println(sum8);

	}
}