package com.nt.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;

public class DateTimeDemo {
	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		System.out.println(date);
		LocalTime time=LocalTime.now();
		System.out.println(time);
		
		//get day month year our own format
		int dd=date.getDayOfMonth();
		int mm=date.getMonthValue();
		int yyyy=date.getYear();
		
		System.out.println(dd+".."+mm+".."+yyyy);
		System.out.printf("%d-%d-%d",dd,mm,yyyy);
		
		//get hour minute second nanosecond from localTime
		int h=time.getHour();
		int m=time.getMinute();
		int s=time.getSecond();
		int n=time.getNano();
		System.out.printf("\n%d:%d:%d:%d \n",h,m,s,n);
		
		
		//we can handle both date and time with same class
		LocalDateTime d1=LocalDateTime.now();
		System.out.println(d1);
		int dd1=d1.getDayOfMonth();
		int mm1=d1.getMonthValue();
		int yyyy1=d1.getDayOfYear();
		System.out.printf("%d-%d-%d",dd1,mm1,yyyy1);
		
		int h1=d1.getHour();
		int m1=d1.getMinute();
		int s1=d1.getSecond();
		int n1=d1.getNano();
		System.out.printf("\n%d:%d:%d:%d \n",h1,m1,s1,n1);

       //Represend our date and time
		LocalDateTime dt=LocalDateTime.of(1998, 10, 02, 9, 55);
		System.out.println(dt);
		
		System.out.println("before six months "+dt.minusMonths(6));
		System.out.println("After six months "+dt.plusMonths(6));
		
		
		
		//print period of date time hour minute second
		
		LocalDate birthday=LocalDate.of(1992, 12, 02);
		LocalDate today=LocalDate.now();
		Period p=Period.between(birthday, today);
		System.out.printf("%d year %d months %d days \n",p.getYears(),p.getMonths(),p.getDays());
		
		
		
		//get zone
		ZoneId z=ZoneId.systemDefault();
		System.out.println(z);
		System.out.println();
		
	}

}
