package pkg1;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class R9 {

	public static void main(String[] args) throws FileNotFoundException{
		String fname="in1.txt";
		File f1=new File(fname);
		Scanner scanner=new Scanner(f1);
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
