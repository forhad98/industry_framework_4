package page_Locator_package2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility_package_2.Baseclass1;

public class ContactPageLocator extends Baseclass1  {

	public ContactPageLocator() {
		
		PageFactory.initElements(driver, this);
		
	}
@FindBy(linkText="Contact")
public WebElement contactpagelink;
		
}
