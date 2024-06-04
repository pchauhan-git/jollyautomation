package day1.page;

import day1.base.TestBase;
import day1.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Set;

public class HomePage extends TestBase {

    //Define Page Factory or Object Repo
    @FindBy(xpath="//input[@value='institutional']")
    WebElement InstitutionalBtn;

    @FindBy(xpath="//input[@value='IA']")
    WebElement Institutional1ABtn;

    @FindBy(xpath="//input[@value='SLUM']")
    WebElement slumBtn;

    @FindBy(xpath="//div[@class='next-remark-row']//div[2]")
    WebElement holdBtn;




    @FindBy(xpath = "//div[text()='Logout']")
    WebElement logOutBtn;

    @FindBy(xpath = "//div[@id='__next']/div[2]/div/div/div[2]/button[2]/span")
    WebElement featuresLink;

    @FindBy(xpath = "//a[contains(@href, '/sign-up')]")
    WebElement signupBtn;

    @FindBy(xpath="//input[@name='username']")
    WebElement username;

    @FindBy(xpath="//input[@name='password']")
    WebElement password;

    @FindBy(xpath="//input[@id='username']")
    WebElement usernameBank;

    @FindBy(xpath="//input[@id='password']")
    WebElement passwordBank;

    @FindBy(xpath="//div[@class='display-flex justify-space-between']//button[@type='button'][1]")
    WebElement LoginBtn;

    @FindBy(xpath="//button[@id='btnSubmit']")
    WebElement LoginBtnPayment;

    @FindBy(xpath="//span[text()='Connections']")
    WebElement connectionsDropdown;

    @FindBy(xpath="//a[text()='New Connections']")
    WebElement newConnectionOptionInDropdown;

    @FindBy(xpath="//span[text()='Apply For New Connection']")
    WebElement applyForNewConnectionButton;

    @FindBy(xpath="//input[@class='ant-checkbox-input']")
    WebElement consentCheckbox;

    @FindBy(xpath="//input[@type='file']")
    WebElement signatureUploadButton;

    @FindBy(xpath="//span[text()='Preview']")
    WebElement previewButton;


    @FindBy(xpath="//div[@class='ant-modal-content']//div[2]//button[2]")
    WebElement newConnectionInstructionOKButton;

    @FindBy(xpath="//input[@value='residential']")
    WebElement residentialRadioButton;

    @FindBy(xpath="//input[@value='R1']")
    WebElement r1RadioButton;

    @FindBy(xpath="//input[@value='individual']")
    WebElement individualRadioButton;


    @FindBy(xpath="//div[@class='form-section form-section-bordered']//label[1]//span[1]//input")
    WebElement hutR1Btn;

    @FindBy(xpath="//div[@class='main-container']//div[4]//div[2]//div[1]//label[1]//input")
    WebElement slumCertificate;

    @FindBy(xpath="//div[5]//div[2]//div[1]//label[1]//input")
    WebElement kabjaCertificate;

    @FindBy(xpath="//div[7]//div[2]//div[1]//label[1]//input")
    WebElement addressProofcertificate;


    @FindBy(xpath="//button/span[text()='Update']")
    WebElement updateButton;


    @FindBy(xpath="//button/span[text()='Next']")
    WebElement nextButton;

    @FindBy(xpath="//div[text()='Title']/following-sibling::div//input")
    WebElement titleDropdown;

    @FindBy(xpath="//div[@class='rc-virtual-list']//div[text()='Mr']")
    WebElement mrOptionInTitleDropdown;

    @FindBy(xpath="//div[text()='First Name']/following-sibling::input")
    WebElement firstName;

    @FindBy(xpath="//div[text()='Last Name']/following-sibling::input")
    WebElement lastName;

    @FindBy(xpath="//input[@name='primaryRelative']")
    WebElement fatherName;

    @FindBy(xpath="//input[@name='email']")
    WebElement email;

    @FindBy(xpath="//div[text()='Electricity Bill Consumer Number']/following-sibling::input")
    WebElement electricBillNumber;

    @FindBy(xpath="//input[@name='houseNumber']")
    WebElement houseNumber;

    @FindBy(xpath="//body/div[@id='root']/div[@class='App']/div[@class='main-container']/div[@id='personalDetailsForm']/div/div[5]/div[2]/div[1]/div[1]/input[1]")
    WebElement houseNumber2;

    @FindBy(xpath="//input[@name='plotNumber']")
    WebElement plotNumber;

    @FindBy(xpath="//div[text()='Pincode']/following-sibling::div//input")
    WebElement pincodeDropdown;

    @FindBy(xpath="//div[5]//div[2]//div[4]//div[1]//div[2]//div[1]//span[2]")
    WebElement pincodeDropdown2;

    @FindBy(xpath="//div[text()='Select Reason For Hold']/following-sibling::div//input")
    WebElement holdDropdown;
    @FindBy(xpath="//div[@class='rc-virtual-list-holder-inner']//div//div")
    WebElement holdOption;

    @FindBy(xpath="//div[@class='rc-virtual-list']//div[normalize-space(text())='Commercial activity on site-Consent Letter Not Uploaded']")
    WebElement holdSubOptionSpm;

    @FindBy(xpath="//div[@class='rc-virtual-list']//div[normalize-space(text())='Arrears on existing connection']")
    WebElement holdSubOptionTL;


    @FindBy(xpath="//div[text()='Select Sub Reason For Hold']/following-sibling::div//input")
    WebElement holdsubReason;

    @FindBy(xpath="//div[@class='rc-virtual-list']//div[normalize-space(text())='Delegate Show Site']")
    WebElement holdsubreasonOption;

    @FindBy(xpath="//div[@class='rc-virtual-list']//div[normalize-space(text())='No Residence found at site']")
    WebElement holdsubreasonOptionMR;

    @FindBy(xpath="//textarea[@placeholder='Enter Remarks']")
    WebElement remarksHold;

    @FindBy(xpath="//textarea[@placeholder='Enter remarks']")
    WebElement remarksHold2;

    @FindBy(xpath="//div[@class='rc-virtual-list']//div[text()='440021']")
    WebElement pincodeOption;

    @FindBy(xpath="//div[@class='form-section form-section-bordered'][2]//div[2]//label//span//input")
    WebElement sameAddresschk;


    @FindBy(xpath="//input[@name='layout']")
    WebElement layout;

    @FindBy(xpath="//input[@name='area']")
    WebElement area;

    @FindBy(xpath="//div[text()='Zone']/following-sibling::div//input")
    WebElement zoneDropdown;

    @FindBy(xpath="//div[@class='rc-virtual-list']//div[text()='Laxmi Nagar']")
    WebElement zoneOption;

    @FindBy(xpath="//div[.='Tax Receipt']/following-sibling::div//input")
    WebElement taxReceiptInput;

