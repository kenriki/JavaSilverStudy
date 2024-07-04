package demo.sample5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * コンパイルエラーとなることを確認する
 * Exception in thread "main" java.time.temporal.UnsupportedTemporalTypeException: Unsupported field: HourOfDay
 */
public class App10_53 {

	public static void main(String[] args) {
		String date = LocalDate.parse("2024-07-04")
				.format(DateTimeFormatter.ISO_DATE_TIME);

		System.out.println(date);

	}

}
