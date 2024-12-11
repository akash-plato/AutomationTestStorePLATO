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

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_SewRiveting - Custom Apparel/input_Checkout_filter_keyword'))

WebUI.setText(findTestObject('Object Repository/Searchbar fuctionality/Page_SewRiveting - Custom Apparel/input_Checkout_filter_keyword'), 
    'skinsheen ')

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_SewRiveting - Custom Apparel/i_Checkout_fa fa-search'))

WebUI.setText(findTestObject('Object Repository/Searchbar fuctionality/Page_Skinsheen Bronzer Stick/input_Checkout_filter_keyword'), 
    'skin')

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_SewRiveting - Custom Apparel/i_Checkout_fa fa-search'))

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/button_Sort By_list'))

WebUI.setText(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/input_Checkout_filter_keyword'), 'SKINSHEEN')

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_Skinsheen Bronzer Stick/input_Checkout_filter_keyword'))

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_Skinsheen Bronzer Stick/i_Checkout_fa fa-search'))

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_SewRiveting - Custom Apparel/i_Checkout_fa fa-search'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/select_All CategoriesApparel  accessoriesSk_377d09'), 
    '0,68', true)

WebUI.setText(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/input_Search Criteria_keyword'), 'FRUIT OF THE LOOM t-shirt')

WebUI.sendKeys(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/input_Search Criteria_keyword'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/button_Search'))

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/div_All CategoriesApparel  accessoriesT-shi_5f0cd0'))

WebUI.setText(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/input_Search Criteria_keyword'), 'FRUIT OF THE LOOM t-shirt 5 pack')

WebUI.sendKeys(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/input_Search Criteria_keyword'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/label_Search in product descriptions'))

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/button_Search'))

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/a_Jersey Cotton Striped Polo Shirt'))

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_Jersey Cotton Striped Polo Shirt/a_Search'))

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/button_Sort By_list'))

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/input_Search in product model_model'))

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/button_Search'))

WebUI.doubleClick(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/input_Search Criteria_keyword'))

WebUI.setText(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/input_Search Criteria_keyword'), 'JERSEY COTTON ')

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/button_Search'))

WebUI.closeBrowser()

