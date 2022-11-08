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

WebUI.click(findTestObject('Object Repository/Page_ROBINHome/a_Back Office Management'))

WebUI.click(findTestObject('Object Repository/Page_ROBINHome/a_Back Office Management'))

WebUI.click(findTestObject('Object Repository/Page_ROBINHome/a_MIS Reports'))

WebUI.click(findTestObject('Object Repository/Page_MIS Reports/label_Monthly Revenue'))

WebUI.click(findTestObject('Object Repository/Page_MIS Reports/li_Monthly Revenue'))

WebUI.setText(findTestObject('Object Repository/Page_MIS Reports/input_Finance Type_MISReportsFormendDateFrom_input'), '10/10/2022')

WebUI.click(findTestObject('Object Repository/Page_MIS Reports/a_10'))

WebUI.setText(findTestObject('Object Repository/Page_MIS Reports/input_Finance Type_MISReportsFormendDateTo_input'), '04/11/2022')

WebUI.click(findTestObject('Object Repository/Page_MIS Reports/a_4'))

WebUI.click(findTestObject('Object Repository/Page_MIS Reports/span_Generate Report'))

WebUI.closeBrowser()

