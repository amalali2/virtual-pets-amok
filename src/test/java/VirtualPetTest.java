import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class VirtualPetTest {
	
	//happiness
	//health
	//tick dog cage
	
	VirtualPet testPet = new VirtualPet("joon", "happy virus", 10, 12);
	
	@Test
	
	public void shouldLowerHappinessIfHealthIsLow() {
		
		int healthBefore = testPet.getHappiness();
		testPet.unhappySick();
		int healthAfter = testPet.getHappiness();
		assertThat(healthAfter, is(equalTo(healthBefore - 1 )));
		
	}
	

}
	

	


	

		

	
	