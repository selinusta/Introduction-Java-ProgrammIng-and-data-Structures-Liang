package chapter02;

public class ShowCurrentTime {
	public static void main(String[] args) {
		// Obtain the total milliseconds since midnight, Jan 1, 1970
		long totalMilliseconds = System.currentTimeMillis();

		// Obtain the total seconds since midnight, Jan 1, 1970
		long totalSeconds = totalMilliseconds / 1000;

		// Compute the current second in the minute in the hour
		long currentSecond = totalSeconds % 60;

		// Obtain the total minutes
		long totalMinutes = totalSeconds / 60;

		// Compute the current minute in the hour
		long currentMinute = totalMinutes % 60;

		// Obtain the total hours
		long totalHours = totalMinutes / 60;

		// Compute the current hour
		long currentHour = totalHours % 24;
		
		long totalDays = totalHours / 24;
		
		long avarageTotalYears = totalDays / 365;
		
		long currentDay = totalDays % 365;
		
		System.out.println("totalDays: " + totalDays);
		System.out.println("avarageTotalYears: " + avarageTotalYears);
		System.out.println("currentDay: " + currentDay);

		// Display results
		System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
		currentSecond++;
		++currentSecond;
	}
}
