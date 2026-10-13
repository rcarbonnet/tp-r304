package fr.unilim.iut.tirepressuremonitoringsystem;

public class Alarm
{
    private final double lowThreshold = 17;
    private final double highThreshold = 21;
    private SafetyRange safetyRange;

    private Sensor sensor;
    private boolean alarmOn;

    public Alarm(Sensor sensor) {
		this.sensor=sensor;
		this.alarmOn = false;
		this.safetyRange = new SafetyRange(17,21);
	}
    
    public Alarm() {
    	this(new PressureSensor());
       }

	public void check()
    {
        double value = probe();

        if (isNotSafe(value))
        {
            activate();
        }
    }

	private void activate() {
		alarmOn = true;
	}

	private double probe() {
		return sensor.popValue();
	}

	private boolean isNotSafe(double value) {
	    return safetyRange.doesNotContain(value);
	}

    public boolean isAlarmOn()
    {
        return alarmOn; 
    }
}
