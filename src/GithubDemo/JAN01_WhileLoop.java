package GithubDemo;

public class JAN01_WhileLoop {
	public static void main(String[] args) {
		
		int i;
		i = 1;
		while (i <= 10) {
			System.out.println(i);			
			i++; // next value
		}System.out.println();
	
		
		for(i=1; i<=10; i++) {
			System.out.println(i);
		}System.out.println();
		
		i=1;
		do {
			
			System.out.println(i);
			
			i++;
			
		}
		while(i<=10);
		System.out.println();
		
	}
}
