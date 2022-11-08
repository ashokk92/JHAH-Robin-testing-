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

WebUI.callTestCase(findTestCase('demo tests/logincase'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_ROBINHome/a_Definitions'))

WebUI.click(findTestObject('Page_ROBINHome/a_Definitions'))

WebUI.click(findTestObject('Page_ROBINHome/a_System Configuration'))

WebUI.click(findTestObject('Page_System Configuration/a_Facility Department'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_System Configuration/span_Edit'))

WebUI.setText(findTestObject('Page_System Configuration/input_LookUp Description English_LookupMappingFormj_idt228'), 'cardio')

WebUI.setText(findTestObject('Page_System Configuration/input_LookUp Description Arabic_LookupMappingFormj_idt230'), 'pathology')

WebUI.setText(findTestObject('Page_System Configuration/input_Profit Code_LookupMappingFormj_idt232'), '987')

WebUI.click(findTestObject('Page_System Configuration/span_Update'))

WebUI.mouseOver(findTestObject('Page_System Configuration/p_Updating Department Success'))

WebUI.getText(findTestObject('Page_System Configuration/p_Updating Department Success'))

WebUI.verifyElementVisible(findTestObject('Page_System Configuration/p_Updating Department Success'), FailureHandling.STOP_ON_FAILURE)

System.out.println('p_Updating Department Success')

WebUI.delay(3)

WebUI.click(findTestObject('Page_System Configuration/div_Save_ui-growl-icon-close ui-icon ui-icon-closethick'))

WebUI.closeBrowser()

