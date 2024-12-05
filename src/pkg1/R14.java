package pkg1;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class R14 {

	public static void main(String[] args) throws IOException{
		String dir1="TABLES/";
		String result1="";
		String fname="";
		int start=100;
		int end=200;
		FileWriter fw1;
		File f1;
		DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("_yyyyMMdd_hhmmss");
		LocalDateTime today;
		
		f1=new File(dir1);
		f1.mkdir();
		
		for(int j=start;j<end+1;j++) {
			today=LocalDateTime.now();
			String part1=j+"";
			String part2=dtf1.format(today);
			String part3=".txt";
			fname=dir1+part1+part2+part3;
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
