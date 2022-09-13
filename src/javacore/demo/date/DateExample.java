package javacore.demo.date;

import java.sql.Date;
import java.time.LocalTime;

public class DateExample {
	public static void main(String[] args) {
		//Vi du sql Date
		Date date = new Date(System.currentTimeMillis());
		System.out.println(date.getDate() + "/" + (date.getMonth() + 1) + "/" + (date.getYear() + 1900));
		System.out.println(date.toLocalDate().now());
		System.out.println("--------------------------------");
	
	}
}
