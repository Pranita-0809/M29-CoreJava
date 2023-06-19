package org.tnsif.datetime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.OffsetDateTime;


@SuppressWarnings("unused")
public class DateTimeDemo {

	public static void main(String[] args) {
		// Program to demonstrate pn Date time API 
LocalDate obj1=LocalDate.of(1999, 8, 9);
System.out.println(obj1);
LocalDateTime obj2=LocalDateTime.now();
System.out.println(obj2);
LocalDate obj3=LocalDate.now();
System.out.println(obj3);
ZonedDateTime obj4=ZonedDateTime.now();
System.out.println(obj4);
OffsetDateTime obj5=OffsetDateTime.now();
System.out.println(obj5);

	}

}
