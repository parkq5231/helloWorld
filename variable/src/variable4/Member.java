package variable4;

public class Member {
	private int no;
	private String name;
	private String number;
	private String className;
	// 메소드
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	@Override
	public String toString() {
		return "Member [회원번호: " + no + ", 회원이름: " + name + ", 연락처: " + number + ", 강좌: " + className + "]";
	}
	
	
	
	
	
}// end of class
