package helloWorld;

public class HelloWorld {
	public static void main(String[] args) {

		String name = "30";// Hong Kildong";
		name = "홍길동";
		System.out.println("My name is " + name);
		int age = 20;
		System.out.println("My age is " + age);
		double height = 170.8;
		System.out.println("내 키는 " + height + "입니다.");
		System.out.println(name + " 키는 " + height + " 입니다.");
		name = "kim";
		age = 25;
		System.out.println(name + "은 김이고 나이는 " + age + " 입니다");

		String name1 = "ㄷㄷㄷ";
		int age1 = 465;
		int height1 = 512;
		System.out.println(name1 + "은 이름이고" + age1 + "나이고" + height1 + "무게");
		System.out.println("두 사람 나이의 합은 " + (age + age1) + "입니다.");

		int num1 = 50;
		int num2 = 30;

		num2 += 5;

		System.out.println(num1 + num2);

		
		String result = (num2 % 2) == 0 ? "맞아" : "아니야";
		System.out.println(result);

	}
}