    @FindBy(xpath="//div[.='Registry / Sale Deed']/following-sibling::div//input")
    WebElement registrySaleDeedInput;

    @FindBy(xpath="//div[.='Registry/ Sale Deed']/following-sibling::div//input")
    WebElement registrySaleDeedInput2;


    @FindBy(xpath="//div[.='Photo (Passport Size)']/following-sibling::div//input")
    WebElement photoInput;

    @FindBy(xpath="//div[.='Photo ID (Aadhar/ PAN/ Driving License/ Passport)']/following-sibling::div//input")
    WebElement photoIdInput;

    @FindBy(xpath="//div[.='Electricity Bill']/following-sibling::div//input")
    WebElement electricityBill;

    @FindBy(xpath="//div[.='Water Supply Agreement']/following-sibling::div//input")
    WebElement waterSupplyAgreement;

    @FindBy(xpath="//span[text()='Submit']")
    WebElement submitButton;

    @FindBy(xpath="//button/span[text()='Yes']")
    WebElement confirmationYesButton;

    @FindBy(xpath="//div[contains(@class,'ant-spin-spinning')]")
    WebElement smallSpinner;
    @FindBy(xpath="//a[text()='Connections']")
    WebElement connectionsLeftNav;

    @FindBy(xpath="//div[@class='table-actions']//div//span")
    WebElement topListConnectionEdit;

    @FindBy(xpath="//div[@class='icon-container']//div")
    WebElement meterReader01assign;

    @FindBy(xpath="//input[@name='totalFamilyMembers/dwellingUnits']")
    WebElement totalFamilyMembers;

    @FindBy(xpath="//input[@name='nearbyContractAccountNumber']")
    WebElement nearbyContractAccountNumber;

    @FindBy(xpath="//div[text()='Any Other Connection found in Site']/following-sibling::div//input[@value='no']")
    WebElement anyOtherConnectionFound;

    @FindBy(xpath="//div[text()='Alternate Source of Water']/following-sibling::div//input[@value='no']")
    WebElement alternateWaterSources;
    @FindBy(xpath="//label[@class='upload-btn']/input")
    WebElement siteImageInput;

    @FindBy(xpath="//div[@name='mruId']")
    WebElement mruId;

    @FindBy(xpath="//div[@class='rc-virtual-list']//div[text()='M0150AA']")
    WebElement optionInMruId;

    @FindBy(xpath="//div[@name='materialOfMainPipe']")
    WebElement materialOfMainPipeline;

    @FindBy(xpath="//div[@class='rc-virtual-list']//div[text()='CI']")
    WebElement optionMaterialOfMainPipeline;

    @FindBy(xpath="//div[text()='New Hole']/following-sibling::div//input[@value='No']")
    WebElement newHoleOptionNo;

    @FindBy(xpath="//input[@name='depthOfMdpePipe']")
    WebElement depthOfMdpePipe;

    @FindBy(xpath="//input[@name='lengthOfMdpePipe']")
    WebElement lengthOfMdpePipe;
    @FindBy(xpath="//input[@name='waterFlowQuantity']")
    WebElement waterFlowQuantity;

    @FindBy(xpath="//input[@name='durationOfWaterSupplyInHours']")
    WebElement durationOfWaterSupplyInHours;

    @FindBy(xpath="//button/span[text()='Approved']")
    WebElement approveButton;

    @FindBy(xpath="//a[text()='Service Requests']")
    WebElement serviceRequests;

    @FindBy(xpath="//table//tbody//tr[1]/td[1]/span")
    WebElement serviceOrderNumber;
    @FindBy(xpath="//button/span[text()='Okay']")
    WebElement okayButton;

    @FindBy(xpath="//button/span[text()='Ok']")
    WebElement okButton;

    @FindBy(xpath="//div[@class='table-actions']/div[2]/span")
    WebElement payEditIcon;
    @FindBy(xpath="//div[text()='Payment method']/following-sibling::div//img[contains(@src,'PhonePe')]")
    WebElement phonePayOption;
    @FindBy(xpath="//button/span[text()='Pay']")
    WebElement payButton;

    @FindBy(xpath="//button/span[text()='Pay']")
    List<WebElement> payButtonList;

    @FindBy(xpath="(//div[@class='form-section ']//img)[2]")
    WebElement billDeskOption;

    @FindBy(xpath="(//button/span[text()='Pay'])[2]")
    WebElement payButtonOnDialog;

    @FindBy(xpath="//input[@id='new-card']")
    WebElement creditCardOption;

    @FindBy(xpath="//input[@id='cardNumber']")
    WebElement cardNumber;
    //1111222233334444123
    @FindBy(xpath="//input[@id='cardHolderName']")
    WebElement cardHolderName;

    @FindBy(xpath="//input[@id='selMonth']")
    WebElement selMonth;
    @FindBy(xpath="//input[@id='selYear']")
    WebElement selYear;
    @FindBy(xpath="//input[@id='cvvNumber']")
    WebElement cvvNumber;

    @FindBy(xpath="//input[@id='new-vpa']")
    WebElement upi_id;

    @FindBy(xpath="//input[@id='net-banking']")
    WebElement netBankingOption;
    @FindBy(xpath="//button[@id='b2bOnboardingSubmitButton']")
    WebElement payNowButton;
    @FindBy(xpath="//button[@id='btnSubmit']")
    WebElement loginButtonBank;
    @FindBy(xpath="//input[@value='Confirm']")
    WebElement confirmPayment;
    @FindBy(xpath="//input[@name='newMeterSerialNumber']")
    WebElement newMeterSerialNumber;
    @FindBy(xpath="//input[@name='newMeterSealNumber']")
    WebElement newMeterSealNumber;
    @FindBy(xpath="//input[@name='newMeterInstallationNumber']")
    WebElement newMeterInstallationNumber;
    @FindBy(xpath="//input[@name='mainPipeNumber']")
    WebElement mainPipeNumber;
    @FindBy(xpath="//div[@name='meterDiameterInMM']")
    WebElement meterDiameterInMMDropdown;
    @FindBy(xpath="//div[@class='rc-virtual-list']//div[text()='15 mm']")
    WebElement meterDiameterInMMDropdownOption;
    @FindBy(xpath="//div[@name='meterBrandName']")
    WebElement meterBrandNameDropdown;
    @FindBy(xpath="//div[@class='rc-virtual-list']//div[text()='Itron']")
    WebElement meterBrandNameDropdownOption;
    @FindBy(xpath="//input[@name='initialMeterReading']")
    WebElement initialMeterReading;
    @FindBy(xpath="//input[@name='noOfDials']")
    WebElement noOfDials;
    @FindBy(xpath="//div[@name='meterOwner']")
    WebElement meterOwnerDropdown;
    @FindBy(xpath="//div[@class='rc-virtual-list']//div[text()='NMC_ON']")
    WebElement meterOwnerDropdownOption;
    @FindBy(xpath="//span[text()='Private']")
    WebElement privateOptionInRadio;
    @FindBy(xpath="//div[@name='relationshipWithCustomer']")
    WebElement relationshipWithCustomerDropdown;
    @FindBy(xpath="//div[@class='rc-virtual-list']//div[text()='Mother']")
    WebElement relationshipWithCustomerDropdownOption;
    @FindBy(xpath="//input[@name='contractorName']")
    WebElement contractorName;

