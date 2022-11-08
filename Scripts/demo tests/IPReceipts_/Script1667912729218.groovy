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

WebUI.delay(2)

WebUI.click(findTestObject('Page_ROBINHome/a_IP Billing'))

WebUI.click(findTestObject('Page_ROBINHome/a_IP Billing'))

WebUI.click(findTestObject('Page_ROBINHome/a_IP Receipts'))

WebUI.setText(findTestObject('Object Repository/Page_IP Receipts/input_IP Receipts_phWLFormsearch'), 'mrn-00987')

WebUI.click(findTestObject('Object Repository/Page_IP Receipts/span_Search'))

WebUI.click(findTestObject('Page_IP Receipts/a_WERTSYAH gagga HSSIIIS'))

WebUI.setText(findTestObject('Object Repository/Page_IP Receipts/input_PaymentAmount_paymentFormpayment0Amou_c31842'), '10.20')

WebUI.click(findTestObject('Object Repository/Page_IP Receipts/span_Generate Receipt  Invoice'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_IP Receipts/div_AlertReceipt generated SuccessfullyOK'))

WebUI.click(findTestObject('Object Repository/Page_IP Receipts/span_OK'))

WebUI.click(findTestObject('Object Repository/Page_IP Receipts/span_Print Receipt  Invoice'))

WebUI.click(findTestObject('Object Repository/Page_IP Receipts/span_Preview'))

WebUI.click(findTestObject('Object Repository/Page_IP Receipts/span_Report_ui-icon ui-icon-closethick'))

WebUI.click(findTestObject('Object Repository/Page_IP Receipts/span_Patient Receipts_ui-icon ui-icon-closethick'))

WebUI.click(findTestObject('Object Repository/Page_IP Receipts/span_Close'))

WebUI.closeBrowser()

