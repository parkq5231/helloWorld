package Variable2;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("김김");
		s1.setNo(121212);
		s1.setNo(121213);
		s1.setEscore(80);
		s1.setMscore(70);
		s1.studentInfo();
		s1.totalScore();
		
		System.out.println("-----------------");
		
		System.out.println(s1.getName());
		
		
	}// end of main

}// end of class
