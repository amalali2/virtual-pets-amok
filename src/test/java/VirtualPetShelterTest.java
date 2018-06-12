import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class VirtualPetShelterTest {
	
	VirtualPetShelter testPet = new VirtualPetShelter();
	
	
	@Test 
	
	public void shouldOilAllPets() {
		
		int oilLevelBeforeOilChange = testPet.getOilLevel();
		testPet.oilChange();
		int oilLevelAfterOilChange = testPet.getOilLevel();
		assertThat(oilLevelAfterOilChange, is(equalTo(oilLevelBeforeOilChange - 1)));
		
	}
	
	@Test
	
	public void shouldCleanAllCages() {
		
		int cageCleanLevelBeforeClean = testPet.getCageCleanLevel();
		testPet.cleanAllCages();
		int cageCleanLevelAfterClean = testPet.getCageCleanLevel();
		assertThat(cageCleanLevelAfterClean, is(equalTo(cageCleanLevelBeforeClean + 1)));
	}
	
	@Test
	
	public void shouldEmptyLitterBox() {
		
		int litterBoxBeforeBeingEmptied = testPet.getLitterBoxLevel();
		testPet.cleanLitterBox();
		int litterBoxAfterBeingEmptied = testPet.getLitterBoxLevel();
		assertThat(litterBoxAfterBeingEmptied, is (equalTo(litterBoxBeforeBeingEmptied + 1 )));
	}

}
