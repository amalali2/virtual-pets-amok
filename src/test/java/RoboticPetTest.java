import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class RoboticPetTest {
	
	RoboticPet testPet = new RoboticPet("tata", null, 10, 12, 10);
	
	@Test
	
	public void shouldOilAllPets() {
	
		int oilLevelBeforeOil = testPet.getOilLevel();
		testPet.oilChange();
		int oilLevelAfterOil = testPet.getOilLevel();
		assertThat(oilLevelAfterOil, is(equalTo(oilLevelBeforeOil - 1)));
		
	}

}
	
	
	
		
		
		
	



