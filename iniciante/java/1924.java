import java.io.IOException;
import java.util.Scanner;

public class Main {

   public static void main(String[] args) throws IOException {

	   Scanner sc = new Scanner(System.in);
	   
	   int qtdCursos=sc.nextInt();
	   String curso;
	   for (int i=0; i<qtdCursos; i++) {
		   curso=sc.next();
	   }
	   
	   System.out.println("Ciencia da Computacao");
	   
   }

}