    @FindBy(xpath="//div[contains(.,'HSC Form')]/label//input")
    WebElement hscForm;

    @FindBy(xpath="//div[contains(.,'Meter Image')]/label//input")
    WebElement meterImage;
    @FindBy(xpath="//div[contains(.,'Meter Assembly Photo')]/label//input")
    WebElement meterAssemblyPhoto;

    @FindBy(xpath="//input[@value='email']")
    WebElement emailCheckbox;

    @FindBy(xpath="//input[@value='sms']")
    WebElement smsCheckbox;

    @FindBy(xpath="//input[@value='physicalBill']")
    WebElement physicalBillCheckbox;

    @FindBy(xpath="//div[@class='ant-radio-group ant-radio-group-outline css-6j9yrn']//label[2]//span")
    WebElement CommercialBtn;


    @FindBy(xpath="//div[@class='form-section form-section-bordered']//label[1]//span")
    WebElement radioBtn1;

    @FindBy(xpath="//div[@class='form-section form-section-bordered']//label[2]//span")
    WebElement radioBtn2;


    @FindBy(xpath="//input[@name='companyName']")
    WebElement ConnectionNameField;

    @FindBy(xpath="//input[@value='residential']")
    WebElement connectionType;

    @FindBy(xpath="//span[@aria-label='check']//*[name()='svg']")
    WebElement connectionTypeLnk;


    @FindBy(xpath="//div[@class='ant-modal-confirm-btns']//button[2]")
    WebElement yesBtn;

    @FindBy(xpath="//input[@name='contactNumber']")
    WebElement contactNumber;

    @FindBy(xpath="//input[@name='contactEmail']")
    WebElement contactEmail;

    @FindBy(xpath="//div[.='Gumasta License/ Licenses for Running Business']/following-sibling::div//input")
    WebElement gustamaLicence;

    @FindBy(xpath="//div[.='Sanctioned Building Plan (For Multi-storey Building only)']/following-sibling::div//input")
    WebElement buildingPlan;


    @FindBy(xpath="//button[@id='action-btn']")
    WebElement proceedBtn;





    //Initializing the page objects here
    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    //Actions here

    public boolean verifyHomePageLoaded() {
        return logOutBtn.isDisplayed();
    }

    public void createNewConnection() throws InterruptedException {
        connectionsDropdown.click();
        newConnectionOptionInDropdown.click();
       // TestUtil.waitUntilClickable();
        TestUtil.waitForFiveSeconds();
        applyForNewConnectionButton.click();
        TestUtil.waitForTwoSeconds();

      newConnectionInstructionOKButton.click();
        TestUtil.waitForTwoSeconds();
        connectionType.click();
        TestUtil.waitForTwoSeconds();
        residentialRadioButton.click();
        TestUtil.waitForTwoSeconds();
        r1RadioButton.click();
        individualRadioButton.click();
        nextButton.click();
        TestUtil.waitForFiveSeconds();
        titleDropdown.click();
        TestUtil.waitForOneSeconds();
        mrOptionInTitleDropdown.click();
        firstName.sendKeys("Aditya");
        lastName.sendKeys("Raghuwanshi+Automation");
        fatherName.sendKeys("raghuwanshi");
        electricBillNumber.sendKeys("123456");
        houseNumber.sendKeys("23, Mercer Street");
        plotNumber.sendKeys("30");
        pincodeDropdown.click();
        TestUtil.waitForOneSeconds();
        pincodeOption.click();
        layout.sendKeys("abc");
        area.sendKeys("xyz");
        zoneDropdown.click();
        TestUtil.waitForOneSeconds();
        zoneOption.click();
        nextButton.click();

        TestUtil.waitForFiveSeconds();
        taxReceiptInput.sendKeys(System.getProperty("user.dir")+"/SampleFile.png");
        TestUtil.waitForFiveSeconds();
        registrySaleDeedInput.sendKeys(System.getProperty("user.dir")+"/SampleFile.png");
        TestUtil.waitForFiveSeconds();
        photoInput.sendKeys(System.getProperty("user.dir")+"/SampleFile.png");
        TestUtil.waitForFiveSeconds();
        photoIdInput.sendKeys(System.getProperty("user.dir")+"/SampleFile.png");
        TestUtil.waitForFiveSeconds();
        electricityBill.sendKeys(System.getProperty("user.dir")+"/SampleFile.png");
        TestUtil.waitForFiveSeconds();
        waterSupplyAgreement.sendKeys(System.getProperty("user.dir")+"/SampleFile.png");
        TestUtil.waitForFiveSeconds();
        nextButton.click();
        TestUtil.waitForFiveSeconds();
        consentCheckbox.click();
        signatureUploadButton.sendKeys(System.getProperty("user.dir")+"/SampleFile.png");
        TestUtil.waitForFiveSeconds();
        previewButton.click();
        TestUtil.waitForFiveSeconds();
        new Actions(driver).moveToElement(submitButton).perform();
        submitButton.click();
        TestUtil.waitForFiveSeconds();
        confirmationYesButton.click();
        TestUtil.waitForFiveSeconds();
        TestUtil.waitForFiveSeconds();
        logOutBtn.click();
    }

