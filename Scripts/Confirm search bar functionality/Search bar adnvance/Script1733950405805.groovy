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

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_SewRiveting - Custom Apparel/i_Checkout_fa fa-search'))

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/input_Search Criteria_keyword'))

WebUI.setText(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/input_Search Criteria_keyword'), 'PRO-V')

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/button_Search'))

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/i_Sort By_fa fa-th-list'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/select_All CategoriesApparel  accessoriesSk_377d09'), 
    '0,68', true)

WebUI.setText(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/input_Search Criteria_keyword'), 'PRO-V')

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/button_Search'))

WebUI.setText(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/input_Search Criteria_keyword'), 'Fruit of the Loom T-Shirts 5 Pack - Super Premium')

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/button_Search'))

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_SewRiveting - Custom Apparel/i_Checkout_fa fa-search'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/select_All CategoriesApparel  accessoriesSk_377d09'), 
    '0,43', true)

WebUI.setText(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/input_Search Criteria_keyword'), 'PRO-V')

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/button_Search'))

WebUI.setText(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/input_Search Criteria_keyword'), 'Absolute Anti-Age Spot Replenishing Unifying TreatmentSPF 15')

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/button_Search'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/select_All CategoriesApparel  accessoriesSk_377d09'), 
    '0,49', true)

WebUI.setText(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/input_Search Criteria_keyword'), 'PRO-V')

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/button_Search'))

WebUI.setText(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/input_Search Criteria_keyword'), 'Acqua Di Gio Pour Homme')

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/button_Search'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/select_All CategoriesApparel  accessoriesSk_377d09'), 
    '0,52', true)

WebUI.setText(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/input_Search Criteria_keyword'), 'PRO-V')

WebUI.click(findTestObject('Object Repository/Searchbar fuctionality/Page_Search/button_Search'))

WebUI.closeBrowser()

