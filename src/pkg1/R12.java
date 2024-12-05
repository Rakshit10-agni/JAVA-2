package pkg1;
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class R12 {
	public static void main(String[] args) throws FileNotFoundException,IOException{
		File f1=new File("in2.txt");
		FileWriter fw1=new FileWriter("out1.txt");
		Scanner sc1=new Scanner(f1);
		String line1=sc1.nextLine();
		String result1="";
		String[] arr1=line1.split(",");
		int start=(Integer.parseInt(arr1[0]));
		int end=(Integer.parseInt(arr1[1]));
		for(int j=start;j<end+1;j++) {
			for(int i=1;i<11;i++) {
				result1=j+"*"+i+"="+(j*i);
				fw1.write(result1);
				fw1.write("\n");
				System.out.println(result1);
			}
			fw1.write("\n");
			System.out.println();
		}
		fw1.close();
	}
}
