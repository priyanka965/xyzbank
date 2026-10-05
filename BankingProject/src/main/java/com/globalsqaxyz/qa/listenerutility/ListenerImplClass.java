package com.globalsqaxyz.qa.listenerutility;

import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ISuite;
import org.testng.ISuiteListener;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.globalsqaxyz.qa.basetest.BaseClass;

public class ListenerImplClass implements  ITestListener, ISuiteListener {
	public ExtentReports report;
	public ExtentTest test;
	public WebDriver driver;

	@Override
	public void onStart(ISuite suite) {
		System.out.println("Report Configuration");
		String time =new Date().toString().replace(" ", "_").replace(":", "_");
		
		//Spark Config
		ExtentSparkReporter spark=new ExtentSparkReporter("./AdvanceReport/report_"+time+".html");
		spark.config().setDocumentTitle("XYZ Test suite results");
		spark.config().setReportName("XYZ report");
		spark.config().setTheme(Theme.DARK);
		
		//add environment and create test
		report=new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("OS", "Windows-11");
		report.setSystemInfo("Browser", "Chrome");
		
		
	}

	@Override
	public void onFinish(ISuite suite) {
		System.out.println("Report BackUp");
		report.flush();
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("=========>"+result.getMethod().getMethodName()+"======Start=====");
		 test=report.createTest(result.getMethod().getMethodName());
		test.log(Status.INFO, result.getMethod().getMethodName()+"==> Started <==");
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("======>"+result.getMethod().getMethodName()+"==> End <==");
		test.log(Status.PASS, result.getMethod().getMethodName()+"==> Completed <==");
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String testName=result.getMethod().getMethodName();
		driver = ((BaseClass) result.getInstance()).driver;
		TakesScreenshot screenShot=(TakesScreenshot)driver;
		String filePath=screenShot.getScreenshotAs(OutputType.BASE64);
		String time=new Date().toString().replace(" ", "_").replace(":", "_");
		test.addScreenCaptureFromBase64String(filePath,testName+"_"+time);
		test.log(Status.FAIL, result.getMethod().getMethodName()+"==> Failed <==");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("=====>"+result.getMethod().getMethodName()+"==> Skipped <==");
		test.log(Status.SKIP, result.getMethod().getMethodName()+"==> Skipped <==");
		
	}

	
	
	
         
}
