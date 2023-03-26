import java.util.Scanner;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		int r1, r2, result;
		int t=sc.nextInt();
		for(int cont=0; cont<t; cont++) {
			
			r1=sc.nextInt();
			r2=sc.nextInt();
			
			result=r1+r2;
			
			System.out.println(result);
			
		}
	}
}
