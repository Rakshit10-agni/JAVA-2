package pkg1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class R25 {

	public static void main(String[] args) {
		List<String>list1 = new ArrayList<>();
		List<List<Integer>>days1 = new ArrayList<>();
		list1.add("Mon");
		list1.add("Tue");
		list1.add("Wed");
		list1.add("Thu");
		list1.add("Fri");
		list1.add("Sat");
		list1.add("Sun");
		days1.add(Arrays.asList(30,31,1,2,3,4,5));
		for(int i=0;i<7;i++) {
			System.out.print(list1.get(i)+" ");
		}
		
		
		

	}

}
