import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        DecimalFormat df=new DecimalFormat("0.00");
		Scanner sc = new Scanner (System.in);
		
		double s=1;
		double i=3;
		double deno=2;
		
		while(i<=39) {
			
			s+=i/deno;
			
			i+=2;
			deno=deno*2;
		}
		
		System.out.println(df.format(s));
 
    }
 
}
