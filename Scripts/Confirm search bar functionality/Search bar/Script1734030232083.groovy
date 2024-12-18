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

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_Skinsheen Bronzer Stick/input_Checkout_filter_keyword'))

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_SewRiveting - Custom Apparel/i_Checkout_fa fa-search'))

WebUI.setText(findTestObject('Object Repository/Searchbar fuctionality/Page_SewRiveting - Custom Apparel/input_Checkout_filter_keyword'), 
    'skinsheen')

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_SewRiveting - Custom Apparel/i_Checkout_fa fa-search'))

WebUI.setText(findTestObject('Object Repository/Searchbar fuctionality/Page_SewRiveting - Custom Apparel/input_Checkout_filter_keyword'), 
    'light')

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_SewRiveting - Custom Apparel/i_Checkout_fa fa-search'))

WebUI.setText(findTestObject('Object Repository/Searchbar fuctionality/Page_SewRiveting - Custom Apparel/input_Checkout_filter_keyword'), 
    'L\'EXTRÊME Instant Extensions Lengthening Mascara')

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_SewRiveting - Custom Apparel/i_Checkout_fa fa-search'))

WebUI.setText(findTestObject('Object Repository/Searchbar fuctionality/Page_SewRiveting - Custom Apparel/input_Checkout_filter_keyword'), 
    'plato')

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_SewRiveting - Custom Apparel/i_Checkout_fa fa-search'))

WebUI.setText(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/input_Checkout_filter_keyword'), 'PRadoct ')

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_SewRiveting - Custom Apparel/i_Checkout_fa fa-search'))

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_Skinsheen Bronzer Stick/input_Checkout_filter_keyword'))

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_Skinsheen Bronzer Stick/a_All Categories'))

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/a_Apparel  accessories'))

WebUI.setText(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/input_Checkout_filter_keyword'), 'PRODUCT ')

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_SewRiveting - Custom Apparel/i_Checkout_fa fa-search'))

WebUI.setText(findTestObject('Object Repository/Searchbar fuctionality/Page_SewRiveting - Custom Apparel/input_Checkout_filter_keyword'), 
    'plato')

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_SewRiveting - Custom Apparel/i_Checkout_fa fa-search'))

WebUI.setText(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/input_Checkout_filter_keyword'), 'Fruit of the Loom T-Shirts 5 Pack - Super Premium')

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_SewRiveting - Custom Apparel/i_Checkout_fa fa-search'))

WebUI.setText(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/input_Checkout_filter_keyword'), 'Friut of the Loom T-Shirts 5 Pack - Super Premium')

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_SewRiveting - Custom Apparel/i_Checkout_fa fa-search'))

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_Skinsheen Bronzer Stick/input_Checkout_filter_keyword'))

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_Product with options and stock locations/a_Skincare'))

WebUI.setText(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/input_Checkout_filter_keyword'), 'CR')

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_Product with options and stock locations/i_Checkout_fa fa-search'))

WebUI.setText(findTestObject('Object Repository/Searchbar fuctionality/Page_SewRiveting - Custom Apparel/input_Checkout_filter_keyword'), 
    'plato')

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_Product with options and stock locations/i_Checkout_fa fa-search'))

WebUI.setText(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/input_Checkout_filter_keyword'), 'Absolute Anti-Age Spot Replenishing Unifying TreatmentSPF 15')

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_Product with options and stock locations/i_Checkout_fa fa-search'))

WebUI.setText(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/input_Checkout_filter_keyword'), 'Abselute')

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_Product with options and stock locations/i_Checkout_fa fa-search'))

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_Skinsheen Bronzer Stick/input_Checkout_filter_keyword'))

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/a_Fragrance'))

WebUI.setText(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/input_Checkout_filter_keyword'), 'Acqua Di Gio Pour Homme')

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/i_Checkout_fa fa-search'))

WebUI.setText(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/input_Checkout_filter_keyword'), 'A')

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/i_Checkout_fa fa-search'))

WebUI.setText(findTestObject('Object Repository/Searchbar fuctionality/Page_SewRiveting - Custom Apparel/input_Checkout_filter_keyword'), 
    'Acqua Di Gio Pour Homne')

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/i_Checkout_fa fa-search'))

WebUI.setText(findTestObject('Object Repository/Searchbar fuctionality/Page_SewRiveting - Custom Apparel/input_Checkout_filter_keyword'), 
    'plato')

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/i_Checkout_fa fa-search'))

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_Skinsheen Bronzer Stick/input_Checkout_filter_keyword'))

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/a_Hair Care'))

WebUI.setText(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/input_Checkout_filter_keyword'), 'P')

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/i_Checkout_fa fa-search'))

WebUI.setText(findTestObject('Object Repository/Searchbar fuctionality/Page_SewRiveting - Custom Apparel/input_Checkout_filter_keyword'), 
    'plato')

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_SewRiveting - Custom Apparel/i_Checkout_fa fa-search'))

WebUI.setText(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/input_Checkout_filter_keyword'), 'Pantene Pro-V Conditioner, Classic Care')

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/i_Checkout_fa fa-search'))

WebUI.setText(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/input_Checkout_filter_keyword'), 'Highlighting ')

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/i_Checkout_fa fa-search'))

WebUI.setText(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/input_Checkout_filter_keyword'), 'Highliting ')

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/i_Checkout_fa fa-search'))

WebUI.delay(3)

WebUI.closeBrowser()

