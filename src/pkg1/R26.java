package pkg1;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class R26 {
	public static void generateCalendar(int year) throws IOException{
		int[] arr1= {31,28,31,30,31,30,31,31,30,31,30,31};
		LocalDate ld1;
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("EEE MMM-dd-yyyy");
		String date1="";
		String fname="";
		String part1,part2,part3;
		
		part1="Calendar";
		part2=String.valueOf(year);
		part3=".txt";
		fname = part1+part2+part3;
		FileWriter fw1 = new FileWriter(fname);
		
		for(int j=0;j<12;j++) {
			for(int i=1;i<arr1[j]+1;i++) {
				ld1 = LocalDate.of(year,j+1,i);
				date1=dtf1.format(ld1);
				fw1.write(date1+"\n");
				System.out.println(date1);
			}
			System.out.println();
			fw1.write("\n");
		}
		fw1.close();
	}

	public static void main(String[] args) throws IOException{
		int year=2024;
		generateCalendar(year);
		
		
		
		
		
		
		
		
		

	}

}
