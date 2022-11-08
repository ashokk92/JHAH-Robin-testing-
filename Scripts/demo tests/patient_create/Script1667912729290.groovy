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

WebUI.click(findTestObject('Object Repository/Page_ROBINHome/a_Definitions'))

WebUI.click(findTestObject('Object Repository/Page_ROBINHome/a_Definitions'))

WebUI.click(findTestObject('Object Repository/Page_ROBINHome/a_Patient'))

WebUI.click(findTestObject('Page_Patient/span_Add Patient'))

WebUI.setText(findTestObject('Object Repository/Page_Patient/input__AccumedPatientCreateFormmrn'), '89*/2')

WebUI.setText(findTestObject('Object Repository/Page_Patient/input_National ID_AccumedPatientCreateForme_a5ef9f'), '/*8956230.')

WebUI.setText(findTestObject('Object Repository/Page_Patient/input__AccumedPatientCreateFormpatientName'), 'patient')

WebUI.setText(findTestObject('Object Repository/Page_Patient/input__AccumedPatientCreateFormMiddlename'), 'dilshanka')

WebUI.setText(findTestObject('Object Repository/Page_Patient/input__AccumedPatientCreateFormpatientSurname'), 'kliou')

WebUI.click(findTestObject('Object Repository/Page_Patient/label_'))

WebUI.click(findTestObject('Object Repository/Page_Patient/li_Male'))

WebUI.setText(findTestObject('Object Repository/Page_Patient/input__AccumedPatientCreateFormdateOfBirth2_input'), '23/07/1992')

WebUI.click(findTestObject('Object Repository/Page_Patient/a_23'))

WebUI.click(findTestObject('Object Repository/Page_Patient/label_Select One'))

WebUI.click(findTestObject('Object Repository/Page_Patient/li_Married'))

WebUI.setText(findTestObject('Object Repository/Page_Patient/input_Mobile_AccumedPatientCreateFormmobile'), '9989965538')

WebUI.click(findTestObject('Object Repository/Page_Patient/span_Insert Patient'))

WebUI.mouseOver(findTestObject('Page_Patient/p_Patient has been added successfully'))

WebUI.getText(findTestObject('Page_Patient/p_Patient has been added successfully'))

WebUI.verifyElementText(findTestObject('Page_Patient/p_Patient has been added successfully'), 'Patient has been added successfully.')

System.out.println('Patient has been added successfully')

WebUI.closeBrowser()

