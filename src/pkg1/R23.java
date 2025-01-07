package pkg1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class R23 {

	public static void main(String[] args) {
		DateTimeFormatter dtf1=DateTimeFormatter.ofPattern(null);
		LocalDate ld1=LocalDate.of(2025, 1, 1);
		System.out.println(ld1.getDayOfWeek());

	}

}
