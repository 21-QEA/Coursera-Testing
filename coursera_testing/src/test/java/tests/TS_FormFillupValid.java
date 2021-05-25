package tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import functionalities.FormFillingFunctionality;

public class TS_FormFillupValid extends BaseClass {
	
	public FormFillingFunctionality fill;

	@BeforeTest
	public void TC_initiateCourse() {
		fill = new FormFillingFunctionality();
	}
	
	@Test(priority=1)
	public void TC_validData() throws InterruptedException {
		fill.getCourse();
		//fill.navigateForm();
		System.out.println("Valid Form Fill-up Started");
		fill.setFormValues(1,"valid_op");
		System.out.println("Valid Form Fill-up completed");
	}
	
}
