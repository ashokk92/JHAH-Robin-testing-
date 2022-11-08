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

WebUI.setText(findTestObject('Object Repository/Page_ROBINLogin/input_Loading_loginFormuserName'), username)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ROBINLogin/input_Loading_loginFormpassword'), password)

WebUI.click(findTestObject('Object Repository/Page_ROBINLogin/label_'))

WebUI.click(findTestObject('Object Repository/Page_ROBINLogin/label__1'))

WebUI.click(findTestObject('Object Repository/Page_ROBINLogin/span_King Salman Abdulaziz Hospital -Riyadh'))

WebUI.click(findTestObject('Object Repository/Page_ROBINLogin/span_Sign In'))

WebUI.click(findTestObject('Page_ROBINHome/a_administrator (King Salman Abdulaziz Hosp_783fa5'))

WebUI.click(findTestObject('Page_ROBINHome/a_administrator (King Salman Abdulaziz Hosp_783fa5'))

WebUI.click(findTestObject('Page_ROBINHome/span_LOGOUT'))

WebUI.closeBrowser()

