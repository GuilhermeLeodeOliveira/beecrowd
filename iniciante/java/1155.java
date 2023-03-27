import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        DecimalFormat df= new DecimalFormat("0.00");
        
        double s=1;
		for(double i=2; i<=100; i++) {
			s+=1/i;
		}
		
		System.out.println(df.format(s));
        
    }
}
