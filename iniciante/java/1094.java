import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;


public class Main {

   public static void main(String[] args) throws IOException {

	   Scanner sc = new Scanner(System.in);
	   DecimalFormat df = new DecimalFormat ("00.00");

	   int caso = sc.nextInt();
	   int x, total=0, tc = 0, tr = 0, ts = 0;
	   double pc, ps, pr;
	   char tipo;
	   
	   for (int i=0; i<caso; i++) {
		   
		   x=sc.nextInt();
		   tipo=sc.next().charAt(0);
		   total +=x;
		   
		   if(Character.compare(tipo, 'C')==0) {
			   tc+=x;
		   }else if(Character.compare(tipo, 'R')==0) {
			   tr+=x;
		   }else {
			   ts+=x;
		   }
		   
	   }
	    
	   pc = (double) (tc*100)/total;
	   pr = (double) (tr*100)/total;
	   ps = (double) (ts*100)/total;
	   
	   System.out.println("Total: "+total+" cobaias");
	   
	   System.out.println("Total de coelhos: "+tc);
	   System.out.println("Total de ratos: "+tr);
	   System.out.println("Total de sapos: "+ts);
	   
	   System.out.println("Percentual de coelhos: "+df.format(pc)+" %");
	   System.out.println("Percentual de ratos: "+df.format(pr)+" %");
	   System.out.println("Percentual de sapos: "+df.format(ps)+" %");

	   
   }

}
