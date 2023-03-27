import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
		Scanner sc = new Scanner (System.in);
		
		int x=sc.nextInt();
		int z=sc.nextInt();
		int i=0, result=0;
		
		while(z<=x) {
			z=sc.nextInt();
		}
				
		while(result<z) {
			
			result=result+x;
			i++;
			x++;

		}
		
		System.out.println(i);

    }
 
}
