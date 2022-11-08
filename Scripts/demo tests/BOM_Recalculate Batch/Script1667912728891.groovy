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

WebUI.click(findTestObject('Object Repository/Page_ROBINHome/a_Back Office Management'))

WebUI.click(findTestObject('Object Repository/Page_ROBINHome/a_Back Office Management'))

WebUI.click(findTestObject('Object Repository/Page_ROBINHome/a_Recalculate Batch'))

WebUI.click(findTestObject('Object Repository/Page_Recalculate Batch/label_'))

WebUI.setText(findTestObject('Object Repository/Page_Recalculate Batch/input_Insurance_phWLFormpayer_autoFilter_filter'), 
    'ta')

WebUI.click(findTestObject('Object Repository/Page_Recalculate Batch/li_Tawuniya cooperative  Insurance Company'))

WebUI.click(findTestObject('Object Repository/Page_Recalculate Batch/label_All'))

WebUI.click(findTestObject('Object Repository/Page_Recalculate Batch/li_CORPORATE'))

WebUI.click(findTestObject('Object Repository/Page_Recalculate Batch/label_All_1'))

WebUI.click(findTestObject('Object Repository/Page_Recalculate Batch/li_A'))

WebUI.click(findTestObject('Object Repository/Page_Recalculate Batch/span_Search'))

WebUI.click(findTestObject('Object Repository/Page_Recalculate Batch/ul_Service Item_ui-autocomplete-multiple-co_68a036'))

WebUI.setText(findTestObject('Object Repository/Page_Recalculate Batch/input_Service Item_phWLFormautoActivityCode_input'), 
    '8520')

WebUI.click(findTestObject('Object Repository/Page_Recalculate Batch/li_558520000Ultrasound of spine and spinal cord'))

WebUI.setText(findTestObject('Object Repository/Page_Recalculate Batch/input_Service Item_phWLFormautoActivityCode_input'), 
    '2013')

WebUI.click(findTestObject('Object Repository/Page_Recalculate Batch/li_320133FRACT.MAX.LEFORT III FRONTAL SUSP(CLOSE)'))

WebUI.setText(findTestObject('Object Repository/Page_Recalculate Batch/input_Service Item_phWLFormautoActivityCode_input'), 
    '2014')

WebUI.click(findTestObject('Object Repository/Page_Recalculate Batch/li_320142GUM TREATMENT'))

WebUI.click(findTestObject('Object Repository/Page_Recalculate Batch/input_Update action_phWLFormactionType'))

WebUI.click(findTestObject('Object Repository/Page_Recalculate Batch/input_Update type_phWLFormj_idt211'))

WebUI.click(findTestObject('Object Repository/Page_Recalculate Batch/span_Apply'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Recalculate Batch/p_ServiceServices has been added successfully'))

WebUI.closeBrowser()