    public void createNewConnectionR1SlumHut() throws InterruptedException {
        connectionsDropdown.click();
        newConnectionOptionInDropdown.click();
        // TestUtil.waitUntilClickable();
        TestUtil.waitForFiveSeconds();
        applyForNewConnectionButton.click();
        TestUtil.waitForTwoSeconds();

       newConnectionInstructionOKButton.click();
        TestUtil.waitForTwoSeconds();
//        connectionTypeLnk.click();
//        TestUtil.waitForTwoSeconds();
        residentialRadioButton.click();
        TestUtil.waitForTwoSeconds();
      //  confirmationYesButton.click();
        TestUtil.waitForTwoSeconds();
        TestUtil.waitForTwoSeconds();
        slumBtn.click();
        TestUtil.waitForTwoSeconds();
        TestUtil.waitForFiveSeconds();
        hutR1Btn.click();
        TestUtil.waitForOneSeconds();
        nextButton.click();
        TestUtil.waitForFiveSeconds();
        titleDropdown.click();
        TestUtil.waitForOneSeconds();
        mrOptionInTitleDropdown.click();
        firstName.sendKeys("Aditya");
        lastName.sendKeys("Raghuwanshi+Automation");
        fatherName.sendKeys("raghuwanshi");
        electricBillNumber.sendKeys("123456");
        houseNumber.sendKeys("23, Mercer Street");
        plotNumber.sendKeys("30");
        pincodeDropdown.click();
        TestUtil.waitForOneSeconds();
        pincodeOption.click();
        layout.sendKeys("abc");
        area.sendKeys("xyz");
        zoneDropdown.click();
        TestUtil.waitForOneSeconds();
        zoneOption.click();
        nextButton.click();

        TestUtil.waitForFiveSeconds();
        taxReceiptInput.sendKeys(System.getProperty("user.dir")+"/SampleFile.png");
        TestUtil.waitForFiveSeconds();
        registrySaleDeedInput.sendKeys(System.getProperty("user.dir")+"/SampleFile.png");
        TestUtil.waitForFiveSeconds();
        slumCertificate.sendKeys(System.getProperty("user.dir")+"/SampleFile.png");
        TestUtil.waitForFiveSeconds();
        kabjaCertificate.sendKeys(System.getProperty("user.dir")+"/SampleFile.png");
        TestUtil.waitForFiveSeconds();
        addressProofcertificate.sendKeys(System.getProperty("user.dir")+"/SampleFile.png");
        TestUtil.waitForFiveSeconds();
        photoInput.sendKeys(System.getProperty("user.dir")+"/SampleFile.png");
        TestUtil.waitForFiveSeconds();
        electricityBill.sendKeys(System.getProperty("user.dir")+"/SampleFile.png");
        TestUtil.waitForFiveSeconds();
        waterSupplyAgreement.sendKeys(System.getProperty("user.dir")+"/SampleFile.png");
        TestUtil.waitForFiveSeconds();
        nextButton.click();
        TestUtil.waitForFiveSeconds();
        consentCheckbox.click();
        signatureUploadButton.sendKeys(System.getProperty("user.dir")+"/SampleFile.png");
        TestUtil.waitForFiveSeconds();
        previewButton.click();
        TestUtil.waitForFiveSeconds();
        new Actions(driver).moveToElement(submitButton).perform();
        submitButton.click();
        TestUtil.waitForFiveSeconds();
        confirmationYesButton.click();
        TestUtil.waitForFiveSeconds();
        TestUtil.waitForFiveSeconds();
        logOutBtn.click();
    }
    public void createNewConnectionC1A() throws InterruptedException {
        connectionsDropdown.click();
        newConnectionOptionInDropdown.click();
        // TestUtil.waitUntilClickable();
        TestUtil.waitForFiveSeconds();
        applyForNewConnectionButton.click();
        TestUtil.waitForFiveSeconds();
      //  newConnectionInstructionOKButton.click();
//        TestUtil.waitForTwoSeconds();
        connectionType.click();
        TestUtil.waitForTwoSeconds();

      //  TestUtil.waitForTwoSeconds();
        CommercialBtn.click();
        TestUtil.waitForTwoSeconds();
    //    yesBtn.click();
//        TestUtil.waitForTwoSeconds();
         radioBtn1.click();
        TestUtil.waitForTwoSeconds();
        TestUtil.waitForTwoSeconds();
        nextButton.click();
        TestUtil.waitForFiveSeconds();
        ConnectionNameField.sendKeys("Aditya");
        titleDropdown.click();
        TestUtil.waitForOneSeconds();
        mrOptionInTitleDropdown.click();
        firstName.sendKeys("Aditya");
        lastName.sendKeys("Raghuwanshi+Automation");
        contactNumber.sendKeys("987654321");
        contactEmail.sendKeys("test+automation@saltoris.com");
        electricBillNumber.sendKeys("123456");
        houseNumber2.sendKeys("23, Mercer Street");
        plotNumber.sendKeys("30");
        TestUtil.waitForTwoSeconds();
        pincodeDropdown2.click();
        TestUtil.waitForOneSeconds();
        pincodeOption.click();
        layout.sendKeys("abc");
        area.sendKeys("xyz");
        TestUtil.waitForOneSeconds();
        sameAddresschk.click();
        TestUtil.waitForOneSeconds();
        zoneDropdown.click();
        TestUtil.waitForOneSeconds();
        zoneOption.click();
        nextButton.click();

        TestUtil.waitForFiveSeconds();
        taxReceiptInput.sendKeys(System.getProperty("user.dir")+"/SampleFile.png");
        TestUtil.waitForFiveSeconds();
        TestUtil.waitForFiveSeconds();
     registrySaleDeedInput2.sendKeys(System.getProperty("user.dir")+"/SampleFile.png");
        TestUtil.waitForFiveSeconds();
         gustamaLicence.sendKeys(System.getProperty("user.dir")+"/SampleFile.png");
       TestUtil.waitForFiveSeconds();
     buildingPlan.sendKeys(System.getProperty("user.dir")+"/SampleFile.png");
       TestUtil.waitForFiveSeconds();

        photoInput.sendKeys(System.getProperty("user.dir")+"/SampleFile.png");
        TestUtil.waitForFiveSeconds();
       // photoIdInput.sendKeys(System.getProperty("user.dir")+"/SampleFile.png");
        TestUtil.waitForFiveSeconds();
        TestUtil.waitForFiveSeconds();
        electricityBill.sendKeys(System.getProperty("user.dir")+"/SampleFile.png");
        TestUtil.waitForFiveSeconds();
        waterSupplyAgreement.sendKeys(System.getProperty("user.dir")+"/SampleFile.png");
        TestUtil.waitForFiveSeconds();
        nextButton.click();
        TestUtil.waitForFiveSeconds();
        consentCheckbox.click();
        signatureUploadButton.sendKeys(System.getProperty("user.dir")+"/SampleFile.png");
        TestUtil.waitForFiveSeconds();
        previewButton.click();
        TestUtil.waitForFiveSeconds();
        new Actions(driver).moveToElement(submitButton).perform();
        submitButton.click();
        TestUtil.waitForFiveSeconds();
        confirmationYesButton.click();
        TestUtil.waitForFiveSeconds();
        TestUtil.waitForFiveSeconds();
        logOutBtn.click();
    }


