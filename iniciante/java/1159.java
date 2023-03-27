import java.util.Scanner;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int x, soma=0;
		
		x=sc.nextInt();
		
		while(x!=0) {
			
			if(x%2!=0) {
				
				x++;
				
			}
			
			for(int i=1; i<=5; i++) {
				
				soma+=x;
				x+=2;
				
			}
			
			System.out.println(soma);
			x=sc.nextInt();
			soma=0;
			
		}
		
		
	}
}
