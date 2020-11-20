package array;

public class MethodExample1 {
	public static void main(String[] args) {

		showInfo("56");
		int result = showDouble(45);
		System.out.println(result);
		System.out.println(showDouble(33.2));
		multi(3, 4, 5);
		System.out.println(multi(3, 4, 5));
		System.out.println(divide(45.1, 11.1));

	}// end of main

	public static void showInfo(String name) {
		System.out.println("안녕하세요. " + name + "입니다.");
	}

	public static int showDouble(int num) {
		return num * 2;
	}

	public static double showDouble(double num) {
		return num * 2;
	}

	public static int sum(int a, int b) {
		int result = 0;
		result = a + b;
		return result;
	}

	public static int multi(int a, int b, int c) {
		int result = 0;
		result = a * b * c;
		return result;
	}

	public static double divide(double a, double b) {
		double result = 0;
		if (a > b) {
			result = a / b;

		} else if (a < b) {
			result = b / a;
			
		}
		return result;
	}

}
