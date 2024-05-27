package day1.page;

import day1.base.TestBase;
import day1.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

    //Define Page Factory or Object Repo


    @FindBy(xpath = "//div[@class='additional-menu']//div[3]//div")
    WebElement logOutBtn;

    @FindBy(xpath = "//div[@id='__next']/div[2]/div/div/div[2]/button[2]/span")
    WebElement featuresLink;

    @FindBy(xpath = "//a[contains(@href, '/sign-up')]")
    WebElement signupBtn;

    @FindBy(xpath="//input[@name='username']")
    WebElement username;

    @FindBy(xpath="//input[@name='password']")
    WebElement password;

    @FindBy(xpath="//div[@class='display-flex justify-space-between']//button[@type='button'][1]")
    WebElement LoginBtn;

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


    @FindBy(xpath="//button/span[text()='OK']")
    WebElement newConnectionInstructionOKButton;

    @FindBy(xpath="//input[@value='residential']")
    WebElement residentialRadioButton;

    @FindBy(xpath="//input[@value='R1']")
    WebElement r1RadioButton;

    @FindBy(xpath="//input[@value='individual']")
    WebElement individualRadioButton;

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

    @FindBy(xpath="//input[@name='plotNumber']")
    WebElement plotNumber;

    @FindBy(xpath="//div[text()='Pincode']/following-sibling::div//input")
    WebElement pincodeDropdown;

    @FindBy(xpath="//div[@class='rc-virtual-list']//div[text()='440021']")
    WebElement pincodeOption;

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

    @FindBy(xpath="(//div[@class=\"action-icon\"]//span)[1]")
    WebElement topListConnectionEdit;

    @FindBy(xpath="(//div[contains(.,'MR01')]/following-sibling::div[@class='icon-container'])[1]")
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

    @FindBy(xpath="//div[text()='MRU ID (MRUID)']/following-sibling::div//input")
    WebElement mruId;

    @FindBy(xpath="//div[@class='rc-virtual-list']//div[text()='M0150AA']")
    WebElement optionInMruId;

    @FindBy(xpath="//div[text()='Material of main pipe']/following-sibling::div//input")
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
        TestUtil.waitForFiveSeconds();
        TestUtil.waitUntilClickable(driver,applyForNewConnectionButton);
        applyForNewConnectionButton.click();
        TestUtil.waitForTwoSeconds();
        newConnectionInstructionOKButton.click();
        residentialRadioButton.click();
        r1RadioButton.click();
        individualRadioButton.click();
        nextButton.click();
        TestUtil.waitForFiveSeconds();
        titleDropdown.click();
        TestUtil.waitForOneSeconds();
        mrOptionInTitleDropdown.click();
        firstName.sendKeys("Aditya");
        lastName.sendKeys("Raghuwanshi");
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
    }
    public boolean featureLink() {
        return featuresLink.isDisplayed();
    }

    public void loginLogout(String un, String pwd) throws InterruptedException {
        username.sendKeys(un);
        Thread.sleep(5000);
        password.sendKeys(pwd);
        LoginBtn.click();
        Thread.sleep(5000);
        logOutBtn.click();
        Thread.sleep(3000);
        //  return new StorePage();
    }


    public void approveConnection(String approver) throws InterruptedException {
        if(approver.equalsIgnoreCase("cso")) {
            connectionsLeftNav.click();
            TestUtil.waitForFiveSeconds();
            topListConnectionEdit.click();
            TestUtil.waitForFiveSeconds();
            nextButton.click();
            new Actions(driver).moveToElement(nextButton).perform();
            nextButton.click();
            TestUtil.waitForFiveSeconds();
            nextButton.click();
            TestUtil.waitForTwoSeconds();
            try {
                new Actions(driver).moveToElement(nextButton).perform();
                nextButton.click();
            } catch(Exception e) {

            }
            previewButton.click();
            new Actions(driver).moveToElement(submitButton).perform();
            submitButton.click();
            TestUtil.waitForTwoSeconds();
            confirmationYesButton.click();
            TestUtil.waitForFiveSeconds();
            logOutBtn.click();
            TestUtil.waitForFiveSeconds();
        } else if(approver.equalsIgnoreCase("tl")) {
            connectionsLeftNav.click();
            TestUtil.waitForFiveSeconds();
            topListConnectionEdit.click();
            TestUtil.waitForFiveSeconds();
            meterReader01assign.click();
            TestUtil.waitForFiveSeconds();
            confirmationYesButton.click();
            TestUtil.waitForFiveSeconds();
            logOutBtn.click();
            TestUtil.waitForFiveSeconds();
        } else if(approver.equalsIgnoreCase("mr")) {
            connectionsLeftNav.click();
            TestUtil.waitForFiveSeconds();
            topListConnectionEdit.click();
            TestUtil.waitForFiveSeconds();
            totalFamilyMembers.sendKeys("4");
            nearbyContractAccountNumber.sendKeys("12345667");
            anyOtherConnectionFound.click();
            alternateWaterSources.click();
            siteImageInput.sendKeys(System.getProperty("user.dir")+"/SampleFile.png");
            TestUtil.waitForFiveSeconds();
            mruId.click();
            TestUtil.waitForOneSeconds();
            optionInMruId.click();
            submitButton.click();
            TestUtil.waitForTwoSeconds();
            confirmationYesButton.click();
            TestUtil.waitForFiveSeconds();
            logOutBtn.click();
            TestUtil.waitForFiveSeconds();
        } else if(approver.equalsIgnoreCase("tl01")) {
            connectionsLeftNav.click();
            TestUtil.waitForFiveSeconds();
            topListConnectionEdit.click();
            TestUtil.waitForFiveSeconds();
            submitButton.click();
            TestUtil.waitForFiveSeconds();
            confirmationYesButton.click();
            TestUtil.waitForFiveSeconds();
            logOutBtn.click();
            TestUtil.waitForFiveSeconds();
        } else if(approver.equalsIgnoreCase("spm")) {
            connectionsLeftNav.click();
            TestUtil.waitForFiveSeconds();
            topListConnectionEdit.click();
            TestUtil.waitForFiveSeconds();
            nextButton.click();
            TestUtil.waitForFiveSeconds();
            nextButton.click();
            TestUtil.waitForFiveSeconds();
            try {
                nextButton.click();
                TestUtil.waitForFiveSeconds();
                nextButton.click();
                TestUtil.waitForFiveSeconds();
            } catch(Exception e) {}

            previewButton.click();
            TestUtil.waitForFiveSeconds();
            new Actions(driver).moveToElement(submitButton).perform();
            submitButton.click();
            TestUtil.waitForFiveSeconds();
            confirmationYesButton.click();
            TestUtil.waitForFiveSeconds();
            logOutBtn.click();
            TestUtil.waitForFiveSeconds();
        } else if(approver.equalsIgnoreCase("ne")) {
            connectionsLeftNav.click();
            TestUtil.waitForFiveSeconds();
            topListConnectionEdit.click();
            TestUtil.waitForFiveSeconds();
            materialOfMainPipeline.click();
            TestUtil.waitForOneSeconds();
            optionMaterialOfMainPipeline.click();
            newHoleOptionNo.click();
            depthOfMdpePipe.sendKeys("3");
            lengthOfMdpePipe.sendKeys("5");
            waterFlowQuantity.sendKeys("20");
            durationOfWaterSupplyInHours.sendKeys("2");
            submitButton.click();
            TestUtil.waitForFiveSeconds();
            confirmationYesButton.click();
            TestUtil.waitForFiveSeconds();
            logOutBtn.click();
            TestUtil.waitForFiveSeconds();
        } else if(approver.equalsIgnoreCase("zm")) {
            connectionsLeftNav.click();
            TestUtil.waitForFiveSeconds();
            topListConnectionEdit.click();
            TestUtil.waitForFiveSeconds();
            new Actions(driver).moveToElement(nextButton).perform();
            nextButton.click();
            TestUtil.waitForTwoSeconds();
            nextButton.click();
            new Actions(driver).moveToElement(nextButton).perform();
            nextButton.click();
            new Actions(driver).moveToElement(previewButton).perform();
            previewButton.click();
            TestUtil.waitForFiveSeconds();
            new Actions(driver).moveToElement(submitButton).perform();
            submitButton.click();
            TestUtil.waitForFiveSeconds();
            confirmationYesButton.click();
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
            TestUtil.waitForTwoSeconds();
            nextButton.click();
            new Actions(driver).moveToElement(nextButton).perform();
            nextButton.click();
            new Actions(driver).moveToElement(nextButton).perform();
            nextButton.click();
            new Actions(driver).moveToElement(previewButton).perform();
            previewButton.click();
            TestUtil.waitForFiveSeconds();
            new Actions(driver).moveToElement(approveButton).perform();
            approveButton.click();
            TestUtil.waitForFiveSeconds();
            confirmationYesButton.click();
            TestUtil.waitForFiveSeconds();
            logOutBtn.click();
            TestUtil.waitForFiveSeconds();
        }
    }
}