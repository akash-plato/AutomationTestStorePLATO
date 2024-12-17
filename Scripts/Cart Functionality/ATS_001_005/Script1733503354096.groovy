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

WebUI.verifyElementPresent(findTestObject('Object Repository/Shopping Cart/span_Shopping Cart'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Shopping Cart/th_Estimate Shipping  Taxes'), 'Estimate Shipping & Taxes')

WebUI.verifyElementPresent(findTestObject('Object Repository/Shopping Cart/label_Country and State'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shopping Cart/label_Shipments'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shopping Cart/td_Sub-Total'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shopping Cart/td_HST (13)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shopping Cart/td_Total'), 0)

WebUI.click(findTestObject('Shopping Cart/Country Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/Country Drop Down Canada'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down Canada/State or Province Drop Down Alberta'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down Canada/State or Province Drop Down Bew Brunswick'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down Canada/State or Province Drop Down British Columbia'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down Canada/State or Province Drop Down Manitoba'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down Canada/State or Province Drop Down Newfoundland and Labrador'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down Canada/State or Province Drop Down Northwest Territories'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down Canada/State or Province Drop Down Nova Scotia'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down Canada/State or Province Drop Down Nunavut'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down Canada/State or Province Drop Down Ontario'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down Canada/State or Province Drop Down Prince Edward Island'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down Canada/State or Province Drop Down Quebec'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down Canada/State or Province Drop Down Saskatchewan'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down Canada/State or Province Drop Down Yukon Territory'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/Country Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/Country Drop Down United States'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down Alabama'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down Alaska'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down American Samoa'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down Arizona'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down Arkansas'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down Armed Forces Africa'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down Armed Forces Americas'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down Armed Forces Canada'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down Armed Forces Europe'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down Armed Forces Middle East'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down Armed Forces Pacific'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down California'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down Colorado'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down Connecticut'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down Delaware'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down District of Columbia'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down Federated States Of Micronesia'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down Florida'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down Georgia'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down Guam'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down Hawaii'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down Idaho'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down Illinois'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down Indiana'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down Iowa'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down Kansas'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down Kentucky'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down Louisiana'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down Maine'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down Marshall Islands'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down Maryland'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down Massachusetts'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down Michigan'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down Minnesota'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down Mississippi'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down Missouri'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down Montana'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down Nebraska'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down Nevada'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down New Hampshire'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down New Jersey'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down New Mexico'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down New York'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down North Carolina'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down North Dakota'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down Northern Mariana Islands'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down Ohio'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down Oklahoma'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down Oregon'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down Palau'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down Pensylvania'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down Puerto Rico'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down Rhode Island'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down South Carolina'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down South Dakota'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down Tennessee'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down Texas'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down Utah'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down Vermont'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down Virgin Islands'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down Virginia'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down Washington'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down West Virginia'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down Wisconsin'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down USA/State or Province Drop Down Wyoming'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/Country Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/Country Drop Down Zambia'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down Zambia/State or Province Drop Down Central'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down Zambia/State or Province Drop Down Copperbelt'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down Zambia/State or Province Drop Down Eastern'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down Zambia/State or Province Drop Down Laupula'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down Zambia/State or Province Drop Down Lusaka'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down Zambia/State or Province Drop Down North-Western'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down Zambia/State or Province Drop Down Northern'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down Zambia/State or Province Drop Down Southern'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down Zambia/State or Province Drop Down Western'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/Country Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/Country Drop Down Zimbabwe'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down Zimbabwe/State or Province Drop Down Bulawayo'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down Zimbabwe/State or Province Drop Down Harare'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down Zimbabwe/State or Province Drop Down Manicaland'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down Zimbabwe/State or Province Drop Down Mashonaland Central'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down Zimbabwe/State or Province Drop Down Mashonaland East'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down Zimbabwe/State or Province Drop Down Mashonaland West'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down Zimbabwe/State or Province Drop Down Masvingo'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down Zimbabwe/State or Province Drop Down Matebeleland North'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down Zimbabwe/State or Province Drop Down Matebeleland South'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/State or Province Drop Down Zimbabwe/State or Province Drop Down Midlands'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/Shipment Options'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/Shipment Options Pickup From Store'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/Shipment Options'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/Shipment Options Local Delivery'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/Shipment Options'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping Cart/Shipment Options Flat Shipping Rate'), FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Cart Functionality/ATS_001_003'), [:], FailureHandling.STOP_ON_FAILURE)

