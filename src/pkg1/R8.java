package pkg1;
import java.util.Scanner;

public class R8 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int start=scanner.nextInt();
		int end=scanner.nextInt();
		
		
		
		for(int j=start;j<end+1;j++) {
			for(int i=1;i<11;i++) {
				System.out.println(j+"*"+i+"="+j*i);
			}
			System.out.println();
			
		}
		
		
		
	}

}
