/* the rest of the methods, nextMonth(), nextYear(), previousDay, previousMonth, previousYear, can all be easily done if you just think about the if else conditions, I pretty much mapped out the whole program by the end of nextDay() method. */
package The_MyDate_Class;

import java.util.HashMap;

public class MyDate {
	
	private int year, month, day;
	
	public static final String[] MONTHS = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
	public static final String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
	public static final int[] DAYS_IN_MONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public static boolean isLeapYear(int year) {
		if (year % 4 == 0 && year % 100 != 0) {
			return true;
		} else if (year % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isValidDate(int year, int month, int day) {
		int monthX = 0;
		HashMap<Integer, Integer> monthValueToDays = new HashMap<Integer, Integer>();
		for (int maxDays : DAYS_IN_MONTHS) {
			monthX++;
			monthValueToDays.put(monthX, maxDays);
			System.out.println("Month name: " + monthValueToDays.get(month) + " Month value: " + month);
		}
		if (year >= 1 && year <= 9999 && month == 2 && day == 29 && isLeapYear(year) == false) {
			System.out.println("It must be a leap year for February to have a 29th day.");
			return false;
		} else if (year >= 1 && year <= 9999 && month == 2 && day == 29 && isLeapYear(year) == true) {
			System.out.println("February the 29th exists in a leap year.");
			return true;
		} else if(year >= 1 && year <= 9999 && month >= 1 && month <= 12 && day == monthValueToDays.get(month)) {
			System.out.println("Days in month corresponds to the amount of days for the days and month that you passed.");
			return true;
		} else {
			System.out.println("Limit = [year 1 - 9999], [month 1 - 12], [day 1, 31]");
			return false;
		}
	}
	
	MyDate(int year, int month, int day) {
		if (isValidDate(year, month, day) == true) {
			this.year = year;
			this.month = month;
			this.day = day;
		} else {
			throw new IllegalArgumentException("It is not a valid date!");
		}
	}
	
	public void setDate(int year, int month, int day) {
		if (isValidDate(year, month, day) == true) {
			this.year = year;
			this.month = month;
			this.day = day;
		} else {
			System.out.println("It is not a valid date!");
		}
	}
	
	public int getYear() {
		return this.year;
	}
	
	public int getMonth() {
		return this.month;
	}
	
	public int getDay() {
		return this.day;
	}
	
	public void setYear(int year) {
		if (isValidDate(this.year, this.month, this.day) == true) {
			this.year = year;
		} else {
			throw new IllegalArgumentException("Invalid year!");
		}
	}
	
	public void setMonth(int month) {
		if (isValidDate(this.year, this.month, this.day) == true) {
			this.month = month;
		} else {
			throw new IllegalArgumentException("invalid month!");
		}
	}
	
	public void setDay(int day) {
		if (isValidDate(this.year, this.month, this.day) == true) {
		this.day = day;
		} else {
			throw new IllegalArgumentException("Invalid day!");
		}
	}
	
	@Override
	public String toString() {
		int dayValue = 0, monthValue = 0;
		int findDayOfWeek = (this.day + this.month + this.year + (this.year/4) + Math.round(this.year/100));
		HashMap<Integer, String> dayValueToDayName = new HashMap<Integer, String>();
		HashMap<Integer, String> monthValueToMonthName = new HashMap <Integer, String>();
		for (String dayName : DAYS) {
			dayValue++;
			dayValueToDayName.put(dayValue, dayName);
		}
		for (String monthName : MONTHS) {
			monthValue++;
			monthValueToMonthName.put(monthValue, monthName);
		}
		return String.format("%s %d %s %d", dayValueToDayName.get(findDayOfWeek), this.day, monthValueToMonthName.get(this.month), this.year);
	}
	
	public MyDate nextDay() {
		int monthValue = 0;
		HashMap<Integer, Integer> maxDayOfMonth = new HashMap<Integer, Integer>();
		for (int maxDay : DAYS_IN_MONTHS) {
			monthValue++;
			maxDayOfMonth.put(monthValue, maxDay);
		}
		if (this.month == 2 && this.day == 29) {
			this.setDay(1);
			this.setMonth(this.month+1);
			return this;
		} else if (this.day == maxDayOfMonth.get(this.month) && this.month == 12) {
			this.setDay(1);
			this.setMonth(1);
			this.setYear(this.year+1);
			return this;
		} else if (this.day == maxDayOfMonth.get(this.month)) {
			this.setDay(1);
			this.setMonth(this.month+1);
			return this;
		} else {
			this.setDay(this.day+1);
			return this;
		}
	}
}
