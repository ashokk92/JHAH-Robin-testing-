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

WebUI.callTestCase(findTestCase('demo1/login case_moh'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_ROBINHome/span_Patient Journey Management'))

WebUI.click(findTestObject('Page_ROBINHome/a_Patient Journey Management'))

WebUI.click(findTestObject('Page_ROBINHome/a_Data Entry'))

WebUI.click(findTestObject('Object Repository/Page_Data Entry/span_Create New Visit'))

WebUI.click(findTestObject('Object Repository/Page_Data Entry/button_New patient'))

WebUI.setText(findTestObject('Object Repository/Page_Data Entry/input__AccumedPatientCreateFormmrn'), 'mrn-0987//')

WebUI.setText(findTestObject('Object Repository/Page_Data Entry/input_National ID_AccumedPatientCreateForme_a5ef9f'), '0000022398')

WebUI.setText(findTestObject('Object Repository/Page_Data Entry/input__AccumedPatientCreateFormpatientName'), 'paramesg')

WebUI.setText(findTestObject('Object Repository/Page_Data Entry/input__AccumedPatientCreateFormMiddlename'), 'lkoiuy')

WebUI.setText(findTestObject('Object Repository/Page_Data Entry/input__AccumedPatientCreateFormpatientSurname'), 'mjkiuyt')

WebUI.setText(findTestObject('Object Repository/Page_Data Entry/input__AccumedPatientCreateFormdateOfBirth2_input'), '23/07/1994')

WebUI.click(findTestObject('Object Repository/Page_Data Entry/a_23'))

WebUI.click(findTestObject('Page_Data Entry/div_Select One_ui-selectonemenu-trigger ui-state-default ui-corner-right'))

WebUI.click(findTestObject('Object Repository/Page_Data Entry/li_Married'))

WebUI.click(findTestObject('Page_Data Entry/div__ui-selectonemenu-trigger ui-state-default ui-corner-right'))

WebUI.click(findTestObject('Object Repository/Page_Data Entry/li_Male'))

WebUI.setText(findTestObject('Page_Data Entry/input_Mobile_AccumedPatientCreateFormmobile'), '8184876498')

WebUI.setText(findTestObject('Page_Data Entry/input_Email_AccumedPatientCreateFormemail'), 'skrvn@gmail.com')

WebUI.click(findTestObject('Page_Data Entry/span_Insert Patient'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Data Entry/p_Patient has been added successfully'))

WebUI.click(findTestObject('Object Repository/Page_Data Entry/label__1'))

WebUI.click(findTestObject('Object Repository/Page_Data Entry/li_Cardiology'))

WebUI.setText(findTestObject('Object Repository/Page_Data Entry/input_Clinician_InvoiceFormclinician_input'), 'b')

WebUI.click(findTestObject('Object Repository/Page_Data Entry/td_ABDUL KARIM ALTUWAIJRI(C) ENT'))

WebUI.click(findTestObject('Object Repository/Page_Data Entry/span_Insert Visit'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Data Entry/p_Visit has been created successfully'))

WebUI.closeBrowser()

