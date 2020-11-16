package variable;

public class OpetatorExample2 {

	public static void main(String[] args) {

		int num1 = 4;
		int result = 0;

		if (num1 % 2 == 0) {
			result = 0;
			System.out.println(result);

		} else {
			result = 1;
			System.out.println(result);
		}

		boolean result1 = true;
		result1 = (num1 % 2) == 0 ? true : false;
		System.out.println(result1);

	}

}
