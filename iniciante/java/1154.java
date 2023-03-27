import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
		DecimalFormat df=new DecimalFormat("0.00");
		Scanner sc = new Scanner (System.in);
		double x = 0; 
		double y = 0; 
		int i; 
		double result;
		for(i=0; x>=0; i++) {
			
			x=sc.nextDouble();
			if(x>=0) {
				y+=x;
			}
			
		}
		i=i-1;
		result=y/i;
		System.out.println(df.format(result));
		
 
    }
 
}
