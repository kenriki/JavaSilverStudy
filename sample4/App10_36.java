package demo.sample4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App10_36 {
	public static void main(String[] args) {
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = LocalDate.of(2024, 7, 4);
		LocalDate date3 = LocalDate.parse("2024-07-04", DateTimeFormatter.ISO_DATE);

		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);
	}
}
