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

WebUI.click(findTestObject('Object Repository/Page_ROBINHome/a_Data Entry'))

WebUI.setText(findTestObject('Object Repository/Page_Data Entry/input_Create New Visit Ammar_phWLFormsearch'), 'mrn-09871')

WebUI.click(findTestObject('Object Repository/Page_Data Entry/span_Search'))

WebUI.click(findTestObject('Page_Data Entry/button_ui-button'))

WebUI.click(findTestObject('Object Repository/Page_Data Entry/a_Diagnosis  Consultation Codes'))

WebUI.setText(findTestObject('Object Repository/Page_Data Entry/input_timeUnit_AccumedHaadActivityListForma_6ca34a'), 'c')

WebUI.click(findTestObject('Object Repository/Page_Data Entry/td_Caudal injection of steroid'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Data Entry/span_Other Service_ui-button-icon-left ui-icon ui-c ui-icon-plus'))

WebUI.click(findTestObject('Page_Data Entry/span_Check Material Response_ui-icon ui-icon-closethick'))

WebUI.setText(findTestObject('Object Repository/Page_Data Entry/input_timeUnit_AccumedHaadActivityListForma_6ca34a'), 'cons')

WebUI.click(findTestObject('Object Repository/Page_Data Entry/td_CONSULTANT'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Data Entry/span_Add Service'))

WebUI.click(findTestObject('Page_Data Entry/span_Cancel'))

WebUI.setText(findTestObject('Object Repository/Page_Data Entry/input_timeUnit_AccumedHaadActivityListForma_6ca34a'), 'm')

WebUI.click(findTestObject('Object Repository/Page_Data Entry/td_Maintenance (alone) of other catheter, i_11d1c0'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Data Entry/span_Add Service'))

WebUI.click(findTestObject('Page_Data Entry/span_Cancel'))

WebUI.setText(findTestObject('Object Repository/Page_Data Entry/input_timeUnit_AccumedHaadActivityListForma_6ca34a'), 'b')

WebUI.click(findTestObject('Object Repository/Page_Data Entry/td_Brachytherapy, intracavitary, low dose rate'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Data Entry/span_Add Service'))

WebUI.click(findTestObject('Page_Data Entry/span_Cancel'))

WebUI.click(findTestObject('Page_Data Entry/span_Update Visit'))

WebUI.mouseOver(findTestObject('Page_Data Entry/p_Visit has been updated successfully'))

WebUI.getText(findTestObject('Page_Data Entry/p_Visit has been updated successfully'))

WebUI.verifyElementText(findTestObject('Page_Data Entry/p_Visit has been updated successfully'), 'Visit has been updated successfully.')

System.out.println('Visit has been updated successfully')

WebUI.closeBrowser()

