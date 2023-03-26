import java.io.IOException;
import java.util.Scanner;

public class Main {

   public static void main(String[] args) throws IOException {

	   Scanner sc = new Scanner(System.in);

	   int x = sc.nextInt();
	   int y =sc.nextInt();
	   int result=0;
	   
	   if(x>y) {
		   
		   for(int i=y;x>=i;i++) {

			   if(i%13!=0) {
				   result += i;
			   }
		   }
		   
	   }else{
		   
		   for(int i=x;y>=i; i++) {

			   if(i%13!=0) {
				   result+=i;
			   }
		   }
	   }
	   
	   System.out.println(result);
	   
   }

}
