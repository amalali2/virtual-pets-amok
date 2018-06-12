import java.util.Random;

public class VirtualPet implements WalkPets, Tick{

	
	Random rand1 = new Random();
	private int happiness = rand1.nextInt(20) + 1;
	protected int health = rand1.nextInt(20) + 1;
	private String name;
	private String description;
	
	public VirtualPet(String name, String description, int happiness, int health) {
		super();
		this.happiness = happiness;
		this.health = health;
		this.name = name;
		this.description = description;
	}

	public int getHappiness() {
		return happiness;
	}

	public int getHealth() {
		return health;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public int unhappySick() {
		if (health > happiness) {
			
			happiness = happiness - 1;
			
		}
			return happiness;
	}

	Random rand = new Random();
	
	private int hunger = rand1.nextInt(20) + 1;
	private int boredom = rand1.nextInt(20) + 1;
	private int thirst = rand1.nextInt(20) + 1;


		public void hunger() {
			
			hunger -= 20;
			
			}
	
		public void bored(int val) {
			boredom -= 20;
			
			}
		
		public void thirst() {
			 thirst -= 20;
					
			}
		
		public void tick() {
			hunger += 10;
			thirst += 10;
			boredom += 15;
		}
		
		public int getHunger() {
			return hunger;
			
		}
		public int getBoredom() {
			return boredom;
			
		}
		public int getThirst() {
			return thirst;
			
		}


	public VirtualPet (String name, String description, int hunger, int boredom, int thirst) {
	
	
		this.hunger = hunger;
		this.boredom = boredom;
		this.thirst = thirst;
		
	}
	
	
	public VirtualPet(String newPetName, String newPetDescription) {
		
		
		
	}

	@Override
	public String toString() {
	return (name + "\t\t|" + hunger + "\t|" + thirst + "\t|" + boredom);

	}


}


	
	
	

