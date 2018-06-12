
public class RoboticPet extends VirtualPet {

private int oilLevel = rand1.nextInt(20) + 1;

	public RoboticPet(String name, String description, int happiness, int health, int oilLevel) {
	super(name, description, happiness, health);
	this.oilLevel = oilLevel;
	}

	public int getOilLevel() {
		
		return oilLevel;
	}

	public void oilChange() {
		
		oilLevel -= 10;
		
	}


	
}
