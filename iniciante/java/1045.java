import java.io.IOException;
import java.util.Scanner;

public class Main {

   public static void main(String[] args) throws IOException {

	   Scanner sc = new Scanner (System.in);

	   double a = sc.nextDouble();
	   double b = sc.nextDouble();	   
	   double c = sc.nextDouble();
	   double aux;

	   if(a<=b && b<=c) {
		   aux=a;
		   a=c;
		   c=aux;
		   
	   }else if(b<=a && a<=c) {
		   aux=b;
		   b=a;
		   a=c;
		   c=aux;
		   
	   }else if(a<=c && c<=b) {
		   aux=a;
		   a=b;
		   b=c;
		   c=aux;
		   
	   }else if(b<=c && c<=a) {
		   aux=b;
		   b=c;
		   c=aux;
		   
	   }else if(c<=a && a<=b) {
		   aux=c;
		   c=a;
		   a=b;
		   b=aux;
	   }



	   if(a>=b+c) {
		   System.out.println("NAO FORMA TRIANGULO");
	   
	   }else if(a*a==b*b+c*c) {
		   System.out.println("TRIANGULO RETANGULO");
	   
	   }else if(a*a>b*b+c*c) {
		   System.out.println("TRIANGULO OBTUSANGULO");
	   
	   }else if(a*a<b*b+c*c) {
		   System.out.println("TRIANGULO ACUTANGULO");
	   
	   }
	   
	   if(a==b && b==c) {
		   System.out.println("TRIANGULO EQUILATERO");
	   
	   }else if(a==b && b!=c) {
		   System.out.println("TRIANGULO ISOSCELES");
		   
	   }else if(a==c && c!=b) {
		   System.out.println("TRIANGULO ISOSCELES");
		   
	   }else if(b==c && c!=a) {
		   System.out.println("TRIANGULO ISOSCELES");
		   
	   }
	   
   }

}
