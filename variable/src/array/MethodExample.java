package array;

public class MethodExample {
	public static void main(String[] args) {
		int num1, num2, result;
		num1 = 34;
		num2 = 55;
		result = sumMethod(num1, num2);
		System.out.println(result);
		int val1 = 22, val2 = 55;
		result = sumMethod(val1, val2);
		System.out.println(result);

	}// end of main

	public static int sumMethod(int numb1, int numb2) {
		int result = numb1 + numb2;
		result = result / 2;
		result += 50;
		result = result / 10;
		return result;
	}
}
