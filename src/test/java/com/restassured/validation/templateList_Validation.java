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
import com.restassured.productPage.templateList;
import com.restassured.productPage.CommonPage;

import com.restassured.utils.ExtentReportListner;


public class templateList_Validation extends CommonPage
{

	public ExtentReportListner report = new ExtentReportListner();
	public  Set<String> hash_Set;
	public templateList templateList = new templateList();
	public JsonExtract JE = new JsonExtract();
	
	
	/*
	 * This method validate the Datatype of the Key is being passed is String or not
	 * If any of the Keys passing in this method found other than String it will fail
	 * In this Function only pass the Key name in the 'hash_Set' and API function name in JSONObject argument.
	 * */
	  public templateList_Validation templateListStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(templateList.templateList_valid_Inputs());
		  hash_Set = InsertValue("status","message",
				  "template_uuid","template_name","cast_bio","app_token","product_key");
		  
		  
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
	public templateList_Validation templateListIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(templateList.templateList_valid_Inputs());
		  hash_Set = InsertValue("code");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  /*public templateList_Validation templateListArrayVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(templateList.addform_valid_Inputs());
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
	  public templateList_Validation templateListJsonVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(templateList.templateList_valid_Inputs());
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
	  public templateList_Validation templateListyKeyPresent()
	  {
		 String APIResponse = templateList.templateList_valid_Inputs();
		  hash_Set = InsertValue("status","message",
				  "template_name","template_uuid","content_types",
				  "app_token","product_key","code");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public templateList_Validation templateListStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(templateList.templateList_valid_Inputs());
		  hash_Set = InsertValue("code","status","message");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				
				String key = itr.next();
				String keyvalue = JE.getKeyValue(inputJSONObject,key);
				API_assertion.VerifyCodeStatus(key, keyvalue,"200","Fetched Successfully","SUCCESS");
			
			}
			return this;
	  }
	  
	  public templateList_Validation ResponseTimeVerification()
	  {
		 long time = templateList.templateListResponseTime();
		 API_assertion.ResponseTimeVerification(time);
		 //ResponseTimeVerification(time);
		  return this;
	  }
	  

	  public templateList_Validation templateListInvalidStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(templateList.templateList_invalid_Inputs());
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
	  
	  public templateList_Validation templateListInvalidIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(templateList.templateList_valid_Inputs());
		  hash_Set = InsertValue("code");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  public templateList_Validation templateListInvalidKeyPresent()
	  {
		 String APIResponse = templateList.templateList_invalid_Inputs();
		  hash_Set = InsertValue("status","message","code");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public templateList_Validation templateListInvalidArrayVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(templateList.templateList_invalid_Inputs());
		  hash_Set = InsertValue("message");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Array");
			
			}
			return this;
	  }
	  
	  public templateList_Validation templateListInvalidStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(templateList.templateList_invalid_Inputs());
		  hash_Set = InsertValue("code","status","message");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				
				String key = itr.next();
				String keyvalue = JE.getKeyValue(inputJSONObject,key);
				API_assertion.VerifyCodeStatus(key, keyvalue,"400","query did not return a unique result: 14; nested exception is javax.persistence.NonUniqueResultException: query did not return a unique result: 14" ,"FAILED");
			
			}
			return this;
	  }
	  
	 
}

