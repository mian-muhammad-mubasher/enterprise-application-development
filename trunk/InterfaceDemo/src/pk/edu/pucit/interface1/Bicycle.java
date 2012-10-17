package pk.edu.pucit.interface1;

public interface Bicycle {
	public void changeCadence(int newValue); // per minute
	public void changeGear(int newValue);
	public void speedUp(int increment);
	public void applyBrakes(int decrement);
	public float getCoveredDistance();
}
