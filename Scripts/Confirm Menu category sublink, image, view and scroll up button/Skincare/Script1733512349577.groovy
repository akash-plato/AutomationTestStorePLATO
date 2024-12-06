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

WebUI.click(findTestObject('Object Repository/Menu_Category-skincare/Page_SewRiveting - Custom Apparel/a_Skincare'))

WebUI.click(findTestObject('Object Repository/Menu_Category-skincare/Page_Skincare/button_Sort By_grid'))

WebUI.click(findTestObject('Object Repository/Menu_Category-skincare/Page_Skincare/button_Sort By_list'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Menu_Category-skincare/Page_Skincare/img'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Menu_Category-skincare/Page_Skincare/a_Write Review_productcart'))

WebUI.scrollToElement(findTestObject('Object Repository/Menu_Category-skincare/Page_Skincare/div_Per Page10203040501 - 5 of 5             1'), 
    0)

WebUI.click(findTestObject('Object Repository/Menu_Category-skincare/Page_Skincare/a_Back to top'))

WebUI.click(findTestObject('Object Repository/Menu_Category-skincare/Page_Skincare/img_1'))

WebUI.click(findTestObject('Object Repository/Menu_Category-skincare/Page_Eyes/a_Skincare'))

WebUI.click(findTestObject('Object Repository/Menu_Category-skincare/Page_Skincare/a_Eyes'))

WebUI.mouseOver(findTestObject('Object Repository/Menu_Category-skincare/Page_Eyes/a_Skincare'))

WebUI.click(findTestObject('Object Repository/Menu_Category-skincare/Page_Eyes/a_Eyes'))

WebUI.click(findTestObject('Object Repository/Menu_Category-skincare/Page_Eyes/button_Sort By_grid'))

WebUI.click(findTestObject('Object Repository/Menu_Category-skincare/Page_Eyes/button_Sort By_list'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Menu_Category-skincare/Page_Eyes/img'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Menu_Category-skincare/Page_Eyes/a_Write Review_productcart'))

WebUI.scrollToElement(findTestObject('Object Repository/Menu_Category-skincare/Page_Eyes/div_Per Page10203040501 - 3 of 3             1'), 
    0)

WebUI.click(findTestObject('Object Repository/Menu_Category-skincare/Page_Eyes/a_Back to top'))

WebUI.click(findTestObject('Object Repository/Menu_Category-skincare/Page_Eyes/a_Skincare'))

WebUI.click(findTestObject('Object Repository/Menu_Category-skincare/Page_Skincare/img_1_2'))

WebUI.click(findTestObject('Object Repository/Menu_Category-skincare/Page_Face/a_Skincare'))

WebUI.click(findTestObject('Object Repository/Menu_Category-skincare/Page_Skincare/a_Face'))

WebUI.mouseOver(findTestObject('Object Repository/Menu_Category-skincare/Page_Face/a_Skincare'))

WebUI.click(findTestObject('Object Repository/Menu_Category-skincare/Page_Face/a_Face'))

WebUI.click(findTestObject('Object Repository/Menu_Category-skincare/Page_Face/button_Sort By_grid'))

WebUI.click(findTestObject('Object Repository/Menu_Category-skincare/Page_Face/button_Sort By_list'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Menu_Category-skincare/Page_Face/img'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Menu_Category-skincare/Page_Face/a_Write Review_productcart'))

WebUI.scrollToElement(findTestObject('Object Repository/Menu_Category-skincare/Page_Face/div_Per Page10203040501 - 5 of 5             1'), 
    0)

WebUI.click(findTestObject('Object Repository/Menu_Category-skincare/Page_Face/a_Back to top'))

WebUI.click(findTestObject('Object Repository/Menu_Category-skincare/Page_Face/a_Skincare'))

WebUI.click(findTestObject('Object Repository/Menu_Category-skincare/Page_Skincare/img_1_2_3'))

WebUI.click(findTestObject('Object Repository/Menu_Category-skincare/Page_Gift Ideas  Sets/a_Skincare'))

WebUI.click(findTestObject('Object Repository/Menu_Category-skincare/Page_Skincare/a_Gift Ideas  Sets'))

