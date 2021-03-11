/*


 * Copyright 2020 

 */
/**

 * @author Sunil Kumar Behera <qaitsunil@gmail.com> 

apiautomationframework com.restassured.productTest 28-08-2020
 */
package com.restassured.validation;

import java.util.Iterator;
import java.util.Set;

import org.json.JSONObject;

import com.google.gson.JsonObject;
import com.restassured.assertion.JsonExtract;
import com.restassured.productPage.CommonPage;
import com.restassured.productPage.campaignAddPage;
import com.restassured.productPage.getCampaignPage;
import com.restassured.utils.ExtentReportListner;


public class campaignAdd_Validation extends CommonPage
{

	public ExtentReportListner report = new ExtentReportListner();
	public  Set<String> hash_Set;
	public campaignAddPage campaignAddPage = new campaignAddPage();
	public JsonExtract JE = new JsonExtract();
	
	
	/*
	 * This method validate the Datatype of the Key is being passed is String or not
	 * If any of the Keys passing in this method found other than String it will fail
	 * In this Function only pass the Key name in the 'hash_Set' and API function name in JSONObject argument.
	 * */
	  public campaignAdd_Validation campaignAddStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(campaignAddPage.campaignAdd_valid_Inputs());
		  hash_Set = InsertValue("status","message");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"String");
				//JE.getKey(inputJSONObject, itr.next());
			
			}	
		return this;
	  }
	  
	  /*
		 * This method validate the Datatype of the Key is being passed is Integer or not
		 * If any of the Keys passing in this method found other than String it will fail
		 * In this Function only pass the Key name in the 'hash_Set' and API function name in JSONObject argument.
		 * */
	  public campaignAdd_Validation campaignAddIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(campaignAddPage.campaignAdd_valid_Inputs());
		  hash_Set = InsertValue("code");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  public campaignAdd_Validation campaignAddArrayVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(campaignAddPage.campaignAdd_valid_Inputs());
		  hash_Set = InsertValue("fieldValues");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Array");
			
			}
			return this;
	  }
	  
	  public campaignAdd_Validation campaignAddJsonVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(campaignAddPage.campaignAdd_valid_Inputs());
		  hash_Set = InsertValue("data");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Object");
			
			}
			return this;
	  }
	  
	  
	  
	  /*
		 * This method validate the  Key is being passed is present in the response
		 * If any of the Keys passing in this method not found in response it will fail
		 * In this Function only pass the Key name in the 'hash_Set' and API function name in 'APIResponse' value.
		 * */
	  public campaignAdd_Validation campaignAddKeyPresent()
	  {
		 String APIResponse = campaignAddPage.campaignAdd_valid_Inputs();
		  hash_Set = InsertValue("status","message",
				  "code");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public campaignAdd_Validation campaignAddStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(campaignAddPage.campaignAdd_valid_Inputs());
		  hash_Set = InsertValue("code","status","message");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				
				String key = itr.next();
				String keyvalue = JE.getKeyValue(inputJSONObject,key);
				API_assertion.VerifyCodeStatus(key, keyvalue,"200",Property.campignAdd,"SUCCESS");
			
			}
			return this;
	  }
	  
	  public campaignAdd_Validation ResponseTimeVerification()
	  {
		 long time = campaignAddPage.CampaignAddResponseTime();
		 API_assertion.ResponseTimeVerification(time);
		 
		 //ResponseTimeVerification(time);
		  return this;
	  }
	  
	  
	  public campaignAdd_Validation AddFormInvalidStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(campaignAddPage.campaignAdd_valid_Inputs());
		  hash_Set = InsertValue("status","message");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"String");
				//JE.getKey(inputJSONObject, itr.next());
			
			}	
		return this;
	  }
	  
	  public campaignAdd_Validation AddFormInvalidIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(campaignAddPage.campaignAdd_valid_Inputs());
		  hash_Set = InsertValue("code");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  public campaignAdd_Validation AdformInvalidKeyPresent()
	  {
		 String APIResponse = campaignAddPage.campaignAdd_valid_Inputs();
		  hash_Set = InsertValue("status","message","data","code");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public campaignAdd_Validation AdformInvalidStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(campaignAddPage.addform_invalid_Inputs());
		  hash_Set = InsertValue("code","status","message");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				
				String key = itr.next();
				String keyvalue = JE.getKeyValue(inputJSONObject,key);
				API_assertion.VerifyCodeStatus(key, keyvalue,"1010","Wrong form name given","FAILURE");
			
			}
			return this;
	  }
	  
	
}
