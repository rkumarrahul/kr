package pacgittest;

import org.testng.annotations.Test;

public class CreateContactTest {
	@Test(groups= {"smoke"})
	public void createContat()
	{
		System.out.println("execute create contact");
	}
	public void deleteContact()
	{
		System.out.println("contact deleted");
	}
	public void modifyconntact()
	{
		System.out.println("contact modified");
	}
	public void editContact()
	{
		System.out.println("edit contact");
	}
	public void editContact(String name)
	{
		System.out.println("contact edit by Nmae");
		
	}
	public void editContact(int num)
	{
		System.out.println("edit by no");
	}
	public void editContact(String name, int num)
	{
		System.out.println("edit by name and number");
	}
}
