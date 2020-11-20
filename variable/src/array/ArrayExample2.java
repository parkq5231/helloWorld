package array;

public class ArrayExample2 {
	public static void main(String[] args) {
		double[] dAry = { 23.2, 55.3, 52.8, 62.8 };

		double result = 0;
		result = doubleSum(dAry);
		System.out.println(result);

	}// end of main

	public static double doubleSum(double[] dSum) {
		double result = 0;
		for (double num : dSum) {
			result += num;
		//추가로 평균해도 ㄱㅊ
		}

		return result;
		
	}
}
