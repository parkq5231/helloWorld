package Variable2;

public class Student {
	private String name;
	private int no;
	private double Escore;
	private double Mscore;
	
	//메소드1
	public void setName(String name) {
		this.name = name;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public void setEscore(double Es) {
		this.Escore = Es;
	}
	public void setMscore(double Ms) {
		this.Mscore = Ms;
	}

	//메소드2
	public String getName() {
		System.out.println("이름여깄음");
		return this.name;
	}

	public int getno() {
		return this.no;
	}

	public double getEscore() {
		return this.Escore;
	}

	public double getMscore() {
		return this.Mscore;
	}
	//메소드 3
	public void studentInfo() {
		System.out.println("이름: "+name+" 학번: "+no+" 입니다.");
	}
	public double totalScore() {
		System.out.println("합계점수 :"+(Mscore+Escore));
		return this.Escore+Mscore;
		
	}
	
	

}// end class
