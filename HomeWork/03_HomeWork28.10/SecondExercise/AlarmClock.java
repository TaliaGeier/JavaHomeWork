
public class AlarmClock {

	// ------------ATTRIBUTES------------

	private ExtendedTime currentTime;
	private Alarm[] alarmTime = new Alarm[5];

	// ------------GET & SET------------

	public ExtendedTime getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(ExtendedTime currentTime) {
		this.currentTime = currentTime;
	}

	// ------------CONSTORCTOURS------------

	public AlarmClock(ExtendedTime currentTime) {
		super();
		this.currentTime = currentTime;
		for (int i = 0; i < alarmTime.length; i++) {
			alarmTime[i].setTime(currentTime);
		} 
	}

	// ------------FUNCTIONS------------
	
	public Alarm SetAlarm (int AlertNum, boolean isSnoozy , int snoozyTime) {
		
		alarmTime[AlertNum].setIsSet(true);
		
		alarmTime[AlertNum].setIsSnooze(isSnoozy);
		
		alarmTime[AlertNum].setSnoozeTime(snoozyTime);
		
		alarmTime[AlertNum].setTime(alarmTime[AlertNum].getTime());
		
		
		
		return alarmTime[AlertNum];
		
	}
	
	

		
	}

