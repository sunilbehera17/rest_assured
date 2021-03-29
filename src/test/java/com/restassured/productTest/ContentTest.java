package com.restassured.productTest;

import org.testng.annotations.Test;
import org.testng.annotations.Listeners;

import com.restassured.validation.addCast_Validation;

import com.restassured.utils.ExtentReportListner;

import org.json.simple.parser.ParseException;

@Listeners(ExtentReportListner.class)
public class ContentTest extends ExtentReportListner
{
	
    
	
	 @Test
	public void addCastValidResponse() throws ParseException
	{
		new addCast_Validation()
		.ResponseTimeVerification()
		.addCastIntegerVerification()
		.addCastJsonVerification()
		.addCastyKeyPresent()
		.addCastStatuscode();
		
	
	}
	
	@Test
	public void addCastInvalidResponse() throws ParseException
	{
		new addCast_Validation()
		.ResponseTimeVerification()
		.addCastInvalidIntegerVerification()
		.addCastInvalidStringVerification()
		.addCastInvalidArrayVerification()
		.addCastInvalidKeyPresent()
		.addCastInvalidStatuscode();
	
	}
	
	
	
	
	
	
}	


