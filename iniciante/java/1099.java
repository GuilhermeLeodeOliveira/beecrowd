import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner (System.in);
		int x,  y, result=0;
		int caso =  sc.nextInt();

		for(int i=0; i<caso; i++) {

			x=sc.nextInt();
			y=sc.nextInt();
			result=0;
			if(x<y) {
				
				while(x<y-1) {
					x++;
					if(x%2!=0) {
						result+=x;
					}
				}
			}else if(y<x) {
				
				while(y<x-1) {
					y++;
					if(y%2!=0) {
						result+=y;
					}
				}
			}
			
			System.out.println(result);
			
		}
 
    }
 
}
