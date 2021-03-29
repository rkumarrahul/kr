package pacgittest;

import org.testng.annotations.Test;

public class CreateLeadTest {
	@Test(groups= {"regression","smoke"})
	public void createLead()
	{
		System.out.println("lead created");
	}
}
