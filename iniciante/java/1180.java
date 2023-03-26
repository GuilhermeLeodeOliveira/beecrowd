import java.util.Scanner;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);

		int n=sc.nextInt();
		int x=0, i, po=0, men;;
		
		int vet[]= new int[n];
		
		for(i=0; i<vet.length; i++) {
			x=sc.nextInt();
			vet[i]=x;
		}
		
		men=vet[0];
		
		for(i=1; i<vet.length; i++) {
			if(men>vet[i]) {
				men=vet[i];
				po=i;
			}
		}
		
		System.out.println("Menor valor: "+men);
		System.out.println("Posicao: "+po);
		
	}
}
