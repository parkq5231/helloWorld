package iteration;

public class WhileMyExample {
	public static void main(String[] args) {
		int i = 0, sum = 0;
		while (true) {
			sum += i;
			if (i == 10) {
				break;
			}
			i++;
			System.out.println(i+"왼쪽은 i 오른쪽은 sum "+sum);
		}
		System.out.println(sum);

	}

}
