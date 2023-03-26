import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

   public static void main(String[] args) throws IOException {

	   Scanner sc = new Scanner(System.in);
	   DecimalFormat df = new DecimalFormat ("0.0");

	   int c = sc.nextInt();
	   char t =sc.next().charAt(0);
	   double soma=0;
	   
	   double m[][] = new double [12][12];
	   
	   for(int i=0; i<12; i++) {
		   for(int j=0; j<12; j++) {
			   m[i][j]=sc.nextDouble();
		   }
	   }
	   
	   for(int i=0; i<m.length; i++) {
		   soma+=m[i][c];
	   }
	   
	   if(t=='M') {
		   soma= soma/m.length;
	   }
	   
	   System.out.println(df.format(soma));
	   
   }

}
