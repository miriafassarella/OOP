package exercicesPOO.encapsulation.telldontask;

public class Time {

	private int time;
	private int minute;
	
	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		if(time < 0 || time > 23) {
			throw new IllegalArgumentException(
					"Hora invalida: "+ time);
		}
		this.time = time;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if(minute < 0 || minute > 59) {
			throw new IllegalArgumentException(
					"Minuto invalido: " + minute);
		}
		this.minute = minute;
	}

	public Time(int time, int minute) {
		
		setTime(time);
		setMinute(minute);
	}
	
	/*classes must have data and behaviors*/
	public String format() {
		return String.format("%dh%dm", getTime(), getMinute());
	}
}
