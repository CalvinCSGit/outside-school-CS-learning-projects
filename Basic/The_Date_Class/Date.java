package The_Date_Class;

public class Date {
	
	int day, month, year;
	
	
	Date(int day, int month, int year){
		if (day >= 1 && day <= 31 && month >= 1 && month <= 12 && year >= 1900 && year <= 9999) {
			this.setDate(day, month, year);
		}else {
			throw new IllegalArgumentException("Numbers between the ranges of Day [1 ,31]  Month [1, 12]  Year [1900, 9999]");
		}
		
	}
	
	public int getDay() {
		return this.day;
	}
	
	public int getMonth() {
		return this.month;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	
	public void setDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	@Override
	public String toString() {
		String formatted = String.format("%02d", this.getDay()) + "." + String.format("%02d", this.getMonth()) + "." + this.getYear();
		return formatted;
	}
}
