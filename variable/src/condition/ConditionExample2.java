package condition;

public class ConditionExample2 {
	public static void main(String[] args) {
		int randomValue=(int) (Math.random() * 6)+1;
		System.out.println(randomValue);
		int score = 58;
		score /= 10;
		String grade = "";

		switch (score) {
		case 9:
		case 8:
			grade = "양호";
			break;
		case 7:
		case 6:
			grade = "보통";
			break;
		default:
			grade = "미흡";

		}
		System.out.println(score * 10 + "점은" + grade + "입니다.");

	}
}
