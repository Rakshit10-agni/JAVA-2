package pkg1;
import java.util.List;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;

public class R22 {

	public static void main(String[] args) throws IOException{
		List <String>months=List.of("Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec");
		List <Integer>days=List.of(31,28,31,30,31,30,31,31,30,31,30,31);
		List <String>dayOfWeek=List.of("Mon","Tue","Wed","Thu","Fri","Sat","Sun");
		FileWriter fw1=new FileWriter("Calendar2025.txt");
		int count=2;
		String s1="";
		for(int j=0;j<12;j++) {
			for(int i=1;i<days.get(j)+1;i++) {
				s1=months.get(j)+" "+i+" "+dayOfWeek.get(count%7);
				fw1.write(s1+"\n");
				count++;
			}
			fw1.write("\n");
			System.out.println();
		}
		fw1.close();
		
	}

}
