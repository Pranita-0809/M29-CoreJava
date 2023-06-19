package org.tnsif.datetime;
import java.time.Clock;
public class DatetimeEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Clock c= Clock.systemUTC();
System.out.println(c);
Clock c1= Clock.systemDefaultZone();
System.out.println(c1);
	}
}
