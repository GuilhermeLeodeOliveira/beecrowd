import java.io.IOException;
import java.util.Scanner;

public class Main {

   public static void main(String[] args) throws IOException {

	   Scanner sc = new Scanner(System.in);
	   
	   int caso=sc.nextInt();
	   
	   String j1, escolha1, j2, escolha2;
	   int n1, n2, result;
	   
	   for(int i=0; i<caso; i++) {
		   
		   j1=sc.next();
		   escolha1=sc.next();
		   j2=sc.next();
		   escolha2=sc.next();
		   
		   n1=sc.nextInt();
		   n2=sc.nextInt();
		   
		   result=n1+n2;
		   
		   if(result%2==0 && escolha1.equalsIgnoreCase("PAR")) {
			   System.out.println(j1);
		   }else if(result%2!=0 && escolha1.equalsIgnoreCase("IMPAR")) {
			   System.out.println(j1);
		   }else {
			   System.out.println(j2);
		   }
		  
	   }
   }
}