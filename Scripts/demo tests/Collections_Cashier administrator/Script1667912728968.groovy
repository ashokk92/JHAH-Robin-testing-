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

WebUI.click(findTestObject('Object Repository/cashier admin/a_Collections'))

WebUI.click(findTestObject('Object Repository/cashier admin/a_Collections'))

WebUI.click(findTestObject('Object Repository/cashier admin/a_Daily collection'))

WebUI.click(findTestObject('Object Repository/cashier admin/a_Deliver money to cashier administrator'))

WebUI.click(findTestObject('Object Repository/cashier admin/span_Deliver money to cashier administrator'))

WebUI.click(findTestObject('Object Repository/cashier admin/label_ (1)'))

WebUI.click(findTestObject('Object Repository/cashier admin/li_Sibin'))

WebUI.setText(findTestObject('Object Repository/cashier admin/input_Total (SAR)_headerFormcollectionSettl_7363fd'), '4')

WebUI.click(findTestObject('Object Repository/cashier admin/span_Save'))

WebUI.click(findTestObject('Object Repository/cashier admin/label_ (1)'))

WebUI.click(findTestObject('Object Repository/cashier admin/li_Sibin'))

WebUI.click(findTestObject('Object Repository/cashier admin/span_Save'))

WebUI.click(findTestObject('Object Repository/cashier admin/a_AcceptedRejected'))

WebUI.click(findTestObject('Object Repository/cashier admin/span_Report'))

WebUI.click(findTestObject('Object Repository/cashier admin/span_Print'))

WebUI.click(findTestObject('Object Repository/cashier admin/span_Settlement Details_ui-icon ui-icon-closethick'))

WebUI.click(findTestObject('Object Repository/cashier admin/a_WaitingPending'))

WebUI.click(findTestObject('Object Repository/cashier admin/span_Report'))

WebUI.click(findTestObject('Object Repository/cashier admin/span_Print'))

WebUI.click(findTestObject('Object Repository/cashier admin/span_Settlement Details_ui-icon ui-icon-closethick'))

WebUI.click(findTestObject('Object Repository/cashier admin/span_Preview'))

WebUI.click(findTestObject('Object Repository/cashier admin/span_Report_ui-icon ui-icon-closethick'))

WebUI.closeBrowser()

