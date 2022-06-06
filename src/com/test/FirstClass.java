package com.test;

import java.util.Calendar;
import java.util.Date;

public class FirstClass {

	public static void main(String args[]) {
		Calendar calendar = Calendar.getInstance();
	     calendar.setTime(new Date());
	     calendar.add(Calendar.SECOND, 40/2);
	     System.out.println("calendar " +calendar.getTime());
	     
	     String s=" ";
	     System.out.println("s is "+s.trim().isEmpty());
	     
	     Date today = new Date();
	     Date scheduled =new Date(2022,06,02);
	     boolean a = scheduled.before(today);
	     long ls=1654273232613L;
	     long ltodays=1654273353805L;
	     
	     
	     System.out.println(" Valid schedule "+ (ltodays-ls));
	     
	}

}
