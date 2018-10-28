
public class SimpleTime {

	// ------------ATTRIBUTES------------

	private int hour;
	private int minutes;
	private int seconds;

	// ------------GET & SET------------

	public int getHour() {
		return hour;
	}

	public int getMinutes() {
		return minutes;
	}

	public int getSeconds() {
		return seconds;
	}
	
	public void setHour(int hour) {
		this.hour = hour;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}
	// ------------CONSTORCTOURS------------



	public SimpleTime(int hour, int minutes, int seconds) {
		super();
		if (hour < 25 && hour >= 0) {
			this.hour = hour;
		} else {
			System.out.println("Enter hour between 0-12");
		}
		if (minutes <= 60 && minutes >= 0) {
			this.minutes = minutes;
		} else {
			System.out.println("Enter minutes between 0-60");
		}
		if (seconds <= 60 && seconds >= 0) {
			this.seconds = seconds;
		} else {
			System.out.println("Enter seconds between 0-60");
		}
	}

	public SimpleTime() {
		super();
		this.hour = 0;
		this.minutes = 0;
		this.seconds = 0;
	}

	// ------------FUNCTIONS------------

	public void setTime(int hour, int minutes, int seconds) {
		if (hour < 25 && hour >= 0) {
			this.hour = hour;
		} else {
			System.out.println("Enter hour between 0-12");
		}
		if (minutes <= 60 && minutes >= 0) {
			this.minutes = minutes;
		} else {
			System.out.println("Enter minutes between 0-60");
		}
		if (seconds <= 60 && seconds >= 0) {
			this.seconds = seconds;
		} else {
			System.out.println("Enter seconds between 0-60");
		}
		System.out.println("Time has Set!");
	}

	public void addHour(int hourToAdd) {
		while ((hour + hourToAdd) > 24) {
			hourToAdd -= 24;
		}
		hour += hourToAdd;
	}

	public void addMin(int minToAdd) {
		int temphours = 0;
		while ((minutes + minToAdd) >= 60) {
			minToAdd -= 60;
			temphours++;
		}

		minutes += minToAdd;
		addHour(temphours);
	}

	public void addSec(int secToAdd) {
		int tempminutes = 0;
		while ((seconds + secToAdd) >= 60) {
			secToAdd -= 60;
			tempminutes++;
		}
		seconds += secToAdd;
		addMin(tempminutes);
	}

	public void tick() {
		seconds++;
		System.out.println("tock");
	}

	public void addSimpleTime(SimpleTime obj) {
		obj.hour = hour;
		obj.minutes = minutes;
		obj.seconds = seconds;
	}

	@Override
	public String toString() {
		return "SimpleTime [" + hour + ":" + minutes + ":" + seconds + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SimpleTime other = (SimpleTime) obj;
		if (hour != other.hour)
			return false;
		if (minutes != other.minutes)
			return false;
		if (seconds != other.seconds)
			return false;
		return true;
	}

}
