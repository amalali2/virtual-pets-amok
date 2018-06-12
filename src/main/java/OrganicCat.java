
public class OrganicCat extends OrganicPet{

	protected int litterBoxCleanliness = rand1.nextInt(20) + 1;

	
	public OrganicCat(String name, String description, int happiness, int health, int hunger, int thirst,
		int litterBoxCleanliness) {
	super(name, description, happiness, health, hunger, thirst);
	this.litterBoxCleanliness = litterBoxCleanliness;
}
	
	public int getLitterBoxCleanliness() {
		return litterBoxCleanliness;
	}
	
	
	public void cleanLitterBox() {
		
		litterBoxCleanliness += 10;
		
	}




}
