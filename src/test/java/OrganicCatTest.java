import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class OrganicCatTest {
	
	OrganicCat testPet = new OrganicCat("null", "null", 20, 10, 12, 20, 20);
	
	@Test
	
	public void shouldCleanLitterBox() {
		
		int cageBeforeClean = testPet.getLitterBoxCleanliness();
		testPet.cleanLitterBox();
		int cageAfterClean = testPet.getLitterBoxCleanliness();
		assertThat(cageAfterClean, is(equalTo(cageBeforeClean + 1)));
		
	}
	
	

}
