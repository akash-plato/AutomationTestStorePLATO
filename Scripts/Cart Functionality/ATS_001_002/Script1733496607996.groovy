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

WebUI.callTestCase(findTestCase('Login/ATS_001_001'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_SewRiveting - Custom Apparel/SkinSheen Bronzer Stick Cart Icon'))

WebUI.click(findTestObject('Page_SewRiveting - Custom Apparel/Absolute Anti-Age Cart Icon'))

WebUI.click(findTestObject('Object Repository/Page_SewRiveting - Custom Apparel/BeneFit Girl Meets Pearl Cart Icon'))

WebUI.mouseOver(findTestObject('Object Repository/Page_SewRiveting - Custom Apparel/Cart and Items Dropdown'))

WebUI.click(findTestObject('Object Repository/Page_SewRiveting - Custom Apparel/View Cart Icon in Cart and Items Dropdown'))

WebUI.navigateToUrl('https://sewriveting.ca/store/index.php?rt=checkout/cart')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Shopping Cart/a_Skinsheen Bronzer Stick'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Shopping Cart/a_Absolute Anti-Age Spot Replenishing Unify_9a6ab4'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Shopping Cart/a_BeneFit Girl Meets Pearl'), 0)

