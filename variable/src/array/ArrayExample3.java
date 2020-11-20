package array;

public class ArrayExample3 {
	public static void main(String[] args) {

		int num1 = 10, num2 = 20, num3 = 30;
		int temp;
		if (num1 > num2) {
			if (num1 > num3) {
				temp = num1;
				temp = 0;
				if (num1 > num2) {
					temp = num1;
				} else {
					temp = num2;
				}

				System.out.println(temp);
			}
		}

		temp = 0;
		int[] intAry = { 34, 25, 57, 39, 55 };
		for (int num : intAry) {
			if (temp < num) {
				temp = num;
			}
		}
		System.out.println(temp);

	}// end of main
}