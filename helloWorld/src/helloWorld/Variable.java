package helloWorld;

public class Variable {

	public static void main(String[] args) {
		int num1 = 30;//=의 의미는 오른쪽의 값을 왼쪽에 대입하겠다는 의미
		int num2 = 20;
		
		int sum = 40;
//		System.out.println("sum: "+sum);
//		sum = num1 % num2  ;// 나누면 0.5가 나와야 하는데 타입이 정수라 안나오는듯
//		// /는 나머지 없이 계산
		System.out.println("sum: "+sum);
		boolean trueOfFalse = sum <= 10;//식을 담을수도 있다
		//참 아니면 거짓을 담을 수 있음
		System.out.println(trueOfFalse);//조건문쓸때?
		
		if(trueOfFalse) {//if 다음은 무조건()로 시작
			System.out.println("결과 참입니다");
		}else {
			System.out.println("결과 거짓입니다");
		}
		
	}

}
