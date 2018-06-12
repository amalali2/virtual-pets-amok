import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class OrganicDogTest {
	
	OrganicDog testPet = new OrganicDog("minnie", null, 20, 10, 12, 20, 20, 0);
	
	@Test
	
	public void shouldCleanCage() {
		
		int cageBeforeClean = testPet.getCageCleanliness();
		testPet.cleanAllCages();
		int cageAfterClean = testPet.getCageCleanliness();
		assertThat(cageAfterClean, is(equalTo(cageBeforeClean + 1)));
		
		
	}
	
	@Test
	
	public void shouldDirtyCage() {
		
		int cageBeforePoop = testPet.getCageCleanliness();
		testPet.poop();
		int cageAfterPoop = testPet.getCageCleanliness();
		assertThat(cageAfterPoop, is(equalTo(cageBeforePoop - 1)));
		
		
	}
	
	@Test
	
	public void shouldIncreaseHappinessAfterWalked() {
		
		int happinessBeforeWalk = testPet.getHappiness();
		testPet.walkPets();
		int happinessAfterWalk = testPet.getHappiness();
		assertThat(happinessAfterWalk, is(equalTo(happinessBeforeWalk + 1)));
		
	}
	
	public void shouldDecreaseLikelihoodOfDirtyCage() {
		
		int cageCleanlinessBeforeWalk = testPet.getCageCleanliness();
		testPet.walkPets();
		int cageCleanlinessAfterWalk = testPet.getCageCleanliness();
		assertThat(cageCleanlinessAfterWalk, is(equalTo(cageCleanlinessBeforeWalk - 1)));
		
	}
	
	public void shouldIncreasePoopWithTick() {
		
		int cageCleanlinessBeforeTick = testPet.getCageCleanliness();
		testPet.tick();
		int cageCleanlinessAfterTick = testPet.getCageCleanliness();
		assertThat(cageCleanlinessAfterTick, is(equalTo(cageCleanlinessBeforeTick + 1)));
		
		
		
	}
	
}

