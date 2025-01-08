package pkg1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class R25 {

	public static void main(String[] args) throws IOException{
		String fname = "TABLES/Calendar2025.txt";
		String result1="";
		FileWriter fw1= new FileWriter(fname); 
		List<String>list1 = new ArrayList<>();
		List<Integer>list2 = List.of(31,28,31,30,31,30,31,31,30,31,30,31);
		List<String>list3 = List.of("Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec");
		list1.add("Mon");
		list1.add("Tue");
		list1.add("Wed");
		list1.add("Thu");
		list1.add("Fri");
		list1.add("Sat");
		list1.add("Sun");
		int count = 2;
		for(int j=0;j<list3.size();j++) {
			for(int i=1;i<list2.get(j)+1;i++) {
				result1=list3.get(j)+" "+i+" "+list1.get(count%7);
				fw1.write(result1+"\n");
				System.out.println(result1);
				count++;
			}
			System.out.println();
			fw1.write("\n");
		}
		fw1.close();
	}

}
