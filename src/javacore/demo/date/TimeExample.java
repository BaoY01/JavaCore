package javacore.demo.date;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeExample {
	public static void main(String[] args) {
		LocalTime timeNow = LocalTime.now();
		System.out.println("Truoc khi format:");
		System.out.println(timeNow);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm:ss");
		String formatTime = timeNow.format(format);
		System.out.println("Sau khi format: ");
		System.out.println(formatTime);
	}
}
