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

WebUI.click(findTestObject('Object Repository/Fragrance/Fragreance/Page_SewRiveting - Custom Apparel/a_Fragrance'))

WebUI.click(findTestObject('Object Repository/Fragrance/Fragreance/Page_Fragrance/button_Sort By_grid'))

WebUI.click(findTestObject('Object Repository/Fragrance/Fragreance/Page_Fragrance/button_Sort By_list'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Fragrance/Fragreance/Page_Fragrance/img'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Fragrance/Fragreance/Page_Fragrance/a_Write Review_productcart'))

WebUI.scrollToElement(findTestObject('Object Repository/Fragrance/Fragreance/Page_Fragrance/div_Per Page10203040501 - 9 of 9             1'), 
    0)

WebUI.click(findTestObject('Object Repository/Fragrance/Fragreance/Page_Fragrance/a_Back to top'))

WebUI.click(findTestObject('Object Repository/Fragrance/Fragreance/Page_Fragrance/img_1'))

WebUI.click(findTestObject('Object Repository/Fragrance/Fragreance/Page_Men/a_Fragrance'))

WebUI.click(findTestObject('Object Repository/Fragrance/Fragreance/Page_Fragrance/a_Men'))

WebUI.mouseOver(findTestObject('Object Repository/Fragrance/Fragreance/Page_Men/a_Fragrance'))

WebUI.click(findTestObject('Object Repository/Fragrance/Fragreance/Page_Men/a_Men'))

WebUI.click(findTestObject('Object Repository/Fragrance/Fragreance/Page_Men/button_Sort By_grid'))

WebUI.click(findTestObject('Object Repository/Fragrance/Fragreance/Page_Men/button_Sort By_list'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Fragrance/Fragreance/Page_Men/img'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Fragrance/Fragreance/Page_Men/a_Write Review_productcart'))

WebUI.scrollToElement(findTestObject('Object Repository/Fragrance/Fragreance/Page_Men/div_Per Page10203040501 - 8 of 8             1'), 
    0)

WebUI.click(findTestObject('Object Repository/Fragrance/Fragreance/Page_Men/a_Back to top'))

WebUI.click(findTestObject('Object Repository/Fragrance/Fragreance/Page_Men/a_Fragrance'))

WebUI.click(findTestObject('Object Repository/Fragrance/Fragreance/Page_Fragrance/img_1_2'))

WebUI.click(findTestObject('Object Repository/Fragrance/Fragreance/Page_Women/a_Fragrance'))

WebUI.click(findTestObject('Object Repository/Fragrance/Fragreance/Page_Fragrance/a_Women'))

WebUI.mouseOver(findTestObject('Object Repository/Fragrance/Fragreance/Page_Women/a_Fragrance'))

WebUI.click(findTestObject('Object Repository/Fragrance/Fragreance/Page_Women/a_Women'))

WebUI.click(findTestObject('Object Repository/Fragrance/Fragreance/Page_Women/button_Sort By_grid'))

WebUI.click(findTestObject('Object Repository/Fragrance/Fragreance/Page_Women/button_Sort By_list'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Fragrance/Fragreance/Page_Women/img'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Fragrance/Fragreance/Page_Women/a_Write Review_productcart'))

WebUI.scrollToElement(findTestObject('Object Repository/Fragrance/Fragreance/Page_Women/div_Per Page10203040501 - 12 of 12             1'), 
    0)

WebUI.click(findTestObject('Object Repository/Fragrance/Fragreance/Page_Women/a_Back to top'))

WebUI.closeBrowser()

