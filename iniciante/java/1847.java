import java.io.IOException;
import java.util.Scanner;

public class Main {

   public static void main(String[] args) throws IOException {

	   Scanner sc = new Scanner(System.in);
	   
	   int a=sc.nextInt();
	   int b=sc.nextInt();
	   int c=sc.nextInt();
	   
	   if(a>b && b<=c) {
		   System.out.println(":)");
		   
	   }else if(a<b && b>=c) {
		   System.out.println(":(");
	   
	   }else if(a<b && b<c && (b-a)>(c-b)) {
		   System.out.println(":(");
	   
	   }else if(a<b && b<c && (b-a)<=(c-b)) {
		   System.out.println(":)");
	   
	   }else if(a>b && b>c && (a-b)>(b-c)) {
		   System.out.println(":)");
	   
	   }else if(a>b && b>c && (a-b)<=(b-c)) {
		   System.out.println(":(");
	   
	   }else if(a==b && b<c) {
		   System.out.println(":)");
	   
	   }else if(a==b && b>c) {
		   System.out.println(":(");
	   
	   }else {
		   System.out.println(":(");
	   }
	   	   
   }

}