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

WebUI.callTestCase(findTestCase('Cart Functionality/ATS_001_002'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://sewriveting.ca/store/index.php?rt=checkout/cart')

WebUI.setText(findTestObject('Object Repository/Shopping Cart/input_21.62_quantity50'), '2')

WebUI.setText(findTestObject('Object Repository/Shopping Cart/input_30.78_quantity68'), '3')

WebUI.setText(findTestObject('Object Repository/Shopping Cart/input_13.93_quantity51'), '0')

WebUI.click(findTestObject('Object Repository/Shopping Cart/SkinSheen Remove from Cart Button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Shopping Cart/Absolute Remove from cart Button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Shopping Cart/BeneFit Remove from Cart Button'), FailureHandling.CONTINUE_ON_FAILURE)

