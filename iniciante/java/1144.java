import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner (System.in);
		
		int n=sc.nextInt();
		int j=1;
		for(int i=0; i<n; i++) {
			
			System.out.println(j+" "+j*j+" "+j*j*j);
			System.out.println(j+" "+((j*j)+1)+" "+((j*j*j)+1));
			
			j++;
			
		}
 
    }
 
}
