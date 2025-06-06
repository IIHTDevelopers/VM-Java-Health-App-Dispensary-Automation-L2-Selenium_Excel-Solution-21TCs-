package pages;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class dispensary_Pages extends StartupPage {

//	TC-1 Locators
	By usernameTextbox = By.xpath("//input[@id='username_id']");
	By passwordTextbox = By.xpath("//input[@id='password']");
	By signInButton = By.xpath("//button[@id='login']");
	By registeredPatientTextElement = By.xpath("//p[contains(text(), 'Registered Patient')]");
//	TC-2 Locators
	By dispensaryModule = By.xpath("//span[.='Dispensary']");
//	TC-3 LOcators
	By dispensaryToggle = By.xpath("//span[@data-target='#Dispensary']");	
	By PrescriptionSubModule = By.xpath("//span[.='Prescription']");
	By saleSubModule = By.xpath("//span[.='Sale']");
	By stockSubModule = By.xpath("//span[.='Stock']");
	By counterSubModule = By.xpath("//span[.='Counter']");
	By reportsSubModule = By.xpath("//span[.='Reports']");
	By patientConsumptionSubModule = By.xpath("//span[.='Patient Consumption']");
//	TC-4 Locators
	By morningCounter = By.xpath("(//div[@class='counter-item'])[1]");
	By printInvoiceButtonElement = By.xpath("//input[@value='Print Invoice']");
	By discardButtonElement = By.xpath("//button[contains(text() , 'Discard')]");
	By invoiceHistoryTextElement = By.xpath("//b[contains(text() , 'Invoice History')]");
	By creditLimitsAndBalancesTextElement = By.xpath("//b[contains(text() , 'Credit Limits and Balances')]");
//	TC-5 Locators
	By addNewPatientPopup = By.xpath("//div[@class='modelbox-body p2']");
	By addNewPatientPageTitle = By.xpath("//span[.='Add New Patient']");
//	TC-6 Locators
	By okButton = By.xpath("//button[.=' OK']");
	By errorMeesageInFirstNameTextField = By.xpath("//span[.=' First Name is required.']");
//	TC-7 Locators
	By firstNameTextFieldInAddNewPatient = By.id("newPatFirstName");
	By middleNameTextFieldInAddNewPatient = By.id("newPatMiddleName");
	By lastNameTextFieldInAddNewPatient = By.id("newPatLastName");
	By ageTextFieldInAddNewPatient = By.id("Age");
	By contactNumberTextFieldInAddNewPatient = By.id("Contact");
//	TC-8 Locators
	By xButton = By.xpath("//button[.='X']");
	By patientConsuptionTab = By.xpath("//a[.=' Patient Consumption ']");
	By newConsuptionButton = By.xpath("//button[@class='btn green btn-success']");
	By saveConsuptionButton = By.id("btn-save");
	By confirmMessage = By.xpath("//p[.='Are you sure you want to Proceed ?']");
//	TC-9 Locators
	By confirmButton = By.id("id_btn_confirm_confirmation");
	By newConsumptionEntryPageCancelButton = By.xpath("//a[@title='Cancel']");
	By filterByStoreDropdown = By.id("Store");
	By mainStoreOption = By.xpath("//option[.='Main store']");
//	TC-10 Locators
	By createRequisitionButton = By.xpath("//button[@class='btn btn-primary']");
	By requisitionTab = By.xpath("//a[.='Requisition']");
	By addRequisitionsPageName = By.xpath("//span[.='Add Requisition']");
//	TC-11 Locators
	By plusIcon = By.xpath("//i[@class='fa fa-plus btn btn-success']");
	By itemNameTextField = By.id("itemName1");
	By quantityTextField = By.id("req_qty1");
	By remarkTextField = By.id("remark1");
//	TC-12 Locators
	By cancelButtonInAddRequisition = By.xpath("//input[@value='Cancel']");
	By viewIconiconOfRecentlyCreatedDocument = By.xpath("(//a[contains(text(),'View')])[1]");
	By requisitionDetailsPrintPageName = By.xpath("//b[.=' REQUISITION DETAILS PRINT']");
	By printButton = By.xpath("//a[@class='btn btn-default']");
	By requisitionsListButton = By.xpath("//a[@class='btn btn-primary']");
//	TC-13 Locators	
	By medicineName = By.xpath("(//table[@class='table table-striped table-hover req_table']//tr[@style='text-align:center']//td)[1]");
//	TC-14 Locators
	By socialServiceModule = By.xpath("//span[.='SocialService']");	
	By registerNewSSUPatientButton = By.xpath("//a[.=' Register New SSU Patient']");
	By addressTextField = By.id("address");
//	TC-15 Locators
	By closeButton = By.xpath("//button[.=' Close ']");
//	TC-16 Locators	
	By appointmentModule = By.xpath("(//span[.='Appointment'])[1]");
	By newOneSelectCounterElement = By.xpath("//div[@class='counter-item']//h5[contains(text(), 'New-1 ')]");
	By keyboardButtonElement = By.xpath("//div[@title='Shortcut Keys']");
	By altPlusNtooltipMessageElement = By.xpath("//li[contains(text(),'+')]");
	By vatInPercentageTextFieldElement = By.xpath("//input[@id='VAT']");
//	TC-17 Locators
	By countryDropdownByElement = By.xpath("//select[@id='ddlCountry']");
//	TC-19 Locators
	By procurementModule = By.xpath("//span[.='Procurement']");
	By settingsTab = By.xpath("//a[.=' Settings ']");
	By invoiceHeadersSubTab = By.xpath("//a[.='Invoice Headers']");
	By addNewInvoiceHeaderButton = By.xpath("//input[@value='Add New Invoice Header']");
	By chooseFileButton = By.id("img");
	By procurementModuleSettingTabElement = By.xpath("//a[contains(text(), 'Settings')]");
//	TC-20 Locators
	By operationTheatreNavMenuElement = By.xpath("//a[@href='#/OperationTheatre']");
	By newOtBookingButtonElement = By.xpath("//button[contains(text(), 'New OT Booking')]");
	By addNewOtButtonElement = By.xpath("//input[@value='Add New OT']");
	By addInvoiceHeaderCloseButtonElement = By.xpath("//a[.='X']");
//	TC-21 Locators
	By othersChargesTab = By.xpath("//a[.='Other Charges']");
	By addOtherChargesButton = By.xpath("//input[@value='Add Other Charges']");
	By isVATApplicableCheckBox = By.xpath("(//label[@class='mt-checkbox mt-checkbox-outline'])[1]//span");
	By isActiveCheckBox = By.xpath("(//label[@class='mt-checkbox mt-checkbox-outline'])[2]//span");
	By isDefaultCheckBox = By.xpath("(//label[@class='mt-checkbox mt-checkbox-outline'])[3]//span");
	By bookingOTSchedulePageCloseButtonElement = By.xpath("//a[.='X']");
	
	
	public By getPageBarFixedLocator(String navBarName) {
		if (navBarName.equalsIgnoreCase("list requests")) {
			navBarName = "ImagingRequisitionList";
		} else if (navBarName.equalsIgnoreCase("list reports")) {
			navBarName = "ImagingReportsList";
		} else if (navBarName.equalsIgnoreCase("edit doctors")) {
			navBarName = "EditDoctors";
		} else if (navBarName.equalsIgnoreCase("ward billing")) {
			navBarName = "InpatientList";
		}
		return By.xpath("//ul[@class='page-breadcrumb']/li/a[@href='#/Radiology/" + navBarName + "']");
	}
	
	public By getOkButtonLocator() {
		return By.xpath("//button[@class='btn green btn-success']");
	}
	
	public By calendarFromDropdown() {
		return By.xpath("(//input[@id='date'])[1]");
	}
	public By calendarToDropdown() {
		return By.xpath("(//input[@id='date'])[2]");
	}
	
	public By getStarIconLocator() {
		return By.xpath("//i[contains(@class,'icon-favourite')]/..");
	}
	
	String pageName = this.getClass().getSimpleName();
	public dispensary_Pages(WebDriver driver) {
		super(driver);
	}

	/**@Test1
	 * about this method loginTohealthAppByGivenValidCredetial() 
	 * @param : Map<String, String>
	 * @description : fill usernameTextbox & passwordTextbox and click on sign in button
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public boolean loginToHealthAppByGivenValidCredetial(Map<String, String> expectedData) throws Exception {
		Boolean textIsDisplayed = false;
		try {
			WebElement usernametextFieldWebElement = commonEvents.findElement(usernameTextbox);
			commonEvents.highlightElement(usernametextFieldWebElement);
			commonEvents.sendKeys(usernameTextbox,expectedData.get("username"));

			WebElement passwordtextFieldWebElement = commonEvents.findElement(passwordTextbox);
			commonEvents.highlightElement(passwordtextFieldWebElement);
			commonEvents.sendKeys(passwordTextbox,expectedData.get("password"));

			WebElement signinButtonWebElement = commonEvents.findElement(signInButton);
			commonEvents.highlightElement(signinButtonWebElement);
			commonEvents.click(signInButton);

			if(commonEvents.isDisplayed(registeredPatientTextElement))
			{   
				WebElement registeredPatientTextWebElement = commonEvents.findElement(registeredPatientTextElement);
				commonEvents.highlightElement(registeredPatientTextWebElement);
				textIsDisplayed=true;
			}
		}catch(Exception e) {
			throw e;
		}
		return textIsDisplayed;
	}

	/**@Test1.2
	 * about this method verifyTitleOfThePage() 
	 * @param : null
	 * @description : it will navigate to the URL and validate the title of the current page.
	 * @return : String
	 * @author : Yaksha
	 */
	public String verifyTitleOfThePage() throws Exception {
		String pageTitle = "";
		try {
			pageTitle = commonEvents.getTitle();
			System.out.println("title of the page is  :" + pageTitle );
		}catch(Exception e) {
			throw e;
		}	
		return pageTitle;
	}

	/**@Test1.3
	 * about this method verifyURLOfThePage() 
	 * @param : null
	 * @description : it will navigate to the URL and validate the URL of the current page.
	 * @return : String
	 * @author : Yaksha
	 */
	public String verifyURLOfThePage() throws Exception {
		String urlofThepage = "";
		try {
			urlofThepage = commonEvents.getCurrentUrl();
			System.out.println("URL of the page is  :" + urlofThepage );
		}catch(Exception e) {
			throw e;
		}	
		return urlofThepage;
	}


	/**@Test2
	 * about this method verifyDispensaryModuleIsPresentOrNot() 
	 * @param : null
	 * @description : verify the Dispensary module is present or not
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public Boolean verifyDispensaryModuleIsPresentOrNot() throws Exception {
		boolean dispensaryModuleIsDisplayed = false;
		try {
			commonEvents.isDisplayed(dispensaryModule);
			dispensaryModuleIsDisplayed=true;
		}catch(Exception e) {
			throw e;
		}	
		return dispensaryModuleIsDisplayed;
	}

	/**@Test3
	 * about this method verifyAllSubModulesArePresentAndClickOnDispensary() 
	 * @param : null
	 * @description : verify all sub-modules are displayed correctly after clicking on the expand icon of  "Dispensary" Module.
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public Boolean verifyAllSubModulesArePresentAndClickOnDispensary() throws Exception {
		boolean patientConsumptionSubModuleisDisplayed = false;
		try {
			if(commonEvents.isDisplayed(dispensaryModule)){
				commonEvents.jsClick(dispensaryToggle);
				commonEvents.isDisplayed(PrescriptionSubModule);				
				commonEvents.isDisplayed(saleSubModule);
				commonEvents.isDisplayed(stockSubModule);
				commonEvents.isDisplayed(counterSubModule);
				commonEvents.isDisplayed(reportsSubModule);
				commonEvents.isDisplayed(patientConsumptionSubModule);
				commonEvents.click(dispensaryModule);
				patientConsumptionSubModuleisDisplayed=true;
			}
		}catch(Exception e) {
			throw e;
		}	
		return patientConsumptionSubModuleisDisplayed;
	}


	/**@Test4
	 * about this method scrollToButtomAndVerifytheFields() 
	 * @param : null
	 * @description :scroll to the bottom of the "Sale" page if required and verify that "Print Invoice" button  , "Discard" button  ,"Invoice History" and  "Credit Limitis and Balance" text are present or not?
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public Boolean scrollToButtomAndVerifytheFields() throws Exception {
		boolean creditLimitsAndBalancesTextElementIsDisplayed = false;
		try {
			commonEvents.click(morningCounter);
			Thread.sleep(3000);
			WebElement creditLimitsAndBalancesTextElementWebElement=commonEvents.findElement(creditLimitsAndBalancesTextElement);
			commonEvents.scrollIntoView(creditLimitsAndBalancesTextElementWebElement);
			Thread.sleep(3000);
			if(commonEvents.isDisplayed(printInvoiceButtonElement) &&
					commonEvents.isDisplayed(discardButtonElement) &&
					commonEvents.isDisplayed(invoiceHistoryTextElement) &&
					commonEvents.isDisplayed(creditLimitsAndBalancesTextElement) ) {
				creditLimitsAndBalancesTextElementIsDisplayed=true;
			}
		}catch(Exception e) {
			throw e;
		}	
		return creditLimitsAndBalancesTextElementIsDisplayed;
	}



	/**@Test5
	 * about this method performTheKeyboardOperationToOpenthePopup() 
	 * @param : null
	 * @description :Perform the keyboard operation to open the "Add New Patient" pop up Page  and verify its title.
	 * @return : String
	 * @author : Yaksha
	 */
	public String performTheKeyboardOperationToOpenthePopup() throws Exception {
		String pageName = "";
		try {
			commonEvents.performAltN();
			commonEvents.isDisplayed(addNewPatientPopup);
			pageName=commonEvents.getText(addNewPatientPageTitle);
			System.out.println("Add New Patient page title is :" + pageName);
		}catch(Exception e) {
			throw e;
		}	
		return pageName;
	}


	/**@Test6
	 * about this method validateErrorMessageInFirstnameTextfield() 
	 * @param : null
	 * @description : Validate the error message in "Add New Patient" form's first name text field after clicking on "OK" Button without filling any information in the form.
	 * @return : String
	 * @author : Yaksha
	 */
	public String validateErrorMessageInFirstnameTextfield() throws Exception {
		String errorMessageText = "";
		try {
			if(commonEvents.isDisplayed(okButton)) {
				commonEvents.click(okButton);
				Thread.sleep(5000);
				errorMessageText = commonEvents.getText(errorMeesageInFirstNameTextField);
				System.out.println("Error Meesage is  :" + errorMessageText );
				return errorMessageText;	
			}
		}catch(Exception e) {
			throw e;
		}	
		return errorMessageText;
	}

	/**@Test7.1
	 * about this method fillfirstNameTextFieldVerifyTheFirstName() 
	 * @param : Map<String, String>
	 * @description : fill First Name TextField and Verify First name is filled.
	 * @return : String
	 * @author : Yaksha
	 */
	public String fillfirstNameTextFieldVerifyTheFirstName(Map<String, String> expectedData) throws Exception {
		String firstNameTextfieldValue= "";
		try {
			if(commonEvents.isDisplayed(firstNameTextFieldInAddNewPatient))
			{
				commonEvents.click(firstNameTextFieldInAddNewPatient);
				commonEvents.sendKeys(firstNameTextFieldInAddNewPatient,expectedData.get("firstName"));

				firstNameTextfieldValue = commonEvents.getAttribute(firstNameTextFieldInAddNewPatient, "value");
				System.out.println("FirstName : " + firstNameTextfieldValue);

			}
		}catch(Exception e) {
			throw e;
		}
		return firstNameTextfieldValue;
	}

	/**@Test7.2
	 * about this method fillmiddelNameTextFieldVerifyThemiddleName() 
	 * @param : Map<String, String>
	 * @description : fill Middle Name TextField and Verify middle name is filled.
	 * @return : String
	 * @author : Yaksha
	 */
	public String fillmiddelNameTextFieldVerifyThemiddleName(Map<String, String> expectedData) throws Exception {
		String middleNameTextfieldValue= "";
		try {
			if(commonEvents.isDisplayed(middleNameTextFieldInAddNewPatient))
			{

				commonEvents.click(middleNameTextFieldInAddNewPatient);
				commonEvents.sendKeys(middleNameTextFieldInAddNewPatient,expectedData.get("middleName"));

				middleNameTextfieldValue = commonEvents.getAttribute(middleNameTextFieldInAddNewPatient, "value");
				System.out.println("Middle name : " + middleNameTextfieldValue);

			}
		}catch(Exception e) {
			throw e;
		}
		return middleNameTextfieldValue;
	}

	/**@Test7.3
	 * about this method filllastNameTextfieldVerifylastName() 
	 * @param : Map<String, String>
	 * @description : fill Last Name TextField and Verify Last name is filled
	 * @return : String
	 * @author : Yaksha
	 */
	public String filllastNameTextfieldVerifylastName(Map<String, String> expectedData) throws Exception {
		String lastNameTextfieldValue= "";
		try {
			if(commonEvents.isDisplayed(lastNameTextFieldInAddNewPatient))
			{

				commonEvents.click(lastNameTextFieldInAddNewPatient);
				commonEvents.sendKeys(lastNameTextFieldInAddNewPatient,expectedData.get("lastName"));

				lastNameTextfieldValue = commonEvents.getAttribute(lastNameTextFieldInAddNewPatient, "value");
				System.out.println("Last name : " + lastNameTextfieldValue);

			}
		}catch(Exception e) {
			throw e;
		}
		return lastNameTextfieldValue;
	}

	/**@Test7.4
	 * about this method fillAgeTextFieldVerifyTheAge() 
	 * @param : Map<String, String>
	 * @description : fill age and Verify the age.
	 * @return : String
	 * @author : Yaksha
	 */
	public String fillAgeTextFieldVerifyTheAge(Map<String, String> expectedData) throws Exception {
		String ageTextfieldValue= "";
		try {
			if(commonEvents.isDisplayed(ageTextFieldInAddNewPatient))
			{

				commonEvents.click(ageTextFieldInAddNewPatient);
				commonEvents.sendKeys(ageTextFieldInAddNewPatient,expectedData.get("age"));

				ageTextfieldValue = commonEvents.getAttribute(ageTextFieldInAddNewPatient, "value");
				System.out.println("Age is : " + ageTextfieldValue);

			}
		}catch(Exception e) {
			throw e;
		}
		return ageTextfieldValue;
	}



	/**@Test7.5
	 * about this method fillContactNumberTextFieldVerifyContactNumber() 
	 * @param : Map<String, String>
	 * @description : fill Contact Number TextField and Verify Contact Number is filled.
	 * @return : String
	 * @author : Yaksha
	 */
	public String fillContactNumberTextFieldVerifyContactNumber(Map<String, String> expectedData) throws Exception {
		String contactNumberTextfieldValue= "";
		try {
			if(commonEvents.isDisplayed(contactNumberTextFieldInAddNewPatient))
			{

				commonEvents.click(contactNumberTextFieldInAddNewPatient);
				commonEvents.sendKeys(contactNumberTextFieldInAddNewPatient,expectedData.get("contact"));

				contactNumberTextfieldValue = commonEvents.getAttribute(contactNumberTextFieldInAddNewPatient, "value");
				System.out.println("Contact Number is : " + contactNumberTextfieldValue);

			}
		}catch(Exception e) {
			throw e;
		}
		return contactNumberTextfieldValue;
	}	

	/**@Test8
	 * about this method validateTheConfirmMessageOnTheNewConsumptionEntryPage() 
	 * @param : null
	 * @description : On the "New Consumption Entry's page, validate the confirm! Message that is "Are you sure you want to Proceed ?"
	 * @return : String
	 * @author : Yaksha
	 */
	public String validateTheConfirmMessageOnTheNewConsumptionEntryPage() throws Exception {
		String confirmMessageText = "";
		try {
			commonEvents.click(xButton);
			commonEvents.click(patientConsuptionTab);
			commonEvents.click(newConsuptionButton);
			commonEvents.click(saveConsuptionButton);
			confirmMessageText=commonEvents.getText(confirmMessage);
			System.out.println("Confirmation message is :" +confirmMessageText);
		}catch(Exception e) {
			throw e;
		}	
		return confirmMessageText;
	}


	/**@Test9
	 * about this method selectMainStoreFromFilterSelectMainStoreFromFilter() 
	 * @param : null
	 * @description : on the Stock page,select Main store from Filter by store dropdown and verify that Main store is selected and stock value are filtered by the selected store name 
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public Boolean selectMainStoreFromFilterSelectMainStoreFromFilter() throws Exception {
		boolean mainStoreDropDownIsSelected = false;
		try {
			commonEvents.click(confirmButton);
			commonEvents.click(newConsumptionEntryPageCancelButton);
			commonEvents.click(stockSubModule);
			if(commonEvents.isDisplayed(filterByStoreDropdown)) {
				commonEvents.click(filterByStoreDropdown);
				commonEvents.click(mainStoreOption);
				//				 commonEvents.click(filterByStoreDropdown);
				Thread.sleep(3000);
				mainStoreDropDownIsSelected=true;
			}
		}catch(Exception e) {
			throw e;
		}	
		return mainStoreDropDownIsSelected;
	}


	/**@Test10
	 * about this method validateCreateRequisitionButtonIsPresentGoToThisPageThenValidateThePageName() 
	 * @param : null
	 * @description : on the stock page , please validate clicking "Create Requisition" button navigate to "Add Requisitions" page and validate the page Name.
	 * @return : String
	 * @author : Yaksha
	 */
	public String validateCreateRequisitionButtonIsPresentGoToThisPageThenValidateThePageName() throws Exception {
		String addRequisitionsPageNameText = "";
		try {
			commonEvents.isSelected(stockSubModule);
			commonEvents.click(requisitionTab);
			commonEvents.isDisplayed(createRequisitionButton);
			commonEvents.click(createRequisitionButton);
			addRequisitionsPageNameText=commonEvents.getText(addRequisitionsPageName);
			System.out.println("Add Requisitions Page Name Text is : " +addRequisitionsPageNameText);
		}catch(Exception e) {
			throw e;
		}	
		return addRequisitionsPageNameText;
	}



	/**@Test11
	 * about this method byClickingOnThatButtonSomeTextFieldsAreDisplyed() 
	 * @param : null
	 * @description : on the Add Requisition page, clicking the + icon button on right hand side of Remarks text box add a  the New set of elements to add a new records and validate New Item text field, Quantity Text field and Remark text box are present or not 2nd rows?
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public Boolean byClickingOnPlusButtonSomeTextFieldsAreDisplyed() throws Exception {
		boolean isDisplayed = false;
		try {
			 commonEvents.click(plusIcon);
			 if(commonEvents.isDisplayed(itemNameTextField)&& 
				 commonEvents.isDisplayed(quantityTextField)&&
				 commonEvents.isDisplayed(remarkTextField)) {
				 commonEvents.click(cancelButtonInAddRequisition);
				 isDisplayed=true;
			 }
		}catch(Exception e) {
			throw e;
		}	
		return isDisplayed;
	}
	
	
	/**@Test12.1
	 * about this method verifyPageNameOfRequisitionDetailsPage() 
	 * @param : null
	 * @description : On the "Requisition" page, verify that view button under "action" navigate to the "Requisition Details Print" page and validate the page name is  "Requisition Details Print" 
	 * @return : String
	 * @author : Yaksha
	 */
	public String verifyPageNameOfRequisitionDetailsPage() throws Exception {
		String pageName = "";
		try {
			WebElement dateField = driver.findElement(By.xpath("(//input[@id='date'])[1]"));
			WebElement okButton = driver.findElement(By.xpath("//button[@class='btn green btn-success']"));
			dateField.clear(); // Clears any pre-filled value
			dateField.sendKeys("08-01-2020"); // Pass fixed date (Format: YYYY-MM-DD)
//			dateField.sendKeys(Keys.ENTER); // Optional: Press Enter if required
			commonEvents.click(okButton);
			commonEvents.click(viewIconiconOfRecentlyCreatedDocument);
			pageName=commonEvents.getText(requisitionDetailsPrintPageName);
			System.out.println("Page name is :" +pageName);			 
		}catch(Exception e) {
			throw e;
		}	
		return pageName;
	}
	
	
	/**@Test12.2
	 * about this method validateTheButtonsArePresentOrNot() 
	 * @param : null
	 * @description :  validate "print" and "Requisitions List" button are present
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public Boolean validateTheButtonsArePresentOrNot() throws Exception {
		boolean requisitionsListButtonisDisplayed = false;
		try {

			 if(commonEvents.isDisplayed(printButton)&& 
				 commonEvents.isDisplayed(requisitionsListButton)) {
				 requisitionsListButtonisDisplayed=true;
			 }
			 
		}catch(Exception e) {
			throw e;
		}	
		return requisitionsListButtonisDisplayed;
	}
	
	
	/**@Test13
	 * about this method getTheMedicineNameFromTable() 
	 * @param : null
	 * @description :  On the "Requisition Details Print" page, Get the medicine name from the "Requisition Details Print" table and  validate the medicine name is not blank.
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public Boolean getTheMedicineNameFromTable() throws Exception {
		boolean medicineNameDisplayed = false;
		try {

			 if(commonEvents.isDisplayed(medicineName)) {
				 String MedicineName=commonEvents.getText(medicineName);
				 System.out.println("Medicine name is :" +MedicineName);
				 medicineNameDisplayed=true;
			 }
			 
		}catch(Exception e) {
			throw e;
		}	
		return medicineNameDisplayed;
	}
	

	/**@Test14
	 * about this method inAddressFieldValidateThePlaceHolderNameAndPrintOnConsole() 
	 * @param : null
	 * @description : On the "New SSU Patient Registration" under social service module, get the place holder name of "Address" textfiled of  "New SSU Patient Registration" page and verify  the place holder name.
	 * @return : String
	 * @author : Yaksha
	 */
	public String inAddressFieldValidateThePlaceHolderNameAndPrintOnConsole() throws Exception {
		String placeHolderValue = "";
		try {
			commonEvents.click(socialServiceModule);
			commonEvents.click(registerNewSSUPatientButton);
			commonEvents.click(addressTextField);
			placeHolderValue = commonEvents.getAttribute(addressTextField,"placeholder");
			System.out.println("Place holder value of Address field : " + placeHolderValue);
			
		}catch(Exception e) {
			throw e;
		}	
		return placeHolderValue;
	}
	
	/**@Test15
	 * about this method closeNewSSUPatientRegistrationPopupByUsingJsExecutor() 
	 * @param : null
	 * @description : On the "New SSU Patient Registration" page, Close this "New SSU Patient Registration" popup page by using javaScript.
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public Boolean closeNewSSUPatientRegistrationPopupByUsingJsExecutor() throws Exception {
		boolean IsDisplayed = false;
		try {
			if(commonEvents.isDisplayed(closeButton)) {
			  commonEvents.jsClick(closeButton);
			  Thread.sleep(3000);
			  IsDisplayed=true;
			}
		}catch(Exception e) {
			throw e;
		}	
		return IsDisplayed;
	}

	/**@Test16
	 * about this method verifyToolTipOfAnElement()
	 * @param : null
	 * @description :go to appointmentTab and verify the TOOLTIP value/text
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyToolTipOfTheElement() throws Exception {
		String tooltipText = "";
		try {
			commonEvents.click(appointmentModule);
			commonEvents.click(newOneSelectCounterElement);
			commonEvents.waitTillElementVisible(keyboardButtonElement,50);
			commonEvents.mouseHoverClick(keyboardButtonElement);
			commonEvents.waitTillElementVisible(altPlusNtooltipMessageElement,50);
			tooltipText = commonEvents.getText(altPlusNtooltipMessageElement);
			System.out.println("New Patient Tooltip text value is:" + tooltipText );
		}catch(Exception e) {
			throw e;
		}
		return tooltipText;
	}

	/**@Test17
	 * about this method verifyIndiaIsSelectedFromCountryDropdown() 
	 * @param : get the data from json file as type Map<String, String> expectedData
	 * @description : it will select the country as per json expected data
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyIndiaIsSelectedFromCountryDropdown(Map<String, String> expectedData) throws Exception {

		String selectedCountryName = "" ;

		commonEvents.click(saleSubModule);
		commonEvents.performAltN();

		try {
			commonEvents.selectByVisibleText(countryDropdownByElement, expectedData.get("selectedCountryName"));
			selectedCountryName = commonEvents.getFirstSelectedOptionFromDropdown(countryDropdownByElement, "elementName", "pageName");
			System.out.println("first selected option from country dropdown : " + selectedCountryName );
			return selectedCountryName;
		}catch(Exception e) {
			throw e;
		}	
	}

	/**@Test18
	 * about this method takingScreenshotOfTheCurrentPage() 
	 * @param : null
	 * @description : Taking screenshot of the current page.
	 * @return : Boolean
	 * @author : YAKSHA
	 */
	public Boolean takingScreenshotOfTheCurrentPage() throws Exception {
		boolean isDisplayed = false;
		commonEvents.click(xButton);
		try {
			commonEvents.takeScreenshot("Sale page of DIspensary Module");
			isDisplayed = true;

		}catch(Exception e) {
			throw e;
		}
		return isDisplayed;
	}

	/**@Test19
	 * about this method uploadImageInScannedImagesSection() 
	 * @param : Map<String, String>
	 * @description : Upload a image in Scanned Images section.
	 * @return : Boolean
	 * @author : YAKSHA
	 */
	public Boolean uploadImageInScannedImagesSection(String pathOfTheFile) throws Exception {
		boolean isUploaded = false;
		try {
			commonEvents.click(procurementModule);
			Thread.sleep(3000);
			commonEvents.click(settingsTab);
			Thread.sleep(3000);
			commonEvents.click(invoiceHeadersSubTab);
			Thread.sleep(3000);
			commonEvents.click(addNewInvoiceHeaderButton);
			Thread.sleep(3000);
			commonEvents.jsClick(chooseFileButton);
			Thread.sleep(3000);
			System.out.println("path of the file" + pathOfTheFile );
			Thread.sleep(5000);
			commonEvents.fileUpload(pathOfTheFile);
			Thread.sleep(3000);

			isUploaded = true;
		}catch(Exception e) {
			throw e;
		}
		return isUploaded;
	}

	/**@Test20
	 * about this method handleAlertPopup()
	 * @param : null
	 * @description : 
	 * @return : boolean
	 * @author : YAKSHA
	 */
	public boolean handleAlertPopup() throws Exception {

		boolean isPopupHandled = false;

		commonEvents.click(addInvoiceHeaderCloseButtonElement);

		try {
			commonEvents.click(operationTheatreNavMenuElement);
			Thread.sleep(2000);
			commonEvents.click(newOtBookingButtonElement);
			Thread.sleep(2000);
			if(commonEvents.isDisplayed(addNewOtButtonElement)){
				Thread.sleep(2000);
				commonEvents.click(addNewOtButtonElement);
				Thread.sleep(2000);
				//				commonEvents.validateAlertMessage();
				commonEvents.acceptAlert();
				isPopupHandled = true;
			}
		}catch(Exception e) {
			throw e;
		}
		return isPopupHandled;
	}

	/**@Test21
	 * about this method tickAllCheckboxesThenValidateThenUntick() 
	 * @param : null
	 * @description : First, tick all check boxes and validate that the all selected checkboxes are selected or not then untick them then close Add Other Charges.
	 * @return : Boolean
	 * @author : YAKSHA
	 */
	public Boolean handleCheckBox(Map<String, String> expectedData) throws Exception {

		boolean isCheckBoxSelected = false;

		commonEvents.click(bookingOTSchedulePageCloseButtonElement);

		try {
			if(commonEvents.isDisplayed(procurementModule)) {
				commonEvents.click(procurementModule);

				commonEvents.click(procurementModuleSettingTabElement);
				Thread.sleep(2000);

				commonEvents.click(othersChargesTab);	
				Thread.sleep(2000);

				commonEvents.click(addOtherChargesButton);
				Thread.sleep(2000);

				commonEvents.click(isVATApplicableCheckBox);
				Thread.sleep(2000);

				commonEvents.click(isActiveCheckBox);
				Thread.sleep(2000);

				commonEvents.click(isDefaultCheckBox);

				commonEvents.isSelected(isVATApplicableCheckBox);
				commonEvents.isSelected(isActiveCheckBox);
				commonEvents.isSelected(isActiveCheckBox);

				if(commonEvents.isDisplayed(vatInPercentageTextFieldElement))
				{   
					commonEvents.clear(vatInPercentageTextFieldElement);
					commonEvents.sendKeys(vatInPercentageTextFieldElement,expectedData.get("vatInPercentageValue"));
				}

//				commonEvents.click(addOtherChargesCloseButtonElement);

				isCheckBoxSelected = true;
			}
		}catch(Exception e) {
			throw e;
		}
		return isCheckBoxSelected;
	}
}
