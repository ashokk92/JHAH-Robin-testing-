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

WebUI.click(findTestObject('Object Repository/Page_ROBINHome/span_IP Billing'))

WebUI.click(findTestObject('Object Repository/Page_ROBINHome/span_IP Billing'))

WebUI.click(findTestObject('Object Repository/Page_ROBINHome/a_IP Bills'))

WebUI.setText(findTestObject('Object Repository/Page_IP Bills/input_IP Bills_phWLFormsearch'), 'mrn-890.89')

WebUI.click(findTestObject('Object Repository/Page_IP Bills/span_Search'))

WebUI.click(findTestObject('Object Repository/Page_IP Bills/a_KJHSAGA sdgjaj RTYUIO'))

WebUI.click(findTestObject('Object Repository/IPBills insurance/span_Insurance Details'))

WebUI.click(findTestObject('Object Repository/IPBills insurance/span_Add Insurance'))

WebUI.setText(findTestObject('Object Repository/IPBills insurance/input__AccumedPatientInsuranceCreateFormpat_cc52de'), 
    '890.2311')

WebUI.click(findTestObject('Object Repository/IPBills insurance/label_'))

WebUI.setText(findTestObject('Object Repository/IPBills insurance/input_Spouse_AccumedPatientInsuranceCreateF_20d039'), 
    'ta')

WebUI.click(findTestObject('Object Repository/IPBills insurance/li_Tawuniya cooperative  Insurance Company'))

WebUI.click(findTestObject('Object Repository/IPBills insurance/span_PolicyPlan_ui-button-icon-primary ui-i_6fb31b'))

WebUI.click(findTestObject('Object Repository/IPBills insurance/td_CORPORATE'))

WebUI.click(findTestObject('Object Repository/IPBills insurance/span_Class_ui-button-icon-primary ui-icon u_1ed3f1'))

WebUI.click(findTestObject('Object Repository/IPBills insurance/td_A'))

WebUI.click(findTestObject('Object Repository/IPBills insurance/label_IP Admissions Only'))

WebUI.click(findTestObject('Object Repository/IPBills insurance/li_IP and OP Admissions'))

WebUI.click(findTestObject('Object Repository/IPBills insurance/label_Select One'))

WebUI.click(findTestObject('Object Repository/IPBills insurance/li_True'))

WebUI.click(findTestObject('Object Repository/IPBills insurance/span_Save'))

WebUI.delay(2)

WebUI.click(findTestObject('IPBills insurance/Element_ins(save)'))

WebUI.click(findTestObject('IPBills insurance/span_Close'))

WebUI.closeBrowser()

