package variable5;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member();
		System.out.println("이름: "+m1.getName());
		Member m2 = new Member(1,"HONG","010-1234-5678","수영");
		System.out.println(m2.getName());
		Member m3 = new Member(2,"HWANG");
		System.out.println(m3.getName());
	}//end of main
}//end of class
