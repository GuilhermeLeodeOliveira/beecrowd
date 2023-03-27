import java.util.Scanner;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int cont=1, i, pa, pb;
		int t=sc.nextInt();
		double ga, gb;
		
		while(cont<=t) {
			i=0;
			pa=sc.nextInt();
			pb=sc.nextInt();
			
			ga=sc.nextDouble();
			gb=sc.nextDouble();
			
			while(pa<=pb) {
				
				pa+=(pa*ga)/100;
				pb+=(pb*gb)/100;
				i++;

				if(i>100) {
					break;
				}
				
			}
			
			if (i > 100) {
        		System.out.println("Mais de 1 seculo.");
        	} else {
        		System.out.println(i + " anos.");
        	}
			
			cont++;
		
		}
		
		
	}
}
