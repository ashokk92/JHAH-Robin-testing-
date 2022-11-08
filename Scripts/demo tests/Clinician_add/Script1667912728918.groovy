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

WebUI.click(findTestObject('Object Repository/Page_ROBINHome/a_Clinicians'))

WebUI.click(findTestObject('Object Repository/Page_/span_Add Clinician'))

WebUI.setText(findTestObject('Object Repository/Page_/input__AccumedCliniciansCreateFormclinicianLicense'), 'ASHJK898')

WebUI.setText(findTestObject('Object Repository/Page_/input__AccumedCliniciansCreateFormclinicianName'), 'BALAYYA')

WebUI.click(findTestObject('Object Repository/Page_/label_Select One'))

WebUI.click(findTestObject('Object Repository/Page_/li_Male'))

WebUI.setText(findTestObject('Object Repository/Page_/input_Location_AccumedCliniciansCreateFormlocation'), 'INDIA')

WebUI.click(findTestObject('Object Repository/Page_/label_Select One_1'))

WebUI.click(findTestObject('Object Repository/Page_/li_Active'))

WebUI.click(findTestObject('Object Repository/Page_/span_Home Care_ui-chkbox-icon ui-icon ui-ic_c29905'))

WebUI.setText(findTestObject('Object Repository/Page_/input__AccumedCliniciansCreateFormvalidFrom_input'), '03/10/2022')

WebUI.setText(findTestObject('Object Repository/Page_/input__AccumedCliniciansCreateFormvalidTo_input'), '10/10/2023')

WebUI.click(findTestObject('Object Repository/Page_/label_Select One_1_2'))

WebUI.click(findTestObject('Object Repository/Page_/li_Specialist'))

WebUI.click(findTestObject('Object Repository/Page_/span_Add Profession'))

WebUI.click(findTestObject('Object Repository/Page_/span_Anesthesia_ui-chkbox-icon ui-icon ui-i_3c8e1d'))

WebUI.click(findTestObject('Object Repository/Page_/a_2'))

WebUI.click(findTestObject('Object Repository/Page_/span_Ear, nose and throat (ENT)_ui-chkbox-i_cf612e'))

WebUI.click(findTestObject('Object Repository/Page_/span_Anesthesia_ui-chkbox-icon ui-icon ui-i_3c8e1d'))

WebUI.click(findTestObject('Object Repository/Page_/span_general practitioner_ui-chkbox-icon ui_7821de'))

WebUI.click(findTestObject('Object Repository/Page_/a_3'))

WebUI.click(findTestObject('Object Repository/Page_/div_General Surgery_ui-chkbox-box ui-widget_5af131'))

WebUI.click(findTestObject('Object Repository/Page_/a_6'))

WebUI.click(findTestObject('Object Repository/Page_/span_Anesthesia_ui-chkbox-icon ui-icon ui-i_3c8e1d'))

WebUI.click(findTestObject('Object Repository/Page_/span_Save'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_/Element_save'))

WebUI.setText(findTestObject('Object Repository/Page_/input_Filter by Name_AccumedCliniciansListF_0e5895'), 'BALAYYA')

WebUI.click(findTestObject('Object Repository/Page_/span_View'))

WebUI.click(findTestObject('Object Repository/Page_/a_Professions'))

WebUI.click(findTestObject('Object Repository/Page_/span_Close'))

WebUI.closeBrowser()

