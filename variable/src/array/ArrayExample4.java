package array;

//다차원배열
public class ArrayExample4 {
	public static void main(String[] args) {
		int[][] intAry = new int[3][3];
		intAry[0] = new int[] { 11, 12, 13 };
		intAry[1] = new int[] { 21, 22, 23 };
		intAry[2] = new int[] { 31, 22, 33 };

		System.out.println(intAry[2][2]);
		System.out.println(intAry.length);

		for (int i = 0; i < intAry.length; i++) {
			for (int j = 0; j < intAry[i].length; j++) {
				System.out.println("intAry[" + i + "," + j + "]>" + intAry[i][j]);
			}
		}
		// 배열의 각 합,평균 구하기 /합과 평균이 3개씩 나와야함
		int sum = 0;
		int[][] intAry2 = { { 11, 12, 13 }, { 21 }, { 31, 32, 33 } };
		
		for (int i = 0; i < intAry2.length; i++) {
			for (int j = 0; j < intAry2[i].length; j++) {
				sum += intAry2[i][j];
			}
		}
	
		System.out.println("sum값의 총합: "+sum);
		System.out.println("sum값의 평균: "+(sum/7));

		
	}// end of main
}
