import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class OrganicPetTest {

	OrganicPet testPet = new OrganicPet("yoon", "real", 10, 12, 20, 20);
	
	@Test
	
	public void shouldFeedOrganicPet() {
		
		int hungerBefore = testPet.getHunger();
		testPet.feed();
		int hungerAfter = testPet.getHunger();
		assertThat(hungerAfter, is(equalTo(hungerBefore + 1 )));
		
	}
	
	@Test
	
	public void shouldWaterOrganicPet() {
		
		int thirstBefore = testPet.getThirst();
		testPet.water();
		int thirstAfter = testPet.getThirst();
		assertThat(thirstAfter, is(equalTo(thirstBefore + 1)));
		
		
	}
	
}
