package lesson3.problem3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import lesson3.problem4.Circle;
import lesson3.problem4.Rectangle;
import lesson3.problem4.Triangle;

class MyDate {
	public MyDate() {
	}

	public String getformat1(int month, int day, int year) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		return (dtf.format(LocalDate.of(year, month, day))).toString();
	}

	public String getformat2(int month, int day, int year) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM dd,yyyy");
		return (dtf.format(LocalDate.of(year, month, day))).toString();
	}

	public String getformat3(int month, int day, int year) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("DDD yyyy");
		return (dtf.format(LocalDate.of(year, month, day))).toString();
	}
}