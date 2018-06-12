import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class VirtualPetShelter {
	
	Random rand1 = new Random();
	private int oilLevel = rand1.nextInt(20) + 1;
	private int cageCleanLevel = rand1.nextInt(20) + 1;
	private int litterBoxLevel = rand1.nextInt(20) + 1;
	
//	public VirtualPetShelter(String name, String description, int happiness, int health, int oilLevel,
//			int cageCleanLevel, int litterBoxLevel) {
//		super();
//		this.oilLevel = oilLevel;
//		this.cageCleanLevel = cageCleanLevel;
//		this.litterBoxLevel = litterBoxLevel;
//	}
	
	public VirtualPetShelter() {
		// TODO Auto-generated constructor stub
	}

	public int getOilLevel() {
		return oilLevel;
	
	}
	
	public int getCageCleanLevel() {
		return cageCleanLevel;
	
	}
	
	public int getLitterBoxLevel() {
		return litterBoxLevel;
	}

	public void oilChange() {
		
		oilLevel -= 1;
		
	}

	public void cleanAllCages() {
		
		cageCleanLevel -= 0;
		
	}

	public void cleanLitterBox() {
		
		litterBoxLevel -= 0;
		
	}
	
	Map<String,VirtualPet> vPets = new HashMap<>();
	Map<String, OrganicPet> organicDogs = new HashMap<String, OrganicPet>();
	Map<String, OrganicPet> organicCats = new HashMap<String, OrganicPet>();
	Map<String, RoboticPet> roboticDogs = new HashMap<String, RoboticPet>();
	Map<String, RoboticPet> roboticCats = new HashMap<String, RoboticPet>();
	
	public void maintainAllRobots() {
		for (RoboticPet d : roboticDogs.values()) {
			d.oilChange();
			
		}
		for (RoboticPet c : roboticCats.values()) {
			c.oilChange();
			
		}
	}
	
	public void cleanDogCages() {
		for (OrganicPet d : organicDogs.values()) {
			((OrganicDog) d).cleanAllCages();
		}
	}

	public void walkDogs() {
		for (OrganicPet d : organicDogs.values()) {
			((OrganicDog) d).walkPets();
		}
		for (RoboticPet d : roboticDogs.values()) {
			((RoboticDog) d).walkPets();
		}

	}
	
	public void emptyLitterBox() {
		for (OrganicPet d : organicCats.values()) {
			((OrganicCat) d).cleanLitterBox();
		}
		
	}
	
	
	public Collection<OrganicPet> organicDogs() {
		return organicDogs.values();
	}

	public Collection<OrganicPet> organicCats() {
		return organicCats.values();
	}

	public Collection<RoboticPet> roboticDogs() {
		return roboticDogs.values();
	}

	public Collection<RoboticPet> roboticCats() {
		return roboticCats.values();
	}
	
	public Collection<VirtualPet> getAllPets() {
		return vPets.values();
	}
	
	public void addPet(String name, VirtualPet pet) {
		vPets.put(pet.getName(), pet);
	}
	
	public VirtualPet findPet(String name) {
		return vPets.get(name);
	}

	public void adopt(VirtualPet pet) {
		vPets.remove(pet.getName(), pet);
		
	}
	
	public void feed(Collection<VirtualPet> pets, int qty) {
		for (VirtualPet pet: pets) {
			pet.hunger();
		}
		
	}
		
	public void water(Collection<VirtualPet> pets, int qty) {
		for (VirtualPet pet: pets) {
			pet.thirst();
		}
	}
	
	public void play(String name, int val) {
		vPets.get(name).bored(val);
			
		}
	
	public void allPetStatus(Collection<VirtualPet> pets) {
		System.out.println("\nBANGCHAN'S PETS\t|HUNGER\t|THIRST\t|BOREDOM|TIRED  |Cage Cleanliness|Litter Box Level  |");
		System.out.println("----------------|-------|-------|-------|-------|----------------|------------------|");
		for (VirtualPet pet : pets) {
			System.out.println(pet.getName() + "\t\t| " + pet.getHunger()
				+ "\t| " + pet.getThirst() + "\t| " + pet.getBoredom()
				+ "\t| " + pet.getHunger() + "\t| " + (cageCleanLevel) + "" + "         " + "\t |" + (litterBoxLevel)  + "\t            |"  );
		}
		System.out.println("-----------------------------------------------------------------------------------");
	}
			
	public void updateAllTick(Collection<VirtualPet> pets) {
		for (VirtualPet pet: pets) {
			pet.tick();
			
		
			
		
				
			}
		}
		
	}
	



	

	
	

