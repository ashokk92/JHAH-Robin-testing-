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

WebUI.click(findTestObject('Page_ROBINHome/a_Definitions'))

WebUI.click(findTestObject('Page_ROBINHome/a_Definitions'))

WebUI.click(findTestObject('Page_ROBINHome/a_Patient'))

WebUI.click(findTestObject('Object Repository/moh_def patient/span_Add Patient'))

WebUI.setText(findTestObject('Object Repository/moh_def patient/input__AccumedPatientCreateFormmrn'), 'mrn-895..0')

WebUI.setText(findTestObject('Object Repository/moh_def patient/input_National ID_AccumedPatientCreateForme_a5ef9f'), '8888999999')

WebUI.setText(findTestObject('Object Repository/moh_def patient/input__AccumedPatientCreateFormpatientName'), 'l;\'0oik')

WebUI.setText(findTestObject('Object Repository/moh_def patient/input__AccumedPatientCreateFormMiddlename'), 'anirudfhyt')

WebUI.setText(findTestObject('Object Repository/moh_def patient/input__AccumedPatientCreateFormpatientSurname'), 'lopi][ytr')

WebUI.click(findTestObject('Object Repository/moh_def patient/label_'))

WebUI.click(findTestObject('Object Repository/moh_def patient/li_Male'))

WebUI.setText(findTestObject('Object Repository/moh_def patient/input__AccumedPatientCreateFormdateOfBirth2_input'), '23/07/1995')

WebUI.click(findTestObject('Object Repository/moh_def patient/a_23'))

WebUI.click(findTestObject('Object Repository/moh_def patient/label_Select One'))

WebUI.click(findTestObject('Object Repository/moh_def patient/li_Married'))

WebUI.setText(findTestObject('Object Repository/moh_def patient/input_Mobile_AccumedPatientCreateFormmobile'), '9989965578')

WebUI.setText(findTestObject('Object Repository/moh_def patient/input_Email_AccumedPatientCreateFormemail'), 'sknhj@gmail.com')

WebUI.click(findTestObject('Object Repository/moh_def patient/span_Insert Patient'))

WebUI.mouseOver(findTestObject('moh_def patient/p_Patient has been added successfully'))

WebUI.getText(findTestObject('moh_def patient/p_Patient has been added successfully'))

WebUI.verifyElementText(findTestObject('Object Repository/moh_def patient/p_Patient has been added successfully'), 'Patient has been added successfully.')

WebUI.closeBrowser()

