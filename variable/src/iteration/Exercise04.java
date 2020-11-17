package iteration;

public class Exercise04 {
	public static void main(String[] args) {
		

		while (true) {
			int num = (int) (Math.random() * 6) + 1;
			int num1 = (int) (Math.random() * 6) + 1;
			
			if(num+num1!=5) {
				System.out.println("("+num+","+num1+")");
				
			}else if(num+num1==5) {
				System.out.println("("+num+","+num1+")");
				break;
			}
			
		
			
		}//end of while 

	}// end of main
}
