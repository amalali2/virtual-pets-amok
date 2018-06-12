import java.util.Collection;
import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		VirtualPetShelter shelter = new VirtualPetShelter();
		
		shelter.addPet(null, new OrganicDog("Joonie", "is super super friendly!", 50, 50, 25, 25, 25, 0));
		shelter.addPet(null, new RoboticDog("Brownie", "is a gentle giant", 50, 50, 25, 25));
		shelter.addPet(null, new OrganicCat("BamBam", "is a happy virus!", 50, 50, 25, 25, 0));
		shelter.addPet(null, new RoboticCat("Yoon", "is a a bit shy!", 50, 50, 25, 25));

		
		Collection<VirtualPet> petCollection = shelter.getAllPets();
		
		System.out.println("Welcome & thank you for volunteering at BangChan's Virtual Pet Shelter!");
		System.out.println("This is the status of your pets:");
		
		while(true) {
			
			
			shelter.allPetStatus(petCollection);
				
			
			System.out.println("What would you like to do next?");
		    System.out.println("1. Feed the pets");
		    System.out.println("2. Water the pets");
		    System.out.println("3. Play with a pet");
		    System.out.println("4. Adopt a pet");
		    System.out.println("5. Admit a pet");
		    System.out.println("6. Oil the robotic pets");
		    System.out.println("7. Clean all the dog cages");
		    System.out.println("8. Empty all of the kitty litter boxes");
		    System.out.println("9. Walk all of the dogs");
		    System.out.println("10. Quit");
		    
		String response = input.nextLine();
		
		switch (response) {
		
			case "1" :
			shelter.feed(petCollection, 1);
			break;
	
			case "2" :
			shelter.water(petCollection, 1);
			break;
	
			case "3": 
			System.out.println("How fun! Who would you like to play with? Please choose one or \"Quit\":");
			boolean selectionMade = false;
		
			while (!selectionMade) { 
				for (VirtualPet pet : petCollection) {
					System.out.println("[" + pet.getName() + "] " + pet.getDescription() );
				}
				response = input.nextLine();
				VirtualPet currentPet2 = shelter.findPet(response);
						
				if (petCollection.contains(currentPet2)) {
					shelter.play(response, 2);
					System.out.println("I think " + currentPet2.getName() + " is having a great time with you!");
					selectionMade = true;
				} else if (response.toLowerCase().equals("quit")){
					break;
				} else {
					System.out.println("Please pick a name from the list or 'quit'. Thank you.");
					}
				
				} 	
				break;
		
			case "4": 
				System.out.println("Who would you like to adopt? Type their name as it appears or quit to cancel. (Selection is case sensitive");
				selectionMade = false;
				while (!selectionMade) {
					for (VirtualPet pet : petCollection) {
						System.out.println("[" + pet.getName() + "] " + pet.getDescription() );
					}
					response = input.nextLine();
					
					VirtualPet currentPet = shelter.findPet(response);
					
					if (petCollection.contains(currentPet)) {
						shelter.adopt(shelter.findPet(response));
						System.out.println("I think " + currentPet.getName() + " and you will have a happy life!");
						selectionMade = true;
					} else if (response.toLowerCase().equals("quit")){
						break;
					} else {
						System.out.println("Who would you like to adopt? Type their name as it appears or quit to cancel. (Selection is case sensitive");
						}
			
					}  
					break;				
		
				case "5": 
					System.out.println("Please choose a name for our new guest.");
					String newPetName = input.nextLine();
					System.out.println("Please give a brief description of our new guest.");
					String newPetDescription = input.nextLine();
					VirtualPet admitPets = new VirtualPet(newPetName, newPetDescription);
					shelter.addPet(newPetName, admitPets);
					System.out.println((newPetName) + ", welcome to the family!");
			
					break;	
					
				case "6":
					shelter.maintainAllRobots();
					System.out.println("The robots are all taken care of!");
					break;
					
				case "7":
					shelter.cleanDogCages();
					System.out.println("The dog cages are all clean now!");
					break;
				
				case "8":
					shelter.emptyLitterBox();
 					System.out.println("Litter box is all clean now!");
 					break;
					
				case "9":
					shelter.walkDogs();
					System.out.println("You just walked the dogs!");
					break;
					
				case "10": 
					input.close();
					System.exit(0);
					
				default :
					System.out.println("Please make a valid selection (1 - 10)");
				} 
				
				
				shelter.updateAllTick(petCollection);
		}
		
			
	}
	
}

