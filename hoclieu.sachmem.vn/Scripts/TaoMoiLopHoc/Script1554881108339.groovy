import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://hoclieu.sachmem.vn/folder/0')

WebUI.click(findTestObject('Page_Hc liu - Sch Mm/a_ng nhp'))

WebUI.setText(findTestObject('Page_ng nhp  Sch Mm/input_a ch email_useremail'), 'hwngvux98@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_ng nhp  Sch Mm/input_Mt khu_userpassword'), 'EjEDdN6o7pTQoul/MO4YbQ==')

WebUI.click(findTestObject('Page_ng nhp  Sch Mm/input_Qun mt khu_commit'))

WebUI.click(findTestObject('Page_Hc liu - Sch Mm/a_Lp hc ca ti'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Hc liu - Sch Mm/a_Thm'))

WebUI.delay(1)

WebUI.setText(findTestObject('Page_Hc liu - Sch Mm/input_Tn_form-control ng-untouched ng-dirty ng-valid'), 'testtest1233123123')

WebUI.delay(1)

WebUI.click(findTestObject('Page_Hc liu - Sch Mm/span_Chn khi lp_ng-arrow-wrapper'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Hc liu - Sch Mm/Lop2'))

WebUI.delay(1)

WebUI.setText(findTestObject('Page_Hc liu - Sch Mm/textarea_M t_form-control ng-untouched ng-valid ng-dirty'), 'testtest')

WebUI.click(findTestObject('Page_Hc liu - Sch Mm/span_Chn lp hc_ng-arrow-wrapper'))

WebUI.verifyElementPresent(findTestObject('Page_Hc liu - Sch Mm/div_Thnh cng  To thnh cng'), 2)

