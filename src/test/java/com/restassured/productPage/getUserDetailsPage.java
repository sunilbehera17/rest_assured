/*

 * Copyright 2020 

 */
/**

 * @author Sunil Kumar Behera <qaitsunil@gmail.com> 

 apiautomationframework com.restassured.productTest 14-09-2020
 */

package com.restassured.productPage;

import static io.restassured.RestAssured.baseURI;
import java.util.concurrent.TimeUnit;

import com.restassured.property.ContentProperty;

;

public class getUserDetailsPage extends CommonPage {

	public String URL = "https://apigateway-staging.allthingsott.com/";
	//
	public CommonAPIs commonapis = new CommonAPIs();
	public ContentProperty ContentProperty = new ContentProperty();
	public String token = commonapis.loginAPI(ContentProperty.getEmail(),
			ContentProperty.getPassword(), ContentProperty.getProductkey(),
			ContentProperty.getProducttoken());

	public String addCast_valid_Inputs() {
		baseURI = ContentProperty.getURL();

		// request data (Json data)
		jsonparser("{\"query\":\"{getUserDetails(user_uuid:\":me\", app_token:\":app_token\", product_key:\":product_key\") {username, name, email, mobile, company_name, location, ip_address, address, product_name, user_status, profile_image_url, custom_fields,is_activate}}\"}");

		response = postRequest("user", token);
		String resdata = response.getBody().asString();
		System.out.println(resdata);
		return resdata;

	}

	public long addCastResponseTime() {

		baseURI = ContentProperty.getURL();

		// request data (Json data)
		jsonparser("{\"query\":\"{getUserDetails(user_uuid:\":me\", app_token:\":app_token\", product_key:\":product_key\") {username, name, email, mobile, company_name, location, ip_address, address, product_name, user_status, profile_image_url, custom_fields,is_activate}}\"}");
		response = postRequest("user", token);
		long responsetime = response.getTimeIn(TimeUnit.MILLISECONDS);
		return responsetime;

	}

	public String addCast_invalid_Inputs() {
		baseURI = ContentProperty.getURL();

		// request data (Json data)
		jsonparser("{\"query\":\"{getUserDetails(user_uuid:\":me\", app_token:\":app_token\", product_key:\":product_key\") {username, name, email, mobile, company_name, location, ip_address, address, product_name, user_status, profile_image_url, custom_fields,is_activate}}\"}");

		response = postRequest("user", token);
		String resdata = response.getBody().asString();
		System.out.println(resdata);
		return resdata;

	}

	/*
	 * public String gettingCategoryid() { baseURI = ContentProperty.getURL();
	 * 
	 * 
	 * //request data (Json data) jsonparser(
	 * "{\"query\":\"{getUserDetails(user_uuid:\":me\", app_token:\":app_token\", product_key:\":product_key\") {username, name, email, mobile, company_name, location, ip_address, address, product_name, user_status, profile_image_url, custom_fields,is_activate}}\"}"
	 * );
	 * 
	 * response = postRequest("user", token); ResponseData =
	 * response.jsonPath();
	 * System.out.println("Response token "+ResponseData.get("data.cast_uuid"));
	 * 
	 * return ResponseData.get("data.cast_uuid");
	 * 
	 * }
	 */

}
