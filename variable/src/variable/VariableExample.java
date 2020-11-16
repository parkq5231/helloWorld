package variable;

public class VariableExample {

	public static void main(String[] args) {
		int num1, num2 ,result = 0;
		String resultStr= "결과값은 ";
		num1=50;
		num2=20;
		
		if (num1 < num2) {
			result = num2-num1 ;
		}else {
			result =num1-num2;
		}	
		System.out.println(resultStr+result);
		
	}
}
