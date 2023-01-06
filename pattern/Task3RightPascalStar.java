package pattern;

public class Task3RightPascalStar {

	public static void main(String[] args) {
		int a=5;
		for(int i=2; i<a;i++) {
			for(int j=1;j<i;j++)			
				System.out.print("* ");
				System.out.println(" ");
			
	}
		for(int i=1;i<a;i++) {
			for(int j=0;j<a-i;++j) {
				System.out.print("* ");
	}
			System.out.println(" ");
		}
		
	}
	

}