WebUI.mouseOver(findTestObject('Object Repository/Menu_Category-skincare/Page_Gift Ideas  Sets/a_Skincare'))

WebUI.click(findTestObject('Object Repository/Menu_Category-skincare/Page_Gift Ideas  Sets/a_Gift Ideas  Sets'))

WebUI.click(findTestObject('Object Repository/Menu_Category-skincare/Page_Gift Ideas  Sets/button_Sort By_grid'))

WebUI.click(findTestObject('Object Repository/Menu_Category-skincare/Page_Gift Ideas  Sets/button_Sort By_list'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Menu_Category-skincare/Page_Gift Ideas  Sets/img'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Menu_Category-skincare/Page_Gift Ideas  Sets/a_Write Review_productcart'))

WebUI.scrollToElement(findTestObject('Object Repository/Menu_Category-skincare/Page_Gift Ideas  Sets/div_Per Page10203040501 - 4 of 4             1'), 
    0)

WebUI.click(findTestObject('Object Repository/Menu_Category-skincare/Page_Gift Ideas  Sets/a_Back to top'))

WebUI.click(findTestObject('Object Repository/Menu_Category-skincare/Page_Gift Ideas  Sets/a_Skincare'))

WebUI.click(findTestObject('Object Repository/Menu_Category-skincare/Page_Skincare/img_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Menu_Category-skincare/Page_Hands  Nails/a_Skincare'))

WebUI.click(findTestObject('Object Repository/Menu_Category-skincare/Page_Skincare/a_Hands  Nails'))

WebUI.click(findTestObject('Object Repository/Menu_Category-skincare/Page_Hands  Nails/a_Skincare'))

WebUI.mouseOver(findTestObject('Object Repository/Menu_Category-skincare/Page_Gift Ideas  Sets/a_Skincare'))

WebUI.click(findTestObject('Object Repository/Menu_Category-skincare/Page_Skincare/a_Hands  Nails_1'))

WebUI.click(findTestObject('Object Repository/Menu_Category-skincare/Page_Hands  Nails/button_Sort By_grid'))

WebUI.click(findTestObject('Object Repository/Menu_Category-skincare/Page_Hands  Nails/button_Sort By_list'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Menu_Category-skincare/Page_Hands  Nails/img'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Menu_Category-skincare/Page_Hands  Nails/a_Write Review_productcart'))

WebUI.scrollToElement(findTestObject('Object Repository/Menu_Category-skincare/Page_Hands  Nails/div_Per Page10203040501 - 1 of 1             1'), 
    0)

WebUI.click(findTestObject('Object Repository/Menu_Category-skincare/Page_Hands  Nails/a_Back to top'))

WebUI.click(findTestObject('Object Repository/Menu_Category-skincare/Page_Hands  Nails/a_Skincare'))

WebUI.click(findTestObject('Object Repository/Menu_Category-skincare/Page_Skincare/img_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/Menu_Category-skincare/Page_Sun/a_Skincare'))

WebUI.click(findTestObject('Object Repository/Menu_Category-skincare/Page_Skincare/a_Sun'))

WebUI.click(findTestObject('Object Repository/Menu_Category-skincare/Page_Sun/a_Skincare'))

WebUI.mouseOver(findTestObject('Object Repository/Menu_Category-skincare/Page_Skincare/a_Skincare'))

WebUI.click(findTestObject('Object Repository/Menu_Category-skincare/Page_Skincare/a_Sun_1'))

WebUI.click(findTestObject('Object Repository/Menu_Category-skincare/Page_Sun/button_Sort By_grid'))

WebUI.click(findTestObject('Object Repository/Menu_Category-skincare/Page_Sun/button_Sort By_list'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Menu_Category-skincare/Page_Sun/img'))

WebUI.scrollToElement(findTestObject('Object Repository/Menu_Category-skincare/Page_Sun/div_Per Page10203040501 - 1 of 1             1'), 
    0)

WebUI.click(findTestObject('Object Repository/Menu_Category-skincare/Page_Sun/a_Back to top'))

WebUI.closeBrowser()

