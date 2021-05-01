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

import com.restassured.utils.ExtentReportListner;
import com.restassured.validation.getUserDetails_Validation;

import org.json.simple.parser.ParseException;

@Listeners(ExtentReportListner.class)
public class AppfeatureTest extends ExtentReportListner {

	@Test
	public void campaignAdd_ValidResponse() {
		new getUserDetails_Validation()
		        .userdetilasIntegerVerification()
				.userdetilasInvalidArrayVerification()
				.userdetilasInvalidIntegerVerification()
				.userdetilasInvalidKeyPresent()
				.userdetilasInvalidStatuscode()
				.userdetilasInvalidStringVerification()
				.userdetilasJsonVerification()
				;
	}

}
