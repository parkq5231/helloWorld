package iteration;

public class ForExample2 {
	public static void main(String[] args) {
		String a = "*";
		int b = 1;

		for (int i = 0; i < 8; i++) {
			System.out.print(a);
			System.out.println();
			a += "*";
		}
		for (int k = 0; k < 5; k++) {
			System.out.print(b);
			System.out.println();
			b++;
		}
	}
}
