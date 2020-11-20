package Variable2;

public class VariableExample {
	public static void main(String[] args) {

		Person p1 = new Person("Choi", 20, 175.5, 72.4);
		/*
		 * p1.name = "Hong"; p1.age = -10; p1.height = 178.8;
		 */
		System.out.println("p1의 이름" + p1.getName());
		System.out.println("p1의 나이" + p1.getAge());
		System.out.println("p1의 키" + p1.getHeight());

		System.out.println("= ===========================");

		p1.setName("홍");
		p1.setAge(11);
		p1.setHeight(186.2);

		p1.showInfo();

		Person p2 = new Person();
		p2.setName("황");
		p2.setAge(18);
		p2.setHeight(176.2);
		p2.showInfo();

		Person p3 = new Person();
		p3.setName("박");
		p3.setAge(20);
		p3.setHeight(126.2);

		p3.showInfo();

		/*
		 * Person[] persons = { p1, p2, p3 }; for (Person per : persons) {
		 * per.showInfo();
		 * 
		 */
		/*
		 * System.out.println(per.name); System.out.println(per.age);
		 * System.out.println(per.height);
		 * 
		 * }
		 * 
		 * System.out.println(p1.name); System.out.println(p1.age);
		 * System.out.println(p1.height); System.out.println(p1.weight);
		 */
	}// end of main
}
