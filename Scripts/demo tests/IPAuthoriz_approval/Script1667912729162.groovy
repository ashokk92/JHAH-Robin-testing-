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

WebUI.click(findTestObject('Object Repository/Page_ROBINHome/a_Patient Journey Management'))

WebUI.click(findTestObject('Object Repository/Page_ROBINHome/a_Patient Journey Management'))

WebUI.click(findTestObject('Object Repository/Page_ROBINHome/a_In Patient Authorizations'))

WebUI.click(findTestObject('Object Repository/Page_In Patient Authorizations/a_Admission Final Approvals'))

WebUI.setText(findTestObject('Page_In Patient Authorizations/input_Rows Per Page_phWLFormsearch2'), 'mrn-09/*8')

WebUI.delay(2)

WebUI.click(findTestObject('Page_In Patient Authorizations/span_Search'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_In Patient Authorizations/a_KRANTHET hahahah JJJDHDHD'))

WebUI.setText(findTestObject('Page_In Patient Authorizations/input_Approval Required_AccumedHaadActivityListIPFormdatalist0valorTotalItem'), 
    '22')

WebUI.setText(findTestObject('Page_In Patient Authorizations/input_Approval Required_AccumedHaadActivityListIPFormdatalist1valorTotalItem'), 
    '88')

WebUI.setText(findTestObject('Page_In Patient Authorizations/input_Approval Required_AccumedHaadActivityListIPFormdatalist2valorTotalItem'), 
    '33')

WebUI.setText(findTestObject('Page_In Patient Authorizations/input_Approval Required_AccumedHaadActivityListIPFormdatalist3valorTotalItem'), 
    '44')

WebUI.setText(findTestObject('Page_In Patient Authorizations/input_Approval Required_AccumedHaadActivityListIPFormdatalist4valorTotalItem'), 
    '55')

WebUI.setText(findTestObject('Page_In Patient Authorizations/input_Approval Required_AccumedHaadActivityListIPFormdatalist5valorTotalItem'), 
    '88')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_In Patient Authorizations/span_Save'))

WebUI.click(findTestObject('Object Repository/Page_In Patient Authorizations/span_Submit for billing'))

WebUI.click(findTestObject('Object Repository/Page_In Patient Authorizations/span_OK'))

WebUI.closeBrowser()

