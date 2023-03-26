import java.util.Scanner;
import java.io.IOException;
import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("0.0000");
		
		int i;
		double x=sc.nextDouble();
		double n[] = new double[100];
		
		n[0]=x;
		
		for(i=1; i<100; i++) {
			
			n[i]=n[i-1]/2;
			
		}
		
		for(i=0; i<100; i++) {
			System.out.println("N["+i+"] = "+df.format(n[i]));
		}
		
	}
}
