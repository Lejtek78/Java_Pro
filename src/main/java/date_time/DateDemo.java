package date_time;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.Temporal;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class DateDemo {

	public static void main(String[] args) {
		System.out.println("\n---------- Obsolete Date ----------\n");
		obsoleteDate();
		System.out.println("\n---------- Gregorian Calendar ----------\n");
		gregorianCalendar();
		System.out.println("\n---------- Joda-Time API ----------\n");
		newDate();
		
		System.out.println("\n---------- DateTime API ----------\n");
		dateTime();
	}
	
	public static void obsoleteDate() {
		System.out.println(System.currentTimeMillis());
		System.out.println(Long.MAX_VALUE);
		
		Date currentDate = new Date(System.currentTimeMillis());
		
		System.out.println(currentDate);
		// Year
		System.out.println(currentDate.getYear() + 1900);
		// Month: 0 = January, 1 = February, ...
		System.out.println(currentDate.getMonth() + 1);
		// Day
		System.out.println(currentDate.getDate());
		// Weekday: 0 = Sunday, 1 = Monday, 2 = Tuesday, ...
		System.out.println(currentDate.getDay());
		
		Date date = new Date("01/01/1980");
		System.out.println(date);
	}
	
	public static void gregorianCalendar() {
		GregorianCalendar gregCal = new GregorianCalendar();
		TimeZone timeZone = gregCal.getTimeZone();
		System.out.println(timeZone.getID());
		System.out.println(timeZone.getDisplayName());
		System.out.println();
		
		gregCal.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
		TimeZone tz = gregCal.getTimeZone();
		System.out.println(tz);
		System.out.println(tz.getID());
		System.out.println(tz.getDisplayName());
		System.out.println();
		
		System.out.println(gregCal.isLeapYear(2026));
		System.out.println(gregCal.get(GregorianCalendar.DATE));
		System.out.println(gregCal.get(GregorianCalendar.MONTH));
		System.out.println(gregCal.get(Calendar.DATE));
		System.out.println(gregCal.get(Calendar.MONTH));
		
	}
	
	public static void newDate() {
		
		System.out.println("Lokale Zeit:");
		LocalDate localDate = LocalDate.now(Clock.systemDefaultZone());
		System.out.println(localDate);
		
		LocalTime localTime = LocalTime.now(Clock.systemDefaultZone());
		System.out.println(localTime);
	
		System.out.println("\nZeit in New York:");
		LocalDate americaDate = LocalDate.now(ZoneId.of("America/New_York"));
		System.out.println(americaDate);
		
		LocalTime americaTime = LocalTime.now(ZoneId.of("America/New_York"));
		System.out.println(americaTime);
		
		System.out.println("\nZeit in Mexico City:");
		LocalDate mexicoDate = LocalDate.now(ZoneId.of("America/Mexico_City"));
		System.out.println(mexicoDate);
		
		LocalTime mexicoTime = LocalTime.now(ZoneId.of("America/Mexico_City"));
		System.out.println(mexicoTime);
		
		System.out.println("\nZeit in Moskau:");
		LocalDate moscowDate = LocalDate.now(ZoneId.of("Europe/Moscow"));
		System.out.println(moscowDate);
		
		LocalTime moscowTime = LocalTime.now(ZoneId.of("Europe/Moscow"));
		System.out.println(moscowTime);
		
		System.out.println("\n1 Day after Unix-Epoch (01.01.1970):");
		LocalDate date1 = LocalDate.ofEpochDay(1);
		System.out.println(date1);
		
		System.out.println("\nDate manually set:");
		LocalDate date2 = LocalDate.parse("2020-11-12");
		System.out.println(date2 + " - object address at heap:     " + Integer.toHexString(date2.hashCode()));
		date2 = date2.plusDays(5);		// here it will create a new object by plus-Methods
		System.out.println(date2 + " - new object address at heap: " + Integer.toHexString(date2.hashCode()));
		
		System.out.println("\nTime manually set:");
		LocalTime time2 = LocalTime.parse("13:15:33");
		System.out.println(time2 + " - object address at heap:     " + Integer.toHexString(time2.hashCode()));
		time2 = time2.plusMinutes(5);
		System.out.println(time2 + " - new object address at heap: " + Integer.toHexString(time2.hashCode()));
		
		LocalDateTime dateTime = LocalDateTime.now(Clock.systemDefaultZone());
		System.out.println(dateTime);
		
		System.out.println("\nDateTime manually set:");
		LocalDateTime dateTime2 = LocalDateTime.parse("2020-12-07T08:00:20");
		System.out.println(dateTime2);
		
	}
	
	public static void dateTime() {
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt);
		
		OffsetDateTime odt = OffsetDateTime.now();
		System.out.println(odt);
		
		ZonedDateTime zdt2 = ZonedDateTime.now(ZoneId.of("America/Mexico_City"));
		System.out.println(zdt2);
		
		MonthDay md = MonthDay.now();
		System.out.println(md);
		
		YearMonth ym = YearMonth.now();
		System.out.println(ym);

		Year year = Year.now();
		System.out.println(year);
		
	
		Period period = Period.of(5, 2, 10);
		System.out.println(period);
		LocalDate periodDateFromNow = (LocalDate) period.addTo(LocalDate.now());
		System.out.println(periodDateFromNow);
		
		Instant instant = Instant.now();
		System.out.println(instant);
		
		
	}
	
	
}

