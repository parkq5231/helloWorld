package variable;

public class DataTypeExample {
	public static void main(String[] args) {
		byte num1 = 12;
		short num2 = 128;
		int num3 = 1000000000;
		long num4 = 1000000000000L;

		byte val1 = 10;
		num3 = val1;

		byte result = (byte) (num1 + val1);

		num1 = 120;
		for (int i = 0; i < 20; i++) {
			System.out.println(num1++);
		}

		System.out.println(num1);

		char char1 = 97;
		for (int i = 0; i < 26; i++) {
			System.out.println(char1++);

			float floatVal = 4.567F;
			double duobleVal = 3.4567;
			
			
			
		}
	}// end of main
}