    public void createNewConnectionIA() throws InterruptedException {
        connectionsDropdown.click();
        newConnectionOptionInDropdown.click();
        // TestUtil.waitUntilClickable();
        TestUtil.waitForFiveSeconds();
        applyForNewConnectionButton.click();
      //  TestUtil.waitForFiveSeconds();
        //connectionTypeLnk.click();
//        TestUtil.waitForTwoSeconds();
        TestUtil.waitForFiveSeconds();
        newConnectionInstructionOKButton.click();

        TestUtil.waitForTwoSeconds();
        TestUtil.waitForTwoSeconds();
        InstitutionalBtn.click();
        TestUtil.waitForTwoSeconds();
        //    yesBtn.click();
//        TestUtil.waitForTwoSeconds();
        radioBtn1.click();
        TestUtil.waitForTwoSeconds();
        TestUtil.waitForTwoSeconds();
        nextButton.click();
        TestUtil.waitForFiveSeconds();
        ConnectionNameField.sendKeys("Automation+IA");
        titleDropdown.click();
        TestUtil.waitForOneSeconds();
        mrOptionInTitleDropdown.click();
        firstName.sendKeys("Aditya");
        lastName.sendKeys("Raghuwanshi+Automation");
        contactNumber.sendKeys("987654321");
        contactEmail.sendKeys("test+automation@saltoris.com");
        electricBillNumber.sendKeys("123456");
        houseNumber2.sendKeys("23, Mercer Street");
        plotNumber.sendKeys("30");
        TestUtil.waitForTwoSeconds();
        pincodeDropdown2.click();
        TestUtil.waitForOneSeconds();
        pincodeOption.click();
        layout.sendKeys("abc");
        TestUtil.waitForTwoSeconds();
        area.sendKeys("xyz");
        TestUtil.waitForTwoSeconds();
        sameAddresschk.isEnabled();
        sameAddresschk.click();
        TestUtil.waitForOneSeconds();
        zoneDropdown.click();
        TestUtil.waitForOneSeconds();
        zoneOption.click();
        nextButton.click();

        TestUtil.waitForFiveSeconds();
        taxReceiptInput.sendKeys(System.getProperty("user.dir")+"/SampleFile.png");
        TestUtil.waitForFiveSeconds();
        TestUtil.waitForFiveSeconds();
        registrySaleDeedInput2.sendKeys(System.getProperty("user.dir")+"/SampleFile.png");
        TestUtil.waitForFiveSeconds();
        gustamaLicence.sendKeys(System.getProperty("user.dir")+"/SampleFile.png");
        TestUtil.waitForFiveSeconds();
        buildingPlan.sendKeys(System.getProperty("user.dir")+"/SampleFile.png");
        TestUtil.waitForFiveSeconds();

        photoInput.sendKeys(System.getProperty("user.dir")+"/SampleFile.png");
        TestUtil.waitForFiveSeconds();
        // photoIdInput.sendKeys(System.getProperty("user.dir")+"/SampleFile.png");
        TestUtil.waitForFiveSeconds();
        TestUtil.waitForFiveSeconds();
        electricityBill.sendKeys(System.getProperty("user.dir")+"/SampleFile.png");
        TestUtil.waitForFiveSeconds();
        waterSupplyAgreement.sendKeys(System.getProperty("user.dir")+"/SampleFile.png");
        TestUtil.waitForFiveSeconds();
        nextButton.click();
        TestUtil.waitForFiveSeconds();
        consentCheckbox.click();
        signatureUploadButton.sendKeys(System.getProperty("user.dir")+"/SampleFile.png");
        TestUtil.waitForFiveSeconds();
        previewButton.click();
        TestUtil.waitForFiveSeconds();
        new Actions(driver).moveToElement(submitButton).perform();
        submitButton.click();
        TestUtil.waitForFiveSeconds();
        confirmationYesButton.click();
        TestUtil.waitForFiveSeconds();
        TestUtil.waitForFiveSeconds();
        logOutBtn.click();
    }

    public void Logout() throws InterruptedException {
        Thread.sleep(5000);
        logOutBtn.click();
        Thread.sleep(3000);
        driver.quit();
        //  return new StorePage();
    }



