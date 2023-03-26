import java.util.Scanner;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		double a[]= new double[100];
		
		for(int cont=0; cont<100; cont++) {
			a[cont]=sc.nextDouble();
		}
		
		for(int i=0; i<100; i++) {
			if(a[i]<=10) {
				System.out.println("A["+i+"] = "+a[i]);
			}
		}
		
	}
}
