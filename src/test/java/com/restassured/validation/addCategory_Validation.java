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
import com.restassured.productPage.addCategory;
import com.restassured.productPage.CommonPage;

import com.restassured.utils.ExtentReportListner;


public class addCategory_Validation extends CommonPage
{

	public ExtentReportListner report = new ExtentReportListner();
	public  Set<String> hash_Set;
	public addCategory addCategory = new addCategory();
	public JsonExtract JE = new JsonExtract();
	
	
	/*
	 * This method validate the Datatype of the Key is being passed is String or not
	 * If any of the Keys passing in this method found other than String it will fail
	 * In this Function only pass the Key name in the 'hash_Set' and API function name in JSONObject argument.
	 * */
	  public addCategory_Validation addCategoryStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(addCategory.addCategory_valid_Inputs());
		  hash_Set = InsertValue("status","message",
				  "category_uuid","category_name","category_image_uuid",
				  "category_parent_uuid","category_permalink","created_date",
				  "created_by","updated_date","updated_by","store_key","app_token","product_key",
				  "user_uuid","created_ip","updated_ip","sub_category","category_image_details");
		  
		  
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
	public addCategory_Validation addCategoryIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(addCategory.addCategory_valid_Inputs());
		  hash_Set = InsertValue("code");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  /*public addCategory_Validation AddFormArrayVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(Adpage.addform_valid_Inputs());
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
	  public addCategory_Validation addCategoryJsonVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(addCategory.addCategory_valid_Inputs());
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
	  public addCategory_Validation addCategoryKeyPresent()
	  {
		 String APIResponse = addCategory.addCategory_valid_Inputs();
		  hash_Set = InsertValue("status","message",
				  "category_uuid","category_name","category_image_uuid",
				  "category_parent_uuid","category_permalink","created_date",
				  "created_by","updated_date","updated_by","store_key","app_token","product_key",
				  "user_uuid","created_ip","updated_ip","sub_category","category_image_details","code");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public addCategory_Validation addCategoryStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(addCategory.addCategory_valid_Inputs());
		  hash_Set = InsertValue("code","status","message");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				
				String key = itr.next();
				String keyvalue = JE.getKeyValue(inputJSONObject,key);
				API_assertion.VerifyCodeStatus(key, keyvalue,"200","Category added successfully.","SUCCESS");
			
			}
			return this;
	  }
	  
	  public addCategory_Validation ResponseTimeVerification()
	  {
		 long time = addCategory.addCategoryResponseTime();
		 API_assertion.ResponseTimeVerification(time);
		 //ResponseTimeVerification(time);
		  return this;
	  }
	  

	  public addCategory_Validation addCategoryInvalidStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(addCategory.addCategory_invalid_Inputs());
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
	  
	  public addCategory_Validation addCategoryInvalidIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(addCategory.addCategory_invalid_Inputs());
		  hash_Set = InsertValue("code");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  public addCategory_Validation addCategoryInvalidKeyPresent()
	  {
		 String APIResponse = addCategory.addCategory_invalid_Inputs();
		  hash_Set = InsertValue("status","message","code");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public addCategory_Validation addCategoryInvalidArrayVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(addCategory.addCategory_invalid_Inputs());
		  hash_Set = InsertValue("message");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Array");
			
			}
			return this;
	  }
	  
	  public addCategory_Validation addCategoryInvalidStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(addCategory.addCategory_invalid_Inputs());
		  hash_Set = InsertValue("code","status","message");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				
				String key = itr.next();
				String keyvalue = JE.getKeyValue(inputJSONObject,key);
				API_assertion.VerifyCodeStatus(key, keyvalue,"400","[\"category parent uuid can not be blank\"]" ,"FAILURE");
			
			}
			return this;
	  }
	  
	 
}