    public void approveConnection(String approver) throws InterruptedException {
        if(approver.equalsIgnoreCase("cso")) {
            connectionsLeftNav.click();
            //  TestUtil.waitForFiveSeconds();
            topListConnectionEdit.click();
            //  TestUtil.waitForFiveSeconds();
            new Actions(driver).moveToElement(nextButton).perform();
            nextButton.click();
            TestUtil.waitForFiveSeconds();
            new Actions(driver).moveToElement(nextButton).perform();
            nextButton.click();
            TestUtil.waitForFiveSeconds();
            new Actions(driver).moveToElement(nextButton).perform();
            nextButton.click();
            //  TestUtil.waitForTwoSeconds();
            try {
                new Actions(driver).moveToElement(nextButton).perform();
                nextButton.click();
                TestUtil.waitForFiveSeconds();
                new Actions(driver).moveToElement(nextButton).perform();
                nextButton.click();
                TestUtil.waitForFiveSeconds();
                new Actions(driver).moveToElement(nextButton).perform();
                nextButton.click();
                TestUtil.waitForFiveSeconds();
                emailCheckbox.click();
                smsCheckbox.click();
                physicalBillCheckbox.click();
            } catch(Exception e) {

            }
            previewButton.click();
            TestUtil.waitForFiveSeconds();
            new Actions(driver).moveToElement(submitButton).perform();
            submitButton.click();
            TestUtil.waitForTwoSeconds();
            confirmationYesButton.click();
            TestUtil.waitForFiveSeconds();
            TestUtil.waitForFiveSeconds();
            logOutBtn.click();
            TestUtil.waitForFiveSeconds();
        }
        if(approver.equalsIgnoreCase("cso-hold")) {
            connectionsLeftNav.click();
            //  TestUtil.waitForFiveSeconds();
            topListConnectionEdit.click();
            //  TestUtil.waitForFiveSeconds();
            new Actions(driver).moveToElement(nextButton).perform();
            nextButton.click();
            TestUtil.waitForFiveSeconds();
            new Actions(driver).moveToElement(nextButton).perform();
            nextButton.click();
            TestUtil.waitForFiveSeconds();
            new Actions(driver).moveToElement(nextButton).perform();
            nextButton.click();
            //  TestUtil.waitForTwoSeconds();
            try {
                new Actions(driver).moveToElement(nextButton).perform();
                nextButton.click();
                TestUtil.waitForFiveSeconds();
                new Actions(driver).moveToElement(nextButton).perform();
                nextButton.click();
                TestUtil.waitForFiveSeconds();
                new Actions(driver).moveToElement(nextButton).perform();
                nextButton.click();
                TestUtil.waitForFiveSeconds();
                emailCheckbox.click();
                smsCheckbox.click();
                physicalBillCheckbox.click();
            } catch(Exception e) {

            }
            holdBtn.click();
            TestUtil.waitForFiveSeconds();
            holdDropdown.click();
            TestUtil.waitForTwoSeconds();
            holdOption.click();
            TestUtil.waitForTwoSeconds();
            holdsubReason.click();
            TestUtil.waitForTwoSeconds();

            holdSubOptionSpm.click();
            TestUtil.waitForTwoSeconds();
            remarksHold.sendKeys("Test hold");
            TestUtil.waitForTwoSeconds();
            previewButton.click();
            TestUtil.waitForTwoSeconds();
            new Actions(driver).moveToElement(submitButton).perform();
            submitButton.click();
            TestUtil.waitForTwoSeconds();
            confirmationYesButton.click();
            TestUtil.waitForFiveSeconds();
            TestUtil.waitForFiveSeconds();
            logOutBtn.click();
            TestUtil.waitForFiveSeconds();
        }
        else if(approver.equalsIgnoreCase("tl")) {
            TestUtil.waitForFiveSeconds();
            connectionsLeftNav.click();
            TestUtil.waitForFiveSeconds();
            topListConnectionEdit.click();
            TestUtil.waitForFiveSeconds();
            TestUtil.waitForFiveSeconds();
            TestUtil.waitForFiveSeconds();
            meterReader01assign.click();
            TestUtil.waitForFiveSeconds();
            TestUtil.waitForFiveSeconds();
            confirmationYesButton.click();
            TestUtil.waitForFiveSeconds();
            logOutBtn.click();
            TestUtil.waitForFiveSeconds();
        }
        else if(approver.equalsIgnoreCase("consumer-after-hold")) {
            TestUtil.waitForFiveSeconds();
            connectionsDropdown.click();
            newConnectionOptionInDropdown.click();
            TestUtil.waitForFiveSeconds();
            topListConnectionEdit.click();

            TestUtil.waitForFiveSeconds();
            TestUtil.waitForFiveSeconds();
            nextButton.click();
            TestUtil.waitForFiveSeconds();
            nextButton.click();
            TestUtil.waitForFiveSeconds();
            updateButton.click();
            TestUtil.waitForFiveSeconds();
            logOutBtn.click();
            TestUtil.waitForFiveSeconds();
        }
        else if(approver.equalsIgnoreCase("TL-hold")) {
            TestUtil.waitForFiveSeconds();
            connectionsLeftNav.click();
            TestUtil.waitForFiveSeconds();
            topListConnectionEdit.click();
            TestUtil.waitForFiveSeconds();
            TestUtil.waitForFiveSeconds();
            holdBtn.click();
            TestUtil.waitForTwoSeconds();
            holdDropdown.click();
            TestUtil.waitForTwoSeconds();
            holdOption.click();
            TestUtil.waitForTwoSeconds();
            holdsubReason.click();
            TestUtil.waitForTwoSeconds();

            holdSubOptionTL.click();
            TestUtil.waitForTwoSeconds();
            remarksHold2.sendKeys("Test hold");
            TestUtil.waitForFiveSeconds();
            proceedBtn.click();
            TestUtil.waitForTwoSeconds();

            confirmationYesButton.click();
            TestUtil.waitForFiveSeconds();
            logOutBtn.click();
            TestUtil.waitForFiveSeconds();
        }
        else if(approver.equalsIgnoreCase("TLFORCOMMERCIAL")) {
            TestUtil.waitForFiveSeconds();
            connectionsLeftNav.click();
            TestUtil.waitForFiveSeconds();
            topListConnectionEdit.click();
            TestUtil.waitForFiveSeconds();
          proceedBtn.click();
            TestUtil.waitForFiveSeconds();
            confirmationYesButton.click();
            TestUtil.waitForFiveSeconds();
            logOutBtn.click();
            TestUtil.waitForFiveSeconds();
        }

        else if(approver.equalsIgnoreCase("spm-hold2")) {
            TestUtil.waitForFiveSeconds();
            connectionsLeftNav.click();
            TestUtil.waitForFiveSeconds();
            topListConnectionEdit.click();
            TestUtil.waitForFiveSeconds();
            holdBtn.click();
            TestUtil.waitForTwoSeconds();
            holdSubOptionSpm.click();
            TestUtil.waitForTwoSeconds();
            holdsubReason.click();
            TestUtil.waitForTwoSeconds();
            holdSubOptionSpm.click();
            TestUtil.waitForTwoSeconds();
            remarksHold.sendKeys("SPM HOLD 2");
            TestUtil.waitForTwoSeconds();
            proceedBtn.click();
            TestUtil.waitForFiveSeconds();
            confirmationYesButton.click();
            TestUtil.waitForFiveSeconds();
            logOutBtn.click();
            TestUtil.waitForFiveSeconds();
        }
        else if(approver.equalsIgnoreCase("TLFORINSTITUTIONAL")) {
            connectionsLeftNav.click();
            TestUtil.waitForFiveSeconds();
            topListConnectionEdit.click();
            TestUtil.waitForFiveSeconds();
            totalFamilyMembers.sendKeys("4");
            nearbyContractAccountNumber.sendKeys("12345667");
            anyOtherConnectionFound.click();
            alternateWaterSources.click();
            TestUtil.waitForTwoSeconds();
            mruId.click();
            TestUtil.waitForTwoSeconds();
            optionInMruId.click();
            siteImageInput.sendKeys(System.getProperty("user.dir")+"/SampleFile.png");
            TestUtil.waitForFiveSeconds();
            TestUtil.waitForFiveSeconds();
            proceedBtn.click();
            TestUtil.waitForFiveSeconds();
            confirmationYesButton.click();
            TestUtil.waitForFiveSeconds();
            TestUtil.waitForFiveSeconds();
            logOutBtn.click();
            TestUtil.waitForFiveSeconds();
        }
            else if(approver.equalsIgnoreCase("mr")) {
            connectionsLeftNav.click();
            TestUtil.waitForFiveSeconds();
            topListConnectionEdit.click();
            TestUtil.waitForFiveSeconds();
            totalFamilyMembers.sendKeys("4");
            nearbyContractAccountNumber.sendKeys("12345667");
            anyOtherConnectionFound.click();
            alternateWaterSources.click();
            TestUtil.waitForTwoSeconds();
            new Actions(driver).moveToElement(submitButton).perform();
            TestUtil.waitForTwoSeconds();
            mruId.click();
            TestUtil.waitForTwoSeconds();
            optionInMruId.click();
            siteImageInput.sendKeys(System.getProperty("user.dir")+"/SampleFile.png");
            TestUtil.waitForFiveSeconds();
            TestUtil.waitForFiveSeconds();
            new Actions(driver).moveToElement(submitButton).perform();
            submitButton.click();
            TestUtil.waitForTwoSeconds();
            confirmationYesButton.click();
            TestUtil.waitForFiveSeconds();
            TestUtil.waitForTwoSeconds();
            logOutBtn.click();
            TestUtil.waitForFiveSeconds();
        }
        else if(approver.equalsIgnoreCase("TL03")) {
            connectionsLeftNav.click();
            TestUtil.waitForFiveSeconds();
            topListConnectionEdit.click();
            TestUtil.waitForFiveSeconds();


            submitButton.click();
            TestUtil.waitForTwoSeconds();
            confirmationYesButton.click();
            TestUtil.waitForFiveSeconds();
            TestUtil.waitForTwoSeconds();
            logOutBtn.click();
            TestUtil.waitForFiveSeconds();
        } else if(approver.equalsIgnoreCase("mr-hold")) {
            connectionsLeftNav.click();
            TestUtil.waitForFiveSeconds();
            topListConnectionEdit.click();
            TestUtil.waitForFiveSeconds();
            totalFamilyMembers.sendKeys("4");
            nearbyContractAccountNumber.sendKeys("12345667");
            anyOtherConnectionFound.click();
            alternateWaterSources.click();
            TestUtil.waitForTwoSeconds();
            new Actions(driver).moveToElement(submitButton).perform();
            TestUtil.waitForTwoSeconds();
            mruId.click();
            TestUtil.waitForTwoSeconds();
            optionInMruId.click();
            siteImageInput.sendKeys(System.getProperty("user.dir")+"/SampleFile.png");
            TestUtil.waitForFiveSeconds();
           holdBtn.click();
            TestUtil.waitForTwoSeconds();
           holdDropdown.click();
            TestUtil.waitForTwoSeconds();
            holdOption.click();
            TestUtil.waitForTwoSeconds();
            holdsubReason.click();
            TestUtil.waitForTwoSeconds();
            holdsubreasonOptionMR.click();
            TestUtil.waitForTwoSeconds();
            remarksHold.sendKeys("hold MR");
            TestUtil.waitForTwoSeconds();
            submitButton.click();
            TestUtil.waitForTwoSeconds();
            confirmationYesButton.click();
            TestUtil.waitForFiveSeconds();
            TestUtil.waitForTwoSeconds();
            logOutBtn.click();
            TestUtil.waitForFiveSeconds();
            }
            else if(approver.equalsIgnoreCase("tl01")) {
            connectionsLeftNav.click();
            TestUtil.waitForFiveSeconds();
            topListConnectionEdit.click();
            TestUtil.waitForFiveSeconds();
            new Actions(driver).moveToElement(submitButton).perform();
            submitButton.click();
            TestUtil.waitForFiveSeconds();
            confirmationYesButton.click();
            TestUtil.waitForFiveSeconds();
            TestUtil.waitForTwoSeconds();
            logOutBtn.click();
            TestUtil.waitForFiveSeconds();
        } else if(approver.equalsIgnoreCase("spm")) {
            connectionsLeftNav.click();
            TestUtil.waitForFiveSeconds();
            topListConnectionEdit.click();
            TestUtil.waitForFiveSeconds();
            new Actions(driver).moveToElement(nextButton).perform();
            nextButton.click();
            TestUtil.waitForFiveSeconds();
            new Actions(driver).moveToElement(nextButton).perform();
            nextButton.click();
            TestUtil.waitForFiveSeconds();
            try {
                new Actions(driver).moveToElement(nextButton).perform();
                nextButton.click();
                TestUtil.waitForFiveSeconds();
                new Actions(driver).moveToElement(nextButton).perform();
                nextButton.click();
                new Actions(driver).moveToElement(nextButton).perform();
                nextButton.click();
                TestUtil.waitForFiveSeconds();
                new Actions(driver).moveToElement(nextButton).perform();
                nextButton.click();
                TestUtil.waitForFiveSeconds();
            } catch(Exception e) {}
            TestUtil.waitForFiveSeconds();
            previewButton.click();
            TestUtil.waitForFiveSeconds();
            new Actions(driver).moveToElement(submitButton).perform();
            submitButton.click();
            TestUtil.waitForFiveSeconds();
            confirmationYesButton.click();
            TestUtil.waitForFiveSeconds();
            logOutBtn.click();
            TestUtil.waitForFiveSeconds();
        }
        else if(approver.equalsIgnoreCase("spm APPROVE 2")) {
            connectionsLeftNav.click();
            TestUtil.waitForFiveSeconds();
            topListConnectionEdit.click();
            TestUtil.waitForFiveSeconds();
//            new Actions(driver).moveToElement(nextButton).perform();
            nextButton.click();
            TestUtil.waitForTwoSeconds();
                      previewButton.click();
            TestUtil.waitForFiveSeconds();
            submitButton.click();
            TestUtil.waitForTwoSeconds();
            confirmationYesButton.click();
            TestUtil.waitForFiveSeconds();
            TestUtil.waitForTwoSeconds();
            logOutBtn.click();
            TestUtil.waitForFiveSeconds();
        } else if(approver.equalsIgnoreCase("zm")) {
            connectionsLeftNav.click();
            TestUtil.waitForFiveSeconds();
            topListConnectionEdit.click();
            TestUtil.waitForFiveSeconds();
            new Actions(driver).moveToElement(nextButton).perform();
            TestUtil.waitForFiveSeconds();
            nextButton.click();
            TestUtil.waitForTwoSeconds();
            TestUtil.waitForFiveSeconds();
            nextButton.click();
            new Actions(driver).moveToElement(nextButton).perform();
            TestUtil.waitForFiveSeconds();
            nextButton.click();
            try {
                new Actions(driver).moveToElement(nextButton).perform();
                nextButton.click();
                TestUtil.waitForTwoSeconds();
                new Actions(driver).moveToElement(nextButton).perform();
                nextButton.click();
                TestUtil.waitForFiveSeconds();
            } catch(Exception e) {   }
            new Actions(driver).moveToElement(previewButton).perform();
            previewButton.click();
            TestUtil.waitForFiveSeconds();
            new Actions(driver).moveToElement(submitButton).perform();
            submitButton.click();
            TestUtil.waitForFiveSeconds();
            confirmationYesButton.click();
            TestUtil.waitForFiveSeconds();
            TestUtil.waitForFiveSeconds();
            logOutBtn.click();
            TestUtil.waitForFiveSeconds();
        } else if(approver.equalsIgnoreCase("dl")) {
            connectionsLeftNav.click();
            TestUtil.waitForFiveSeconds();
            topListConnectionEdit.click();
            TestUtil.waitForFiveSeconds();
            new Actions(driver).moveToElement(nextButton).perform();
            nextButton.click();
            TestUtil.waitForFiveSeconds();
            nextButton.click();
            new Actions(driver).moveToElement(nextButton).perform();
            nextButton.click();
            TestUtil.waitForFiveSeconds();
            new Actions(driver).moveToElement(nextButton).perform();
            nextButton.click();
            TestUtil.waitForFiveSeconds();
            new Actions(driver).moveToElement(previewButton).perform();
            previewButton.click();
            TestUtil.waitForFiveSeconds();
            new Actions(driver).moveToElement(approveButton).perform();
            approveButton.click();
            TestUtil.waitForFiveSeconds();
            confirmationYesButton.click();
            TestUtil.waitForFiveSeconds();
            TestUtil.waitForTwoSeconds();
            logOutBtn.click();
            TestUtil.waitForFiveSeconds();
        }
        else if(approver.equalsIgnoreCase("dl-hold")) {
            connectionsLeftNav.click();
            TestUtil.waitForFiveSeconds();
            topListConnectionEdit.click();
            TestUtil.waitForFiveSeconds();
            new Actions(driver).moveToElement(nextButton).perform();
            nextButton.click();
            TestUtil.waitForFiveSeconds();
            nextButton.click();
            TestUtil.waitForFiveSeconds();
            nextButton.click();
            TestUtil.waitForFiveSeconds();
            holdBtn.click();
            TestUtil.waitForFiveSeconds();
            holdDropdown.click();
            TestUtil.waitForTwoSeconds();
            holdOption.click();
            TestUtil.waitForTwoSeconds();
            holdsubReason.click();
            TestUtil.waitForTwoSeconds();
            holdsubreasonOption.click();
            TestUtil.waitForTwoSeconds();
            remarksHold.sendKeys("Hold by DL");
            TestUtil.waitForTwoSeconds();
            previewButton.click();
                       TestUtil.waitForFiveSeconds();
            new Actions(driver).moveToElement(approveButton).perform();
            approveButton.click();
            TestUtil.waitForFiveSeconds();
            confirmationYesButton.click();
            TestUtil.waitForFiveSeconds();
            TestUtil.waitForTwoSeconds();
            logOutBtn.click();
            TestUtil.waitForFiveSeconds();
        } else if(approver.equalsIgnoreCase("EE")) {
            connectionsLeftNav.click();
            TestUtil.waitForFiveSeconds();
            topListConnectionEdit.click();
            TestUtil.waitForFiveSeconds();
            proceedBtn.click();
            TestUtil.waitForFiveSeconds();
            proceedBtn.click();
            TestUtil.waitForTwoSeconds();
            proceedBtn.click();
            TestUtil.waitForTwoSeconds();
            proceedBtn.click();
            TestUtil.waitForTwoSeconds();
            proceedBtn.click();
            TestUtil.waitForTwoSeconds();
            approveButton.click();
            TestUtil.waitForTwoSeconds();
            confirmationYesButton.click();
            TestUtil.waitForFiveSeconds();
            logOutBtn.click();
            TestUtil.waitForTwoSeconds();
        }

            else if(approver.equalsIgnoreCase("aditya")) {
            connectionsDropdown.click();
            TestUtil.waitForTwoSeconds();
            newConnectionOptionInDropdown.click();
            TestUtil.waitForFiveSeconds();
            payEditIcon.click();
            TestUtil.waitForFiveSeconds();
            payButton.click();
            TestUtil.waitForFiveSeconds();
            phonePayOption.click();
            TestUtil.waitForFiveSeconds();
            payButton.click();
            TestUtil.waitForFiveSeconds();
            payButtonOnDialog.click();
            TestUtil.waitForFiveSeconds();
            TestUtil.waitForFiveSeconds();
            TestUtil.waitForFiveSeconds();
            driver.switchTo().frame(0);
            TestUtil.waitForTwoSeconds();
            upi_id.click();
            new Actions(driver).moveToElement(netBankingOption).perform();
            netBankingOption.click();
            String main_window = driver.getWindowHandle();
            payNowButton.click();
            driver.switchTo().defaultContent();
            TestUtil.waitForFiveSeconds();
            TestUtil.waitForFiveSeconds();
            Set<String> window_ids = driver.getWindowHandles();
            window_ids.remove(main_window);
            driver.switchTo().window(window_ids.iterator().next());
            usernameBank.sendKeys("aditya");
            passwordBank.sendKeys("1234");
            loginButtonBank.click();
            TestUtil.waitForFiveSeconds();
            confirmPayment.click();
            TestUtil.waitForFiveSeconds();
            driver.switchTo().window(main_window);
            TestUtil.waitForFiveSeconds();
            okButton.click();
            TestUtil.waitForFiveSeconds();
            TestUtil.waitForFiveSeconds();
            logOutBtn.click();
            TestUtil.waitForFiveSeconds();
        } else if(approver.equalsIgnoreCase("ne01")) {
            connectionsLeftNav.click();
            TestUtil.waitForFiveSeconds();
            topListConnectionEdit.click();
            TestUtil.waitForFiveSeconds();
            new Actions(driver).moveToElement(newMeterSerialNumber).perform();
            newMeterSerialNumber.sendKeys("1234322");
            newMeterSealNumber.sendKeys("12343");
            newMeterInstallationNumber.sendKeys("453554");
            mainPipeNumber.sendKeys("3434");
            meterDiameterInMMDropdown.click();
            TestUtil.waitForOneSeconds();
            meterDiameterInMMDropdownOption.click();
            TestUtil.waitForTwoSeconds();
            meterBrandNameDropdown.click();
            TestUtil.waitForOneSeconds();
            meterBrandNameDropdownOption.click();
            initialMeterReading.sendKeys("343");
            noOfDials.sendKeys("3");
            meterOwnerDropdown.click();
            TestUtil.waitForOneSeconds();
            meterOwnerDropdownOption.click();
            privateOptionInRadio.click();
            new Actions(driver).moveToElement(relationshipWithCustomerDropdown).perform();
            relationshipWithCustomerDropdown.click();
            TestUtil.waitForOneSeconds();
            relationshipWithCustomerDropdownOption.click();
            contractorName.sendKeys("aadi");
            TestUtil.waitForTwoSeconds();
            hscForm.sendKeys(System.getProperty("user.dir")+"/SampleFile.png");
            TestUtil.waitForFiveSeconds();
            TestUtil.waitForTwoSeconds();
            meterImage.sendKeys(System.getProperty("user.dir")+"/SampleFile.png");
            TestUtil.waitForFiveSeconds();
            TestUtil.waitForTwoSeconds();
            meterAssemblyPhoto.sendKeys(System.getProperty("user.dir")+"/SampleFile.png");
            TestUtil.waitForFiveSeconds();;
            TestUtil.waitForTwoSeconds();
            submitButton.click();
            TestUtil.waitForFiveSeconds();
            confirmationYesButton.click();
            TestUtil.waitForFiveSeconds();
            TestUtil.waitForTwoSeconds();
            logOutBtn.click();
            TestUtil.waitForFiveSeconds();
        }


    }
}