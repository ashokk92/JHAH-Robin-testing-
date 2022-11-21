package com.katalon
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class LoginSteps {
	@Given("User navigates to login page")
	def navigate_to_login_page() {
		println("\n perform the login page")
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl('https://moh.accumed.sa/ROBIN/faces//MainPages/SANTECHTURE/Login.xhtml')
	}
	@When("User enters (.*) and (.*)")
	def enter_the_username_and_password(String username, String password) {
		println("\n enter the valid credentials")
		println("username:"+username)
		println("password:"+password)
		WebUI.setText(findTestObject('Object Repository/Page_ROBINLogin/input_Loading_loginFormuserName'), username)
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_ROBINLogin/input_Loading_loginFormpassword'), password)
	}
	@And("Click on login button")
	def Click_on_login_button() {
		println("\n login accessed")
		WebUI.click(findTestObject('Object Repository/Page_ROBINLogin/label_'))
		WebUI.click(findTestObject('Object Repository/Page_ROBINLogin/label__1'))
		WebUI.click(findTestObject('Object Repository/Page_ROBINLogin/td_King Salman Abdulaziz Hospital -Riyadh'))
		WebUI.click(findTestObject('Object Repository/Page_ROBINLogin/button_Sign In'))
	}
	@Then("close the browser")
	def close_the_browser() {
		println("\n browser closed")
		WebUI.closeBrowser()
	}
}