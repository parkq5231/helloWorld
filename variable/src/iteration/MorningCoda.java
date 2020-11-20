package iteration;

public class MorningCoda {
	public static void main(String[] args) {
		int sum7 = 0, sum8 = 0;

		for (int i = 0; i <= 50; i++) {

			if (i % 7 == 0) {
				sum7 += i;
			} else if (i % 8 == 0) {
				sum8 += i;
			}
		}
		System.out.println(sum7);
		System.out.println(sum8);

		sum7 = 0;
		sum8 = 0;
		int i = 1;
		while (true) {

			if (i % 8 == 0 && i % 7 == 0) {
				break;
			} else if (i % 8 == 0) {
				sum8 += i;
			} else if (i % 7 == 0) {
				sum7 += i;
			}
			i++;

		} // end of while
		System.out.println(sum7);
		System.out.println(sum8);
	} // end of main
}