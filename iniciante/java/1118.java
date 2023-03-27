import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        DecimalFormat df=new DecimalFormat("0.00");
		Scanner sc = new Scanner (System.in);
		
		double media;
		
		for(int x=1; x==1; ){
			
			double n1=sc.nextDouble();
			while(n1<0 || n1>10) {
				System.out.println("nota invalida");
				n1=sc.nextDouble();
			}
			
			double n2=sc.nextDouble();
			while(n2<0 || n2>10) {
				System.out.println("nota invalida");
				n2=sc.nextDouble();
			}
			
			media = (n1+n2)/2;
			
			System.out.println("media = "+df.format(media));
			
			System.out.println("novo calculo (1-sim 2-nao)");
			x=sc.nextInt();
			while(x>=3 || x<=0) {
				System.out.println("novo calculo (1-sim 2-nao)");
				x=sc.nextInt();	
			}
			
			if(x==2) {
				return;
			}
			
		}
 
    }
 
}
