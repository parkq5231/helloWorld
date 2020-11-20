package variable5;

public class Member {
	private int no;
	private String name;
	private String number;
	private String className;
	// 생성자
	public Member() {// 기본생성자:매개변수X
	}
	public Member(int no, String name) {
		this.no = no;
		this.name = name;
	}
	public Member(int no, String name, String number, String className) {
		this.no = no;
		this.name = name;
		this.number = number;
		this.className = className;
	}
	// 메소드
	public int getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public String getNumber() {
		return number;
	}
	public String getClassName() {
		return className;
	}
}// end of class
