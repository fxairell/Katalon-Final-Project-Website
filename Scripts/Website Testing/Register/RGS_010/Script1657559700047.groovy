import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://kotakoki.wijaysali.my.id/')

WebUI.click(findTestObject('Page Header/btn_Register Now'))

WebUI.setText(findTestObject('Register Now Page/txt_Username'), 'janedoe')

WebUI.setText(findTestObject('Register Now Page/txt_Email Address'), 'janedoe@testing.com')

WebUI.setText(findTestObject('Register Now Page/txt_Phone Number'), '12345')

WebUI.setText(findTestObject('Register Now Page/txt_Password'), '1Capital1lower')

WebUI.setText(findTestObject('Register Now Page/txt_Confirm Password'), 'Capitallower')

WebUI.setText(findTestObject('Register Now Page/txt_Address'), 'Lumajang')

WebUI.click(findTestObject('Register Now Page/btn_Register'))

WebUI.verifyElementPresent(findTestObject('Register Now Page/prompt_Your passwords do not match'), 0)

WebUI.closeBrowser()

