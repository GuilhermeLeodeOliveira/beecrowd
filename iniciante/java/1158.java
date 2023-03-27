import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int n=sc.nextInt();
		int cont=1, soma = 0;
		
		while(cont<=n) {
		
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		if(x%2==0) {
			
			x++;
			
		}

		for(int i=1; i<=y; i++) {
			soma+=x;
			x=x+2;
		}
		
		System.out.println(soma);
		cont++;
		soma=0;
		}
		
	}
}
