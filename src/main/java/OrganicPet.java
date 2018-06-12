
public class OrganicPet extends VirtualPet implements WalkPets{
	
	private int hunger = rand1.nextInt(20) + 1;
	private int thirst = rand1.nextInt(20) + 1;

	public OrganicPet(String name, String description, int happiness, int health, int hunger, int thirst) {
		super(name, description, happiness, health);
		this.hunger = hunger;
		this.thirst = thirst;
	}

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public void feed() {
		hunger += 10;
		
	}

	public void water() {
		
		thirst += 10;
		
	}
	
	
}
