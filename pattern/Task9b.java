package pattern;

public class Task9b {

	public static void main(String[] args) {
		int a=5;
		//no.of.row 
		for(int i=0; i<a;i++) {
			//no.of.column add by row(i)
			for(int j=0;j<=i;j++) 	{
				//print left up
				System.out.print("* ");
			}
			//no.of.column sub by row(i)
		for(int j=1;j<a-i;j++) {
			System.out.print("    ");
		}
		//no.of.column add by row(i)
		for(int k=0;k<=i;k++) {
			//print right up
			System.out.print("* ");
		}
		System.out.println("");
		}
		//no.of.row
		for(int i=0;i< a;i++) {
			//no.of.column sub by row
			for(int j=0;j<a-i;++j) {
				//print left down
				System.out.print("* ");
	}		
			//no.of.column
			for(int j=0;j<i;++j) {
				System.out.print("    ");				
			}
			//no.o.column sub by row
			for(int j=a;j>i;j--) {
				//print right down
			System.out.print("* ");
			}
			System.out.println(" ");
	}
	}	
}
