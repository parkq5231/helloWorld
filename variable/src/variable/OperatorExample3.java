package variable;

public class OperatorExample3 {

	public static void main(String[] args) {
		int num1 =40;
		int num2 =20;
		int result=0;
		
		if (num1<num2) {
			result = 0;
			System.out.println(result);
		}else {
			result = 1;
			System.out.println(result);
		}

		num2 -=3;
		boolean result1=true;
		result1 = (num2 % 2)==0 ? true : false;
		System.out.println(result1);
		
		
		
	}

}
