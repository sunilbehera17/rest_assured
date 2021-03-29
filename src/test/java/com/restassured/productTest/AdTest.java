/*

 * Copyright 2020 

 */
/**

 * @author Sunil Kumar Behera <qaitsunil@gmail.com> 

apiautomationframework com.restassured.productTest 21-08-2020
 */

package com.restassured.productTest;

import org.testng.annotations.Test;
import org.testng.annotations.Listeners;

import com.restassured.validation.campaignAdd_Validation;

import com.restassured.utils.ExtentReportListner;

import org.json.simple.parser.ParseException;

@Listeners(ExtentReportListner.class)
public class AdTest extends ExtentReportListner
{
	
	
	
	
	@Test
	public void campaignAdd_ValidResponse()
	{
		new campaignAdd_Validation()
		.campaignAddStringVerification()
		.campaignAddIntegerVerification()
		.campaignAddKeyPresent()
		.campaignAddStatuscode()
		.ResponseTimeVerification();
	}
	
	
	

}

