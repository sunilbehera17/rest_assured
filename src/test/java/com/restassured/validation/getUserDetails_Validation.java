/*


 * Copyright 2020 

 */
/**

 * @author Sunil Kumar Behera <qaitsunil@gmail.com> 

apiautomationframework com.restassured.productTest 14-09-2020
 */
package com.restassured.validation;

import java.util.Iterator;
import java.util.Set;

import org.json.JSONObject;

import com.restassured.assertion.JsonExtract;
import com.restassured.productPage.CommonPage;
import com.restassured.productPage.getUserDetailsPage;
import com.restassured.utils.ExtentReportListner;


public class getUserDetails_Validation extends CommonPage
{

	public ExtentReportListner report = new ExtentReportListner();
	public  Set<String> hash_Set;
	public getUserDetailsPage userdetilas = new getUserDetailsPage();
	public JsonExtract JE = new JsonExtract();
	
	
	/*
	 * This method validate the Datatype of the Key is being passed is String or not
	 * If any of the Keys passing in this method found other than String it will fail
	 * In this Function only pass the Key name in the 'hash_Set' and API function name in JSONObject argument.
	 * */
	  public getUserDetails_Validation userdetilasStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(userdetilas.addCast_valid_Inputs());
		  hash_Set = InsertValue("status","message",
				  "cast_uuid","cast_name","cast_bio","created_date",
				  "store_key","app_token","product_key","code");
		  
		  
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
	public getUserDetails_Validation userdetilasIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(userdetilas.addCast_valid_Inputs());
		  hash_Set = InsertValue("code");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  /*public userdetilas_Validation userdetilasArrayVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(userdetilas.addform_valid_Inputs());
		  hash_Set = InsertValue("templateList","template_trans","field_trans");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Array");
			
			}
			return this;
	  }
	  */
	  public getUserDetails_Validation userdetilasJsonVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(userdetilas.addCast_valid_Inputs());
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
		 *
		 */
	  public getUserDetails_Validation userdetilasyKeyPresent()
	  {
		 String APIResponse = userdetilas.addCast_valid_Inputs();
		  hash_Set = InsertValue("status","message",
				  "cast_uuid","cast_name","cast_bio","created_date",
				  "store_key","app_token","product_key","code");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public getUserDetails_Validation userdetilasStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(userdetilas.addCast_valid_Inputs());
		  hash_Set = InsertValue("code","status","message");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				
				String key = itr.next();
				String keyvalue = JE.getKeyValue(inputJSONObject,key);
				API_assertion.VerifyCodeStatus(key, keyvalue,"200","Cast added successfully.","SUCCESS");
			
			}
			return this;
	  }
	  
	  public getUserDetails_Validation ResponseTimeVerification()
	  {
		 long time = userdetilas.addCastResponseTime();
		 API_assertion.ResponseTimeVerification(time);
		 //ResponseTimeVerification(time);
		  return this;
	  }
	  

	  public getUserDetails_Validation userdetilasInvalidStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(userdetilas.addCast_invalid_Inputs());
		  hash_Set = InsertValue("status");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"String");
				//JE.getKey(inputJSONObject, itr.next());
			
			}	
		return this;
	  }
	  
	  public getUserDetails_Validation userdetilasInvalidIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(userdetilas.addCast_valid_Inputs());
		  hash_Set = InsertValue("code");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  public getUserDetails_Validation userdetilasInvalidKeyPresent()
	  {
		 String APIResponse = userdetilas.addCast_invalid_Inputs();
		  hash_Set = InsertValue("status","message","code");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public getUserDetails_Validation userdetilasInvalidArrayVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(userdetilas.addCast_invalid_Inputs());
		  hash_Set = InsertValue("message");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Array");
			
			}
			return this;
	  }
	  
	  public getUserDetails_Validation userdetilasInvalidStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(userdetilas.addCast_invalid_Inputs());
		  hash_Set = InsertValue("code","status","message");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				
				String key = itr.next();
				String keyvalue = JE.getKeyValue(inputJSONObject,key);
				API_assertion.VerifyCodeStatus(key, keyvalue,"400","[\"Cast Bio cannot be blank\"]" ,"FAILURE");
			
			}
			return this;
	  }
	  
	 
}

