package iteration;

public class MorningCoda {
	public static void main(String[] args) {
		int sum7 = 0, sum8 = 0;
		int sum5 = 0, sum6 = 0;
		for (int i = 1; i <= 50; i++) {
			if (i % 7 == 0) {
				sum7 += i;
			} else if (i % 8 == 0) {
				sum8 += i;
			}
		}
		System.out.println(sum7);
		System.out.println(sum8);
		int k = 1;
		while (k < 100) {

			if (k % 8 == 0) {
				sum6 += k;
			} else if (k % 7 == 0) {
				sum5 += k;
			}
			else if (k % 7 == 0 && k % 8 == 0) {
				break;
			}
		}
		System.out.println(sum5);
	}
}
