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

WebUI.navigateToUrl('https://sewriveting.ca/store/')

WebUI.click(findTestObject('Object Repository/Breadcrumb_Category-Home/Page_SewRiveting - Custom Apparel/a_Home'))

WebUI.mouseOver(findTestObject('Object Repository/Breadcrumb_Category-Home/Page_SewRiveting - Custom Apparel/a_Home'))

WebUI.click(findTestObject('Object Repository/Breadcrumb_Category-Home/Page_SewRiveting - Custom Apparel/a_Specials'))

WebUI.click(findTestObject('Object Repository/Breadcrumb_Category-Home/Page_Special Offers/a_Special Offers'))

WebUI.click(findTestObject('Object Repository/Breadcrumb_Category-Home/Page_Special Offers/a_Home'))

WebUI.mouseOver(findTestObject('Object Repository/Breadcrumb_Category-Home/Page_SewRiveting - Custom Apparel/a_Home'))

WebUI.click(findTestObject('Object Repository/Breadcrumb_Category-Home/Page_SewRiveting - Custom Apparel/a_Account'))

WebUI.click(findTestObject('Object Repository/Breadcrumb_Category-Home/Page_Account Login/a_Login'))

WebUI.click(findTestObject('Object Repository/Breadcrumb_Category-Home/Page_Account Login/a_Register Account'))

WebUI.click(findTestObject('Object Repository/Breadcrumb_Category-Home/Page_Account Login/a_Home'))

WebUI.mouseOver(findTestObject('Object Repository/Breadcrumb_Category-Home/Page_SewRiveting - Custom Apparel/a_Home'))

WebUI.mouseOver(findTestObject('Object Repository/Breadcrumb_Category-Home/Page_SewRiveting - Custom Apparel/a_Account'))

WebUI.click(findTestObject('Object Repository/Breadcrumb_Category-Home/Page_SewRiveting - Custom Apparel/a_Login'))

WebUI.click(findTestObject('Object Repository/Breadcrumb_Category-Home/Page_Account Login/a_Register Account'))

WebUI.click(findTestObject('Object Repository/Breadcrumb_Category-Home/Page_Account Login/a_Home'))

WebUI.mouseOver(findTestObject('Object Repository/Breadcrumb_Category-Home/Page_SewRiveting - Custom Apparel/a_Home'))

WebUI.mouseOver(findTestObject('Object Repository/Breadcrumb_Category-Home/Page_SewRiveting - Custom Apparel/a_Account'))

WebUI.click(findTestObject('Object Repository/Breadcrumb_Category-Home/Page_SewRiveting - Custom Apparel/a_Check Your Order'))

WebUI.click(findTestObject('Object Repository/Breadcrumb_Category-Home/Page_Order Details/a_Order Details'))

WebUI.click(findTestObject('Object Repository/Breadcrumb_Category-Home/Page_Order Details/a_Account'))

WebUI.click(findTestObject('Object Repository/Breadcrumb_Category-Home/Page_Account Login/a_Login'))

WebUI.click(findTestObject('Object Repository/Breadcrumb_Category-Home/Page_Account Login/a_Register Account'))

WebUI.click(findTestObject('Object Repository/Breadcrumb_Category-Home/Page_Account Login/a_Home'))

WebUI.mouseOver(findTestObject('Object Repository/Breadcrumb_Category-Home/Page_SewRiveting - Custom Apparel/a_Home'))

WebUI.mouseOver(findTestObject('Object Repository/Breadcrumb_Category-Home/Page_SewRiveting - Custom Apparel/a_Account'))

WebUI.click(findTestObject('Object Repository/Breadcrumb_Category-Home/Page_SewRiveting - Custom Apparel/a_Check Your Order'))

WebUI.click(findTestObject('Object Repository/Breadcrumb_Category-Home/Page_Order Details/a_Home'))

WebUI.mouseOver(findTestObject('Object Repository/Breadcrumb_Category-Home/Page_SewRiveting - Custom Apparel/a_Home'))

WebUI.click(findTestObject('Object Repository/Breadcrumb_Category-Home/Page_SewRiveting - Custom Apparel/a_Cart'))

WebUI.click(findTestObject('Object Repository/Breadcrumb_Category-Home/Page_Shopping Cart/a_Basket'))

WebUI.click(findTestObject('Object Repository/Breadcrumb_Category-Home/Page_Shopping Cart/a_Home'))

WebUI.mouseOver(findTestObject('Object Repository/Breadcrumb_Category-Home/Page_SewRiveting - Custom Apparel/a_Home'))

WebUI.click(findTestObject('Object Repository/Breadcrumb_Category-Home/Page_SewRiveting - Custom Apparel/a_Checkout'))

WebUI.click(findTestObject('Object Repository/Breadcrumb_Category-Home/Page_Shopping Cart/a_Basket'))

WebUI.click(findTestObject('Object Repository/Breadcrumb_Category-Home/Page_Shopping Cart/a_Home'))

WebUI.closeBrowser()

