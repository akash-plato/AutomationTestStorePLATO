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

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Shopping Cart/span_Shopping Cart'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Shopping Cart/th_Estimate Shipping  Taxes'), 'Estimate Shipping & Taxes')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Shopping Cart/label_Country and State'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Shopping Cart/label_ZIPPost Code'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Shopping Cart/label_Shipments'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Shopping Cart/td_Sub-Total'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Shopping Cart/td_HST (13)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Shopping Cart/td_Total'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Shopping Cart/select_Local Delivery - 3.66Pickup From Sto_b698d8'), 
    'Local Delivery - $3.66\n\t\t\tPickup From Store - Free\n\t\t\tFlat Shipping Rate - $12.42')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Shopping Cart/td_Local Delivery'), 0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Shopping Cart/select_Local Delivery - 3.66Pickup From Sto_b698d8'), 
    'default_store_pickup.default_store_pickup', true)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Shopping Cart/td_Pickup From Store'), 0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Shopping Cart/select_Local Delivery - 3.66Pickup From Sto_b698d8'), 
    'default_flat_rate_shipping.default_flat_rate_shipping', true)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Shopping Cart/td_Flat Shipping Rate'), 0)

