import java.util.Scanner;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		int x, cont=0, i, sum=0;
		int caso=sc.nextInt();
		
		while(caso>cont) {
			
			x=sc.nextInt();
			for(i=1; i<x; i++) {
				
				if(x%i==0) {
					
					sum+=i;
					
				}
				
				
			}
			
			if(sum==x) {
				System.out.println(x+" eh perfeito");
			}else {
				System.out.println(x+" nao eh perfeito");
			}
			sum=0;
			cont++;
		}
		
		
	}
}
