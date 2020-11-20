package method;

public class methodExample {
	public static void main(String[] args) {
		Math m1 = new Math();
		double sum = m1.sum(10.5, 20);
		System.out.println("결과: " + sum);

		double area = m1.getArea(5.5);
		System.out.println("넓이: " + area);

		area = m1.getRectagle(4.2);
		System.out.println("정사각형의 넓이: " + area);
		System.out.println("-----");

		area = m1.getRectagle(4.2, 2.4);
		System.out.println("직사각형의 넓이: " + area);

		int[] ary1 = { 11, 22, 33 };
		area = m1.getArySum(ary1);
		System.out.println("배열 값:" + area);

		double[] ary2 = { 23.4, 45.4, 22.1 };
		double aabb = m1.getSum(ary2);
		System.out.println("배열 값2: " + aabb);
		
		
		Person p1 = new Person("김김", 10, 135.5,32.5);
		double d1 = m1.getProperweight(p1);
		if (p1.height > d1) {
			System.out.println("체중과다...");
		} else if (p1.weight == d1) {
			System.out.println("적정체중...");
		} else {
			System.out.println("체중미달...");
		}
		
	}// end of main
}// end of class
