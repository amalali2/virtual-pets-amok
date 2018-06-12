
public class OrganicDog extends OrganicPet implements WalkPets {

	private int cageCleanliness = rand1.nextInt(20) + 1;
	private int hunger = rand1.nextInt(20) + 1;
	private int boredom = rand1.nextInt(20) + 1;
	private int thirst = rand1.nextInt(20) + 1;
	private int happiness = rand1.nextInt(20) + 1;

	public OrganicDog(String name, String description, int happiness, int health, int hunger, int thirst,
			int cageCleanliness, int i) {
		super(name, description, happiness, health, hunger, thirst);
		this.cageCleanliness = cageCleanliness;
	}


	public int getCageCleanliness() {
		return cageCleanliness;
	}

	public void cleanAllCages() {
		
		cageCleanliness += 1;
		
	}
	
	public void poop() {
		
		cageCleanliness -= 1;
		
	}
	
	public void walkPets() {
		
		happiness += 1;
		cageCleanliness -= 1;
	}
	
	@Override
	public void tick() {
		
		cageCleanliness += 10;
		happiness += 10;
		hunger += 10;
		thirst += 10;
		boredom += 15;
		
	}
	
}
