import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import java.awt.Robot as Robot
import java.awt.Toolkit as Toolkit
import java.awt.datatransfer.StringSelection as StringSelection
import java.awt.event.KeyEvent as KeyEvent

WebUI.openBrowser('')

WebUI.navigateToUrl('https://qa.eteki.com/account/sign_in')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Create_Job_Locators/Page_eTeki/input_email'), 'shine@mailinator.com')

WebUI.setText(findTestObject('Create_Job_Locators/Page_eTeki/input_password'), '12345678')

WebUI.click(findTestObject('Create_Job_Locators/Page_eTeki/button_Sign In'))

WebUI.click(findTestObject('Create_Job_Locators/Page_eTeki/button_Remind Me Later'))

WebUI.click(findTestObject('Create_Job_Locators/Page_eTeki/a_Create Job'))

WebUI.setText(findTestObject('Create_Job_Locators/Page_eTeki/input_companyname'), 'eTeki')

//WebUI.click(findTestObject('Create_Job_Locators/Page_eTeki/button_Choose File'))

uploadFile(findTestObject('Object Repository/Create_Job_Locators/Page_eTeki/button_Choose File'), "C:\\Users\\Public\\Pictures\\Sample Pictures\\Chrysanthemum.jpg")

WebUI.setText(findTestObject('Create_Job_Locators/Page_eTeki/input_job_code'), 'ET456')

WebUI.setText(findTestObject('Create_Job_Locators/Page_eTeki/input_title'), 'Sr. Game Developer')

WebUI.setText(findTestObject('Create_Job_Locators/Page_eTeki/textarea_description'), 'Test')

WebUI.setText(findTestObject('Create_Job_Locators/Page_eTeki/input_input ng-pristine ng-unt'), 'Java')

WebUI.click(findTestObject('Create_Job_Locators/Page_eTeki/li_Java'))

WebUI.setText(findTestObject('Create_Job_Locators/Page_eTeki/input_input ng-pristine ng-unt_1'), 'HTML5')

WebUI.click(findTestObject('Create_Job_Locators/Page_eTeki/li_HTML5'))

WebUI.setText(findTestObject('Create_Job_Locators/Page_eTeki/input_expr'), '3')

WebUI.click(findTestObject('Create_Job_Locators/Page_eTeki/i_fa fa-calendar'))

WebUI.click(findTestObject('Create_Job_Locators/Page_eTeki/span_27'))

WebUI.scrollToElement(findTestObject('Create_Job_Locators/Page_eTeki/select_Please Select CountryAf'), 10)

WebUI.selectOptionByValue(findTestObject('Create_Job_Locators/Page_eTeki/select_Please Select CountryAf'), 'string:India', false)

WebUI.setText(findTestObject('Create_Job_Locators/Page_eTeki/input_number_of_prospects'), '3')

WebUI.click(findTestObject('Create_Job_Locators/Page_eTeki/button_Next'))

WebUI.click(findTestObject('Create_Job_Locators/Page_eTeki/button_OK'))

WebUI.click(findTestObject('Create_Job_Locators/Page_eTeki/a_Skip'))

WebUI.closeBrowser()

def uploadFile(TestObject to, String filePath) {
    
	WebUI.click(to)

    Robot r = new Robot()
	
	StringSelection ss = new StringSelection(filePath);
	
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

    r.keyPress(KeyEvent.VK_CONTROL)

    r.keyPress(KeyEvent.VK_V)

    r.keyRelease(KeyEvent.VK_CONTROL)

    r.keyRelease(KeyEvent.VK_V)

    r.keyPress(KeyEvent.VK_ENTER)

    r.keyRelease(KeyEvent.VK_ENTER)
}

