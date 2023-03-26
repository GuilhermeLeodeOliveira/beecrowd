import java.io.IOException;
import java.util.Scanner;


public class Main {

   public static void main(String[] args) throws IOException {

	   Scanner sc = new Scanner(System.in);

	   int c = sc.nextInt();
	   int s=0, x;
	   
	   for(int i=0; i<c; i++) {
		   
		   s = 0;
		   x=sc.nextInt();
		   
		   for(int j=0; j<x; j++) {
			   if(s%2==0) {
				   s++;
			   }else {
				   s--;
			   }
		   }
		   
		   System.out.println(s);
		   
	   }
	   
   }

}
