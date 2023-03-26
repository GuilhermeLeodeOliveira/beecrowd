import java.util.Scanner;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		int j=19, aux;
		int n[]= new int[20];
		
		for(int cont=0; cont<20; cont++) {
			n[cont]=sc.nextInt();
		}
		
		for(int i=0; i<10; i++) {
			
			aux=n[i];
			n[i]=n[j];
			n[j]=aux;
			j--;
		}
		
		for(int i=0; i<20; i++) {
			System.out.println("N["+i+"] = "+n[i]);
		}
		
	}
}
