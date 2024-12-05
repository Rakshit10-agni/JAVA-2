package pkg1;
import java.io.FileWriter;
import java.io.IOException;

public class R13 {

	public static void main(String[] args) throws IOException{
		String result1="";
		String fname="";
		int start=3;
		int end=5;
		FileWriter fw1;
		for(int j=start;j<end+1;j++) {
			//3.txt,4
			String part1=j+"";
			String part2=".txt";
			fname=part1+part2;
			fw1=new FileWriter(fname);
			for(int i=1;i<11;i++) {
				result1=j+"*"+i+"="+(j*i);
				fw1.write(result1);
				fw1.write("\n");
				System.out.println(result1);
			}
			fw1.close();
			System.out.println();
		}
	}
}
