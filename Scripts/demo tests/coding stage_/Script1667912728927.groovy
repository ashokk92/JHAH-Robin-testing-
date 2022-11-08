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

WebUI.setText(findTestObject('Object Repository/Page_Data Entry/input_Create New Visit Ammar_phWLFormsearch'), '8/*9')

WebUI.click(findTestObject('Object Repository/Page_Data Entry/span_Search'))

WebUI.click(findTestObject('Object Repository/Page_Data Entry/span_root2022-11-01 233116.247_ui-button-ic_b01006'))

WebUI.click(findTestObject('Object Repository/Page_Data Entry/span_Move To Coding'))

WebUI.click(findTestObject('Object Repository/Page_Data Entry/span_Confirmed'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Data Entry/div_AlertVisit has been updated successfully.OK'))

WebUI.click(findTestObject('Object Repository/Page_Data Entry/span_OK'))

WebUI.click(findTestObject('Object Repository/Page_Data Entry/a_Back Office Management'))

WebUI.click(findTestObject('Object Repository/Page_Data Entry/a_Back Office Management'))

WebUI.click(findTestObject('Object Repository/Page_Data Entry/a_Coding'))

WebUI.click(findTestObject('Object Repository/Page_Coding/a_ew yr JJH'))

WebUI.click(findTestObject('Object Repository/Page_Coding/span_Save'))

WebUI.click(findTestObject('Object Repository/Page_Coding/span_Submit to Audit'))

WebUI.click(findTestObject('Object Repository/Page_Coding/span_Confirmed'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Coding/div_AlertVisit has been updated successfully.OK'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Coding/span_OK'))

WebUI.closeBrowser()

