import java.util.Scanner;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int vet[] = new int [10];
		
		for(int cont=0; cont<10; cont++) {
			vet[cont]=sc.nextInt();
		}
		
		for(int i=0; i<10; i++) {
			
			if(vet[i]<=0) {
				vet[i]=1;
				System.out.println("X["+i+"] = "+vet[i]);
			}else {
				System.out.println("X["+i+"] = "+vet[i]);
			}
			
		}
		
		
	}
}
