package pkg1;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class R17 {

	public static void main(String[] args)throws IOException {
//		eg 8_20210828_110503.txt
		LocalDateTime ldt1=LocalDateTime.now();
		DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("yyyyMMdd_hhmmss");
		String date1=dtf1.format(ldt1);
		System.out.println(ldt1);
		System.out.println(date1);
		
		
		
		
		
		
		
	}

}
