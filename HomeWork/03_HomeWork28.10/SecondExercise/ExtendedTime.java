
public class ExtendedTime extends SimpleTime {

	// ------------ATTRIBUTES------------

	private boolean is24Hours = true;

	// ------------GET & SET------------

	public boolean Is24Hours() {
		return is24Hours;
	}

	public void setIs24Hours(boolean is24Hours) {
		this.is24Hours = is24Hours;
	}

	// ------------CONSTURCTOURS------------
	public ExtendedTime(int hour, int minutes, int seconds, boolean is24Hours) {
		super(hour, minutes, seconds);
		this.is24Hours = is24Hours;
	}

	public ExtendedTime() {
		setHour(0);
		setMinutes(0);
		setSeconds(0);
		is24Hours = true;

	}

	// AM = BEFORE NOON
	// PM = AFTER NOON

	@Override
	public String toString() {

		if (is24Hours) {
			return super.toString() + "" + " \nExtendedTime [is24Hours=" + is24Hours + "]";
		}

		else {
			if (super.getHour() >= 12) {
				super.setHour(super.getHour() - 12);
				return super.toString() + "PM" + "\nExtendedTime [is24Hours=" + is24Hours + "]";
			} else {
				return super.toString() + "AM" + "\nExtendedTime [is24Hours=" + is24Hours + "]";
			}
		}

	}

}
