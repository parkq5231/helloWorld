package variable6;

public class Member {
	private int no;
	private String name;
	private String number;
	private String className;
	//생성자
	public Member(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	public Member(int no, String name, String number, String className) {
		super();
		this.no = no;
		this.name = name;
		this.number = number;
		this.className = className;
	}
	//메소드
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
		return "Member [no=" + no + ", name=" + name + ", number=" + number + ", className=" + className + "]";
	}
	

}//end of main
