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

WebUI.click(findTestObject('Page_ROBINHome/a_Patient Journey Management'))

WebUI.click(findTestObject('Page_ROBINHome/a_Patient Journey Management'))

WebUI.click(findTestObject('Page_ROBINHome/a_Out Patient Authorizations'))

WebUI.setText(findTestObject('Page_Out Patient Authorizations/input_Approved Partially  Rejected_phWLFormsearch'), 'lk90==')

WebUI.click(findTestObject('Page_Out Patient Authorizations/span_Search'))

WebUI.click(findTestObject('Page_Out Patient Authorizations/a_ew yr JJH'))

WebUI.setText(findTestObject('Object Repository/Page_Out Patient Authorizations/input_Approval Code_AccumedHaadActivityList_c7c2f9'), 
    '78')

WebUI.waitForPageLoad(10)

WebUI.setText(findTestObject('Object Repository/Page_Out Patient Authorizations/input_Approval Code_AccumedHaadActivityList_679f4e'), 
    '12')

WebUI.waitForPageLoad(15)

WebUI.setText(findTestObject('Object Repository/Page_Out Patient Authorizations/input_Approval Code_AccumedHaadActivityList_21777c'), 
    '89')

WebUI.setText(findTestObject('Object Repository/Page_Out Patient Authorizations/input_Approval Code_AccumedHaadActivityList_99a939'), 
    '98')

WebUI.click(findTestObject('Object Repository/Page_Out Patient Authorizations/label_Approval Required'))

WebUI.click(findTestObject('Object Repository/Page_Out Patient Authorizations/li_Approved'))

WebUI.click(findTestObject('Object Repository/Page_Out Patient Authorizations/span_Apply'))

WebUI.click(findTestObject('Object Repository/Page_Out Patient Authorizations/span_Save'))

WebUI.closeBrowser()

