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

import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.JsonObject;
import com.relevantcodes.extentreports.LogStatus;
import com.restassured.assertion.JsonExtract;
import com.restassured.productPage.CommonPage;
import com.restassured.productPage.getAdPage;
import com.restassured.utils.ExtentReportListner;


public class getAd_Validation extends CommonPage
{

	public ExtentReportListner report = new ExtentReportListner();
	public  Set<String> hash_Set;
	public getAdPage getadpage = new getAdPage();
	public JsonExtract JE = new JsonExtract();
	
	
	/*
	 * This method validate the Datatype of the Key is being passed is String or not
	 * If any of the Keys passing in this method found other than String it will fail
	 * In this Function only pass the Key name in the 'hash_Set' and API function name in JSONObject argument.
	 * */
	  public getAd_Validation getadStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(getadpage.getad_valid_Inputs());
		  hash_Set = InsertValue("status","message",
				  "content_uuid","content_name","campaign",
				  "channel_id");
		  
		  
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
	  public getAd_Validation GetAdIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(getadpage.getad_valid_Inputs());
		  hash_Set = InsertValue("code","total_elements");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  public getAd_Validation GetAdArrayVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(getadpage.getad_valid_Inputs());
		  hash_Set = InsertValue("contentList");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Array");
			
			}
			return this;
	  }
	  
	  public getAd_Validation GetAdJsonVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(getadpage.getad_valid_Inputs());
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
	  public getAd_Validation GetAdKeyPresent()
	  {
		 String APIResponse = getadpage.getad_valid_Inputs();
		  hash_Set = InsertValue("status","message",
				  "contentList","content_uuid","content_name",
				  "campaign","channel_id","total_elements",
				  "data","code");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public getAd_Validation GetAdStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(getadpage.getad_valid_Inputs());
		  hash_Set = InsertValue("code","status","message");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				
				String key = itr.next();
				String keyvalue = JE.getKeyValue(inputJSONObject,key);
				API_assertion.VerifyCodeStatus(key, keyvalue,"200","Success","SUCCESS");
			
			}
			return this;
	  }
	  
	  public getAd_Validation ResponseTimeVerification()
	  {
		 long time = getadpage.getadResponseTime();
		 API_assertion.ResponseTimeVerification(time);
		 
		 //ResponseTimeVerification(time);
		  return this;
	  }
	  
	  
//_____---------_______----------___________--------_________-----WIth invalid request method-------_______----------__________------_________-----
	  
	  public getAd_Validation InvalidRequestMethodVerification()
	  {
		  
		  try {
			JSONObject inputJSONObject = new JSONObject(getadpage.InvalidRequestMethod());
			  report.getTest().log(LogStatus.FAIL,"Invalid Request Method ");
			  hash_Set = InsertValue("status","message");
			  
			  Iterator<String> itr = hash_Set.iterator();
				while(itr.hasNext())
				{
					//System.out.println(itr.next());
					JE.getKeyDatatype(inputJSONObject,itr.next(),"String");
					//JE.getKey(inputJSONObject, itr.next());
				
				}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return this;
	  }
	 
//_____---------_______----------___________--------_________-----WIth invalid request method-------_______----------__________------_________-----  
	
	
//_____---------_______----------___________--------_________-----WIth invalid token method-------_______----------__________------_________-----

	  public getAd_Validation InvalidTokenStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(getadpage.invalid_token());
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
	  
	  public getAd_Validation InvalidTokenIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(getadpage.invalid_token());
		  hash_Set = InsertValue("code");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  public getAd_Validation InvalidTokenKeyPresent()
	  {
		 String APIResponse = getadpage.invalid_token();
		  hash_Set = InsertValue("status","message",
				  "code","response");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public getAd_Validation InvalidTokenstatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(getadpage.invalid_token());
		  hash_Set = InsertValue("code","status","message");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				
				String key = itr.next();
				String keyvalue = JE.getKeyValue(inputJSONObject,key);
				API_assertion.VerifyCodeStatus(key, keyvalue,Property.invalidTokenCode,Property.invalidTokenMessage,Property.invalid_Statue);
			
			}
			return this;
	  }
	  
	  public getAd_Validation InvalidTokenVerification()
	  {
		  InvalidTokenIntegerVerification()
		  .InvalidTokenStringVerification()
		  .InvalidTokenKeyPresent()
		  .InvalidTokenstatuscode();
		  return this;
	  }
	  
	  
//_____---------_______----------___________--------_________-----WIth invalid token method-------_______----------__________------_________-----



	  
	
}
