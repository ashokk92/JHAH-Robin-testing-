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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://dev-api2.santechture.com:8887/ROBIN/faces//MainPages/JHAH/Login.xhtml')

WebUI.setText(findTestObject('Object Repository/Page_ROBINLogin/input_Loading_loginFormuserName'), 'root')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ROBINLogin/input_Loading_loginFormpassword'), 'mM0VwRptd7w=')

WebUI.click(findTestObject('Object Repository/Page_ROBINLogin/label_'))

WebUI.click(findTestObject('Object Repository/Page_ROBINLogin/label__1'))

WebUI.click(findTestObject('Object Repository/Page_ROBINLogin/td_King Salman Abdulaziz Hospital -Riyadh'))

WebUI.click(findTestObject('Object Repository/Page_ROBINLogin/button_Sign In'))

WebUI.click(findTestObject('Object Repository/Page_ROBINHome/a_IP Billing'))

WebUI.click(findTestObject('Object Repository/Page_ROBINHome/a_IP Billing'))

WebUI.click(findTestObject('Object Repository/Page_ROBINHome/a_IP Bills'))

WebUI.setText(findTestObject('Object Repository/Page_IP Bills/input_IP Bills_phWLFormsearch'), 'mrn-09/*8')

WebUI.click(findTestObject('Object Repository/Page_IP Bills/span_Search'))

WebUI.click(findTestObject('Page_IP Bills/a_KRANTHET hahahah JJJDHDHD'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_IP Bills/span_Generate Draft  Approval Request'))

WebUI.closeBrowser()

