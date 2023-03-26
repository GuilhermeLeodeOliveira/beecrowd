import java.util.Scanner;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int n=sc.nextInt();
		int vet[]= new int[10];
		vet[0]=n;
		System.out.println("N["+0+"] = "+vet[0]);
		
		for(int i=1; i<10; i++) {

			vet[i]=vet[i-1]*2;
			System.out.println("N["+i+"] = "+vet[i]);
			
		}
		
	}
}
