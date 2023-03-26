import java.util.Scanner;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int i, j=0;
		int t=sc.nextInt();
		int vet[] = new int[1000];
		
		for(i=0; i<1000; i++) {
			
			if(j==t) {	
				j=0;
			}
			
			vet[i]=j;
			j++;
		}
		
		for(i=0; i<1000; i++) {
			
			System.out.println("N["+i+"] = "+vet[i]);
			
		}
		
	}
}
