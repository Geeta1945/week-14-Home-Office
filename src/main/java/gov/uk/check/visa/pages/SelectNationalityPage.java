package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/*
3.SelectNationalityPage -nationalityDropDownList, nextStepButton locators and create
methods 'void selectNationality(String nationality)'
and 'void clickNextStepButton()'
 */

public class SelectNationalityPage extends Utility {

    public SelectNationalityPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//select[@id='response']")
    WebElement nationalityDropDownList;

    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueButton;

    public void selectNationality(String nationality){
        CustomListeners.test.log(Status.PASS, "Selecting on Yes : " + nationality+ " to " + nationalityDropDownList);
        selectByValueFromDropDown(nationalityDropDownList,nationality);
    }

    public void clickNextStepButton(){
        CustomListeners.test.log(Status.PASS, "Continue to click on button: " + continueButton);
        clickOnElement(continueButton);
    }




}
