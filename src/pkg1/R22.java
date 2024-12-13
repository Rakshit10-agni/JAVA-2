package pkg1;
import java.util.List;
import java.util.ArrayList;

public class R22 {

	public static void main(String[] args) {
		List <String>months=new ArrayList<>();
		List <Integer>days=new ArrayList<>();
		List <String>dayOfWeek=new ArrayList<>();
		months.add("Jan");
		months.add("Feb");
		months.add("Mar");
		months.add("Apr");
		months.add("May");
		months.add("Jun");
		months.add("Jul");
		months.add("Aug");
		months.add("Sep");
		months.add("Oct");
		months.add("Nov");
		months.add("Dec");
		days.add(31);
		days.add(28);
		days.add(31);
		days.add(30);
		days.add(31);
		days.add(30);
		days.add(31);
		days.add(31);
		days.add(30);
		days.add(31);
		days.add(30);
		days.add(31);
		dayOfWeek.add("Mon");
		dayOfWeek.add("Tue");
		dayOfWeek.add("Wed");
		dayOfWeek.add("Thu");
		dayOfWeek.add("Fri");
		dayOfWeek.add("Sat");
		dayOfWeek.add("Sun");
		for(int j=0;j<12;j++) {
			for(int i=1;i<days.get(j)+1;i++) {
				System.out.println(months.get(j)+" "+i);
			}
			System.out.println();
		}
	}

}
