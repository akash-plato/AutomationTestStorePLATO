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

WebUI.click(findTestObject('Menu_category-Skincare/Page_Eyes/a_Skincare'))

WebUI.scrollToElement(findTestObject('Menu_category-Skincare/Page_Skincare/div_Per Page10203040501 - 5 of 5             1'), 
    0)


WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_1020304050'),
	'10',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_1020304050'),
	'20',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_1020304050'),
	'30',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_1020304050'),
	'40',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_1020304050'),
	'50',  false)

WebUI.click(findTestObject('Object Repository/Order by category home/Page_Special Offers/button_Sort By_list'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_Date New  OldName A - ZName Z - APri_caf541'),
	'pd.name-ASC',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_Date New  OldName A - ZName Z - APri_caf541'),
	'pd.name-DESC',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_Date New  OldName A - ZName Z - APri_caf541'),
	'p.price-ASC',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_Date New  OldName A - ZName Z - APri_caf541'),
	'p.price-DESC',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_Date New  OldName A - ZName Z - APri_caf541'),
	'rating-DESC',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_Date New  OldName A - ZName Z - APri_caf541'),
	'rating-ASC',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_Date New  OldName A - ZName Z - APri_caf541'),
	'date_modified-ASC',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_Date New  OldName A - ZName Z - APri_caf541'),
	'date_modified-DESC',  false)

WebUI.mouseOver(findTestObject('Menu_category-Skincare/Page_Eyes/a_Skincare'))

WebUI.click(findTestObject('Menu_category-Skincare/Page_Skincare/a_Eyes_1'))

WebUI.scrollToElement(findTestObject('Menu_category-Skincare/Page_Eyes/div_Per Page10203040501 - 3 of 3             1'), 
    0)


WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_1020304050'),
	'10',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_1020304050'),
	'20',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_1020304050'),
	'30',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_1020304050'),
	'40',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_1020304050'),
	'50',  false)

WebUI.click(findTestObject('Object Repository/Order by category home/Page_Special Offers/button_Sort By_list'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_Date New  OldName A - ZName Z - APri_caf541'),
	'pd.name-ASC',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_Date New  OldName A - ZName Z - APri_caf541'),
	'pd.name-DESC',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_Date New  OldName A - ZName Z - APri_caf541'),
	'p.price-ASC',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_Date New  OldName A - ZName Z - APri_caf541'),
	'p.price-DESC',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_Date New  OldName A - ZName Z - APri_caf541'),
	'rating-DESC',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_Date New  OldName A - ZName Z - APri_caf541'),
	'rating-ASC',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_Date New  OldName A - ZName Z - APri_caf541'),
	'date_modified-ASC',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_Date New  OldName A - ZName Z - APri_caf541'),
	'date_modified-DESC',  false)

WebUI.mouseOver(findTestObject('Menu_category-Skincare/Page_Skincare/a_Skincare'))

WebUI.click(findTestObject('Menu_category-Skincare/Page_Skincare/a_Face_1'))

WebUI.scrollToElement(findTestObject('Menu_category-Skincare/Page_Face/div_Per Page10203040501 - 5 of 5             1'), 
    0)



WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_1020304050'),
	'10',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_1020304050'),
	'20',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_1020304050'),
	'30',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_1020304050'),
	'40',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_1020304050'),
	'50',  false)

WebUI.click(findTestObject('Object Repository/Order by category home/Page_Special Offers/button_Sort By_list'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_Date New  OldName A - ZName Z - APri_caf541'),
	'pd.name-ASC',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_Date New  OldName A - ZName Z - APri_caf541'),
	'pd.name-DESC',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_Date New  OldName A - ZName Z - APri_caf541'),
	'p.price-ASC',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_Date New  OldName A - ZName Z - APri_caf541'),
	'p.price-DESC',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_Date New  OldName A - ZName Z - APri_caf541'),
	'rating-DESC',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_Date New  OldName A - ZName Z - APri_caf541'),
	'rating-ASC',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_Date New  OldName A - ZName Z - APri_caf541'),
	'date_modified-ASC',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_Date New  OldName A - ZName Z - APri_caf541'),
	'date_modified-DESC',  false)



WebUI.mouseOver(findTestObject('Menu_category-Skincare/Page_Skincare/a_Skincare'))

WebUI.click(findTestObject('Menu_category-Skincare/Page_Skincare/a_Gift Ideas  Sets_1'))

WebUI.scrollToElement(findTestObject('Menu_category-Skincare/Page_Gift Ideas  Sets/div_Per Page10203040501 - 4 of 4             1'), 
    0)


WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_1020304050'),
	'10',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_1020304050'),
	'20',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_1020304050'),
	'30',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_1020304050'),
	'40',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_1020304050'),
	'50',  false)

