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

WebUI.click(findTestObject('Object Repository/Page_Shopping Cart/span_Checkout'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Fast Checkout/div_Pickup_checkbox_place'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Fast Checkout/label_Pickup From Store'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Fast Checkout/div_Local Delivery_checkbox_place'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Fast Checkout/label_Local Delivery'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Fast Checkout/div_Flat Rate_checkbox_place'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Fast Checkout/label_Flat Shipping Rate'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Fast Checkout/input_12.42_cc_email'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Fast Checkout/input_12.42_telephone'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Fast Checkout/h4_Order Summary                        224_e7bd2b'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Fast Checkout/h4_Sub-Total'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Fast Checkout/h4_HST (13)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Fast Checkout/b_Total'), 0)

WebUI.click(findTestObject('Object Repository/Page_Fast Checkout/div_Pickup_checkbox_place'))

WebUI.click(findTestObject('Object Repository/Page_Fast Checkout/div_Local Delivery_checkbox_place_1'))

WebUI.click(findTestObject('Object Repository/Page_Fast Checkout/label_'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Fast Checkout/div_Cash On Delivery'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Fast Checkout/div_Bank Transfer'), 0)

WebUI.click(findTestObject('Page_Fast Checkout/div_Cash On Delivery'))

WebUI.click(findTestObject('Object Repository/Page_Fast Checkout/div_Bank Transfer'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Fast Checkout/b_Return Policy'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Fast Checkout/a_Confirm Order'), 0)

WebUI.click(findTestObject('Object Repository/Page_Fast Checkout/a_Confirm Order'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Fast Checkout/h3_Order is completed'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Fast Checkout/i_Order is completed_fa fa-check fa-fw'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Fast Checkout/a_Order Details'), 0)

WebUI.click(findTestObject('Object Repository/Page_Fast Checkout/a_Order Details'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Order Details/b_Order ID'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Order Details/b_Status'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Order Details/b_E-Mail'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Order Details/b_Telephone'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Order Details/b_Payment Method'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Order Details/b_Shipping Address'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Order Details/b_Payment Address'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Order Details/a_Skinsheen Bronzer Stick'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Order Details/a_BeneFit Girl Meets Pearl'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Order Details/a_Absolute Anti-Age Spot Replenishing Unify_9a6ab4'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Order Details/h4_Order History'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Order Details/th_Date Added'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Order Details/th_Status'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Order Details/th_Customers order comment'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Order Details/a_Continue'), 0)

WebUI.click(findTestObject('Object Repository/Page_Order Details/a_Continue'))

WebUI.click(findTestObject('Object Repository/Page_My Order History/div_Order ID    33'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_My Order History/span_My Order History'), 0)

WebUI.closeBrowser()

