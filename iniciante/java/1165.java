import java.util.Scanner;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int i, x, cont=0, sum=0;
		int caso=sc.nextInt();
		
		while(caso>cont) {
			
			x=sc.nextInt();
			
			for(i=1; i<=x; i++) {
				
				if(x%i==0) {
					sum++;
				}
				
			}
			
			if(sum==2) {
				System.out.println(x+" eh primo");
			}else {
				System.out.println(x+" nao eh primo");
			}
			
			cont++;
			sum=0;
		}
		
		
	}
}
