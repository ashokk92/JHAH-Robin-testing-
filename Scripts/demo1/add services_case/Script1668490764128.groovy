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

WebUI.click(findTestObject('Object Repository/Page_ROBINHome/a_Patient Journey Management'))

WebUI.click(findTestObject('Object Repository/Page_ROBINHome/a_Patient Journey Management'))

WebUI.click(findTestObject('Object Repository/Page_ROBINHome/a_Data Entry'))

WebUI.setText(findTestObject('Object Repository/Page_Data Entry/input_Create New Visit Ammar_phWLFormsearch'), 'mrn-5410')

WebUI.click(findTestObject('Object Repository/Page_Data Entry/a_sikamdar agoora kareemak'))

WebUI.click(findTestObject('Object Repository/Page_Data Entry/a_Diagnosis  Consultation Codes'))

WebUI.setText(findTestObject('Object Repository/Page_Data Entry/input_timeUnit_AccumedHaadActivityListForma_6ca34a'), 'g')

WebUI.click(findTestObject('Object Repository/Page_Data Entry/td_Glucose, blood, using reagent strip'))

WebUI.click(findTestObject('Object Repository/Page_Data Entry/span_Add Service'))

WebUI.setText(findTestObject('Object Repository/Page_Data Entry/input_timeUnit_AccumedHaadActivityListForma_6ca34a'), 't')

WebUI.click(findTestObject('Object Repository/Page_Data Entry/td_Telemedicine Assessment  for diagnosis  _320e5d'))

WebUI.click(findTestObject('Object Repository/Page_Data Entry/button_Add Service'))

WebUI.setText(findTestObject('Object Repository/Page_Data Entry/input_timeUnit_AccumedHaadActivityListForma_6ca34a'), 'e')

WebUI.click(findTestObject('Object Repository/Page_Data Entry/td_Excisional debridement of skin and subcu_5cb86d'))

WebUI.click(findTestObject('Object Repository/Page_Data Entry/span_Add Service'))

WebUI.setText(findTestObject('Object Repository/Page_Data Entry/input_timeUnit_AccumedHaadActivityListForma_6ca34a'), 'b')

WebUI.click(findTestObject('Object Repository/Page_Data Entry/td_Brachythrpy intravaginal high dose rate'))

WebUI.click(findTestObject('Object Repository/Page_Data Entry/table_CodeDateDrugPriceTypeQtyPrice Total P_596fec'))

WebUI.click(findTestObject('Object Repository/Page_Data Entry/span_Add Service'))

WebUI.click(findTestObject('Object Repository/Page_Data Entry/span_Update Visit'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Data Entry/p_Visit has been updated successfully'))

WebUI.closeBrowser()

