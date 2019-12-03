 package com.xyz;

import java.util.Date;
import org.apache.commons.lang3.time.DateFormatUtils;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello, Today is "+ getToday());
	}
	public static String getToday() {
		String today = DateFormatUtils.format(new Date(), "dd-MMM-yyyy");
		return today;
	}
}
