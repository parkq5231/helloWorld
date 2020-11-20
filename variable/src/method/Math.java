package method;

public class Math {
	private double pi = 3.14;

	// 메소드
	public int sum(int a, int b) {
		return a + b;
	}

	public double sum(double a, double b) {
		return a + b;
	}

	public double getArea(double a) {
		return a * a * pi;
	}

	public double getRectagle(double a) {
		return a * a;
	}

	public double getRectagle(double a, double b) {
		return a * b;
	}

	// int 배열의 합 구하는 메소드.
	public int getArySum(int[] ary) {
		int sum = 0;
		for (int num : ary) {
			sum += num;
		}
		return sum;
	}

	public double getSum(double[] ary2) {
		double sum = 0;
		for (double num : ary2) {
			sum += num;
		}
		return sum;
	}
	//사람의 적정 몸무게 구하는 메소드.
	public double getProperweight(Person p1) {
		double properWeight=(p1.height-100)*0.9;
		return properWeight;
	}
	public double getProperweight(double height) {
		double properWeight=(height-100)*0.9;
		return properWeight;
	}
	
		
}// end of class
