
public class Alarm {

	// ------------ATTRIBUTES------------

	private SimpleTime time;
	private Boolean isSet = false;
	private Boolean isSnooze = false;
	private int snoozeTime;

	// ------------GET & SET------------
	public SimpleTime getTime() {
		return time;
	}

	public void setTime(SimpleTime time) {
		this.time = time;
	}

	public Boolean getIsSet() {
		return isSet;
	}

	public void setIsSet(Boolean isSet) {
		this.isSet = isSet;
	}

	public Boolean getIsSnooze() {
		return isSnooze;
	}

	public void setIsSnooze(Boolean isSnooze) {
		this.isSnooze = isSnooze;
	}

	public int getSnoozeTime() {
		return snoozeTime;
	}

	public void setSnoozeTime(int snoozeTime) {
		this.snoozeTime = snoozeTime;
	}



	// ------------CONSTORCTOURS------------
	public Alarm(SimpleTime time, Boolean isSet, Boolean isSnooze, int snoozeTime) {
		super();
		this.time = time;
		this.isSet = isSet;
		this.isSnooze = isSnooze;
		this.snoozeTime = snoozeTime;
	}

	
	
	public Alarm() {
		super();
		time.setTime(0, 0, 0);
		isSet = false;
		isSnooze = false;
		snoozeTime = 0;
		
	}

	
	// ------------FUNCTIONS------------

	
	
	public void StartAlarm() {
		System.out.println("brrr brrr brr brrrr");
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alarm other = (Alarm) obj;
		if (isSet == null) {
			if (other.isSet != null)
				return false;
		} else if (!isSet.equals(other.isSet))
			return false;
		if (isSnooze == null) {
			if (other.isSnooze != null)
				return false;
		} else if (!isSnooze.equals(other.isSnooze))
			return false;
		if (snoozeTime != other.snoozeTime)
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		return true;
	}
	
	
	
}
