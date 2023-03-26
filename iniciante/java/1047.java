import java.io.IOException;
import java.util.Scanner;

public class Main {

   public static void main(String[] args) throws IOException {

	   Scanner s = new Scanner(System.in);
       int starth = s.nextInt();
       int startm = s.nextInt();
       int endh = s.nextInt();
       int endm = s.nextInt();
       int m = 0;
       int h = 0;

       if (starth == endh && startm == endm && starth == endm) {
       
    	   System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
       
       } else {
           
    	   if (starth > endh) {
               h = 24 - starth + endh;
           
    	   } else if (starth < endh) {
               h = 24 - (24 - endh + starth);
           }
           
           if (startm > endm) {
               m = 60 + endm - startm;
           
               if (starth == endh) {
                   h = 24 + h - 1;
           
               } else {
                   h = h - 1;
               }
           
           } else {
               m = endm - startm;
           }
       
           System.out.println("O JOGO DUROU " + h + " HORA(S) E " + m + " MINUTO(S)");
       
       }
	   
   }

}
