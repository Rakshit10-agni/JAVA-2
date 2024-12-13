package pkg1;
import java.io.File; 
import java.io.FileWriter;
import java.io.IOException;

public class R16 {

	public static void main(String[] args)throws IOException {
		String dir1="";
		String fname="";
		File f1;
		FileWriter fw1;
		
		
		dir1="TABLES/";
		f1=new File(dir1);
		f1.mkdir();
		
		fname=dir1+"Rakshit.txt";
		fw1=new FileWriter(fname);
		fw1.write("Rakshit");
		fw1.close();
		
		
		
		
	}

}
