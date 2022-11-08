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

WebUI.click(findTestObject('Page_Data Entry/span_Create New Visit'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Data Entry/span_New patient'))

WebUI.setText(findTestObject('Object Repository/Page_Data Entry/input__AccumedPatientCreateFormmrn'), 'mrn-/*823')

WebUI.setText(findTestObject('Object Repository/Page_Data Entry/input_National ID_AccumedPatientCreateForme_a5ef9f'), '895620...*')

WebUI.setText(findTestObject('Object Repository/Page_Data Entry/input__AccumedPatientCreateFormpatientName'), 'asdhjk')

WebUI.setText(findTestObject('Object Repository/Page_Data Entry/input__AccumedPatientCreateFormMiddlename'), 'srinujak')

WebUI.setText(findTestObject('Object Repository/Page_Data Entry/input__AccumedPatientCreateFormpatientSurname'), 'lachammanb')

WebUI.click(findTestObject('Page_Data Entry/label_'))

WebUI.click(findTestObject('Object Repository/Page_Data Entry/li_Male'))

WebUI.click(findTestObject('Object Repository/Page_Data Entry/label_AFGHANISTAN'))

WebUI.click(findTestObject('Object Repository/Page_Data Entry/li_AFGHANISTAN'))

WebUI.setText(findTestObject('Object Repository/Page_Data Entry/input__AccumedPatientCreateFormdateOfBirth2_input'), '23/07/1996')

WebUI.click(findTestObject('Object Repository/Page_Data Entry/a_23'))

WebUI.click(findTestObject('Page_Data Entry/label_Select One'))

WebUI.click(findTestObject('Object Repository/Page_Data Entry/li_Married'))

WebUI.setText(findTestObject('Object Repository/Page_Data Entry/input_Mobile_AccumedPatientCreateFormmobile'), '9989965589')

WebUI.click(findTestObject('Object Repository/Page_Data Entry/span_Add Insurance Card'))

WebUI.setText(findTestObject('Object Repository/Page_Data Entry/input__AccumedPatientInsuranceCreateFormpat_cc52de'), '89620')

WebUI.click(findTestObject('Object Repository/Page_Data Entry/label__1'))

WebUI.setText(findTestObject('Object Repository/Page_Data Entry/input_Spouse_AccumedPatientInsuranceCreateF_20d039'), 't')

WebUI.click(findTestObject('Object Repository/Page_Data Entry/li_Tawuniya cooperative  Insurance Company'))

WebUI.click(findTestObject('Object Repository/Page_Data Entry/span_PolicyPlan_ui-button-icon-primary ui-i_6fb31b'))

WebUI.click(findTestObject('Object Repository/Page_Data Entry/td_CORPORATE'))

WebUI.click(findTestObject('Object Repository/Page_Data Entry/span_Class_ui-button-icon-primary ui-icon u_1ed3f1'))

WebUI.click(findTestObject('Object Repository/Page_Data Entry/td_A'))

WebUI.click(findTestObject('Object Repository/Page_Data Entry/label_IP Admissions Only'))

WebUI.click(findTestObject('Object Repository/Page_Data Entry/li_IP and OP Admissions'))

WebUI.click(findTestObject('Object Repository/Page_Data Entry/label_Select One_1'))

WebUI.click(findTestObject('Object Repository/Page_Data Entry/li_True'))

WebUI.click(findTestObject('Page_Data Entry/span_Save'))

WebUI.click(findTestObject('Page_Data Entry/span_Insert Patient'))

WebUI.click(findTestObject('Object Repository/Page_Data Entry/label__1_2'))

WebUI.click(findTestObject('Object Repository/Page_Data Entry/li_ACCIDENT  EMERGENCY'))

WebUI.click(findTestObject('Object Repository/Page_Data Entry/label__1_2_3'))

WebUI.click(findTestObject('Object Repository/Page_Data Entry/li_HomeOther'))

WebUI.click(findTestObject('Object Repository/Page_Data Entry/label__1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Page_Data Entry/li_New'))

WebUI.setText(findTestObject('Object Repository/Page_Data Entry/input_Clinician_InvoiceFormclinician_input'), 'n')

WebUI.click(findTestObject('Object Repository/Page_Data Entry/td_NORA AHMED'))

WebUI.click(findTestObject('Page_Data Entry/span_Insert Visit'))

WebUI.closeBrowser()

