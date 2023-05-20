package page_Locator_package2;

import org.openqa.selenium.support.PageFactory;

import utility_package_2.Baseclass1;

public class Homepage_locator extends Baseclass1 {

	public Homepage_locator() {
		PageFactory.initElements(driver, this);
		
	}
}
