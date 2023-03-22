package The_Time_Class;

public class Time {
	
	private int hour, minute, second;
	
	Time(int hour, int minute, int second){
		if (hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59 && second >= 0 && second <= 59) {
			this.setTime(hour, minute, second);
		} else {
			throw new IllegalArgumentException("Format is hour[0, 23]  minute[0, 59]  second[0, 59]");
		}
	}
	
	public int getHour() {
		return this.hour;
	}
	
	public int getMinute() {
		return this.minute;
	}
	
	public int getSecond() {
		return this.second;
	}
	
	public void setHour(int hour) {
		if (hour >= 0 && hour <= 23) {
			this.hour = hour;
		} else {
			System.out.println("Format hour[0,23]");
		}
	}
	
	public void setMinute(int minute) {
		if (minute >= 0 && minute <= 59) {
			this.minute = minute;
		} else {
			System.out.println("Format minute[0, 59]");
		}
	}
	
	public void setSecond(int second) {
		if (second >= 0 && second <= 59) {
			this.second = second;
		} else {
			System.out.println("Format second[0, 59]");
		}
	}
	
	public void setTime(int hour, int minute, int second) {
		if (hour < 0 || hour > 23) {
			System.out.println("Hour format is hour[0, 23]");
		} else if (minute < 0 || minute > 59) {
			System.out.println("Minute format is minute[0, 59]");
		} else if (second < 0 || second > 59) {
			System.out.println("Second format is second[0, 59]");
		} else {
			this.hour = hour;
			this.minute = minute;
			this.second = second;
		}
	}
	
	@Override
	public String toString() {
		String concatenatedTime = String.format("%02d", this.getHour()) + ":" + String.format("%02d", this.getMinute()) + ":" + String.format("%02d", this.getSecond());
		return concatenatedTime;
	}
	
	public Time nextSecond() {
		if (this.hour >= 0 && this.hour <= 22 && minute == 59 && second == 59) {
			this.hour = this.hour+1;
			this.minute = 0;
			this.second = 0;
		} else if (this.hour == 23 && this.minute == 59 && this.second == 59) {
			this.hour = 0;
			this.minute = 0;
			this.second = 0;
		} else if (this.second == 59) {
			this.minute = this.minute +1;
			this.second = 0;
		} else {
			this.second += 1;
		}
		return this;
	}
	
	public Time previousSecond() {
		if (this.hour >= 1 && this.hour <= 23 && this.minute == 0 && this.second == 0) {
			this.hour = this.hour-1;
			this.minute = 59;
			this.second = 59;
		} else if (this.hour == 0 && this.minute == 0 && this.second == 0) {
			this.hour = 23;
			this.minute = 59;
			this.second = 59;
		} else {
			this.second -= 1;
		}
		return this;
	}
}