WebUI.click(findTestObject('Object Repository/Order by category home/Page_Special Offers/button_Sort By_list'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_Date New  OldName A - ZName Z - APri_caf541'),
	'pd.name-ASC',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_Date New  OldName A - ZName Z - APri_caf541'),
	'pd.name-DESC',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_Date New  OldName A - ZName Z - APri_caf541'),
	'p.price-ASC',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_Date New  OldName A - ZName Z - APri_caf541'),
	'p.price-DESC',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_Date New  OldName A - ZName Z - APri_caf541'),
	'rating-DESC',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_Date New  OldName A - ZName Z - APri_caf541'),
	'rating-ASC',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_Date New  OldName A - ZName Z - APri_caf541'),
	'date_modified-ASC',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_Date New  OldName A - ZName Z - APri_caf541'),
	'date_modified-DESC',  false)



WebUI.mouseOver(findTestObject('Menu_category-Skincare/Page_Skincare/a_Skincare'))

WebUI.click(findTestObject('Menu_category-Skincare/Page_Skincare/a_Hands  Nails_1'))

WebUI.scrollToElement(findTestObject('Menu_category-Skincare/Page_Hands  Nails/div_Per Page10203040501 - 1 of 1             1'), 
    0)


WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_1020304050'),
	'10',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_1020304050'),
	'20',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_1020304050'),
	'30',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_1020304050'),
	'40',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_1020304050'),
	'50',  false)

WebUI.click(findTestObject('Object Repository/Order by category home/Page_Special Offers/button_Sort By_list'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_Date New  OldName A - ZName Z - APri_caf541'),
	'pd.name-ASC',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_Date New  OldName A - ZName Z - APri_caf541'),
	'pd.name-DESC',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_Date New  OldName A - ZName Z - APri_caf541'),
	'p.price-ASC',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_Date New  OldName A - ZName Z - APri_caf541'),
	'p.price-DESC',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_Date New  OldName A - ZName Z - APri_caf541'),
	'rating-DESC',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_Date New  OldName A - ZName Z - APri_caf541'),
	'rating-ASC',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_Date New  OldName A - ZName Z - APri_caf541'),
	'date_modified-ASC',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_Date New  OldName A - ZName Z - APri_caf541'),
	'date_modified-DESC',  false)



WebUI.mouseOver(findTestObject('Menu_category-Skincare/Page_Skincare/a_Skincare'))

WebUI.click(findTestObject('Object Repository/Menu_Category-skincare/Page_Skincare/a_Sun_1'))

WebUI.scrollToElement(findTestObject('Menu_category-Skincare/Page_Sun/div_Per Page10203040501 - 1 of 1             1'), 
    0)


WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_1020304050'),
	'10',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_1020304050'),
	'20',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_1020304050'),
	'30',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_1020304050'),
	'40',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_1020304050'),
	'50',  false)

WebUI.click(findTestObject('Object Repository/Order by category home/Page_Special Offers/button_Sort By_list'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_Date New  OldName A - ZName Z - APri_caf541'),
	'pd.name-ASC',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_Date New  OldName A - ZName Z - APri_caf541'),
	'pd.name-DESC',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_Date New  OldName A - ZName Z - APri_caf541'),
	'p.price-ASC',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_Date New  OldName A - ZName Z - APri_caf541'),
	'p.price-DESC',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_Date New  OldName A - ZName Z - APri_caf541'),
	'rating-DESC',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_Date New  OldName A - ZName Z - APri_caf541'),
	'rating-ASC',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_Date New  OldName A - ZName Z - APri_caf541'),
	'date_modified-ASC',  false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by category home/Page_Special Offers/select_Date New  OldName A - ZName Z - APri_caf541'),
	'date_modified-DESC',  false)


WebUI.closeBrowser()

