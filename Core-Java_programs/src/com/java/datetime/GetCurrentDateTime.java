package com.java.datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class GetCurrentDateTime {

	public static void main(String[] args) {
		DateTimeFormatter frm = DateTimeFormatter.ofPattern("YYYY/MM/dd HH:MM:SS");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(frm.format(now));
		
		DateTimeFormatter frm1 = DateTimeFormatter.ofPattern("MM/dd/YYYY HH:MM:SS");
		System.out.println(frm1.format(now));

	}

}
