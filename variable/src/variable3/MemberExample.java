package variable3;

public class MemberExample {
	public static void main(String[] args) {

		Member m1 = new Member();
		Member m2 = new Member();
		Member members[] = {m1,m2};
				
		m1.no = 1;
		m1.name = "홍길동";
		m1.number = "010-1234-5678";
		m1.className="스포츠댄스";
		m1.showMemberInfo();

		m2.no = 1;
		m2.name = "1234";
		m2.number = "010-5567-5678";
		m2.className="볼링";
		m2.showMemberInfo();
		
	
		for (Member num : members) {
			num.showMemberInfo();
		}
	}// end of main
}// end of class
