
public class RoboticDog extends RoboticPet implements WalkPets {

	private int oilLevel = rand1.nextInt(20) + 1;
	
	




	public RoboticDog(String name, String description, int happiness, int health, int oilLevel, int oilLevel2) {
		super(name, description, happiness, health, oilLevel);
		oilLevel = oilLevel2;
	}






	public int getOilLevel() {
		return oilLevel;
	}






	@Override
	public void walkPets() {
		health += 10;
		oilLevel -= 5;
	}



	}
