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

WebUI.click(findTestObject('Page Header/btn_Shop'))

WebUI.click(findTestObject('Shop Page/Shop Category/btn_New Products'))

WebUI.click(findTestObject('Shop Page/Item/New Prorducts/dsc_Album'))

WebUI.click(findTestObject('Item Page/btn_Add to cart'))

WebUI.click(findTestObject('Page Header/icon_Cart'))

WebUI.click(findTestObject('Cart Page/btn_Proceed to checkout'))

WebUI.setText(findTestObject('Checkout Page/Shipping Information/txt_First Name'), 'Jane')

WebUI.setText(findTestObject('Checkout Page/Shipping Information/txt_Last Name'), 'Doe')

WebUI.setText(findTestObject('Checkout Page/Shipping Information/txt_Company'), 'Lanting Emas Corp.')

WebUI.setText(findTestObject('Checkout Page/Shipping Information/txt_Address'), 'Lumajang')

WebUI.setText(findTestObject('Checkout Page/Shipping Information/txt_Address 2'), 'Jl. Hidup')

WebUI.setText(findTestObject('Checkout Page/Shipping Information/txt_City'), 'Lumajang')

WebUI.setText(findTestObject('Checkout Page/Shipping Information/txt_Postcode'), '134')

WebUI.setText(findTestObject('Checkout Page/Shipping Information/txt_Phone'), '12345')

WebUI.setText(findTestObject('Checkout Page/Shipping Information/txt_Comments'), 'Pedes ya')

WebUI.click(findTestObject('Checkout Page/Payment Method/btn_Place order'))

WebUI.verifyElementPresent(findTestObject('Checkout Page/Shipping Information/prompt_Email is a required field'), 0)

WebUI.closeBrowser()

