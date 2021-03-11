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
import com.restassured.productPage.getAssetAudio;
import com.restassured.productPage.CommonPage;

import com.restassured.utils.ExtentReportListner;


public class getAssetAudio_Validation extends CommonPage
{

	public ExtentReportListner report = new ExtentReportListner();
	public  Set<String> hash_Set;
	public getAssetAudio getAssetAudio = new getAssetAudio();
	public JsonExtract JE = new JsonExtract();
	
	
	/*
	 * This method validate the Datatype of the Key is being passed is String or not
	 * If any of the Keys passing in this method found other than String it will fail
	 * In this Function only pass the Key name in the 'hash_Set' and API function name in JSONObject argument.
	 * */
	  public getAssetAudio_Validation getAssetAudioStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(getAssetAudio.getAssetAudio_valid_Inputs());
		  hash_Set = InsertValue("status","message",
				  "audio_uuid","file_name","file_type","file_url");
		  
		  
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
	public getAssetAudio_Validation getAssetAudioIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(getAssetAudio.getAssetAudio_valid_Inputs());
		  hash_Set = InsertValue("code");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  /*public getAssetAudio_Validation getAssetAudioArrayVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(getAssetAudio.addform_valid_Inputs());
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
	  public getAssetAudio_Validation getAssetAudioJsonVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(getAssetAudio.getAssetAudio_valid_Inputs());
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
	  public getAssetAudio_Validation getAssetAudioyKeyPresent()
	  {
		 String APIResponse = getAssetAudio.getAssetAudio_valid_Inputs();
		  hash_Set = InsertValue("status","message",
				  "audio_uuid","file_name","file_type","file_url","code");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public getAssetAudio_Validation getAssetAudioStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(getAssetAudio.getAssetAudio_valid_Inputs());
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
	  
	  public getAssetAudio_Validation ResponseTimeVerification()
	  {
		 long time = getAssetAudio.getAssetAudioResponseTime();
		 API_assertion.ResponseTimeVerification(time);
		 //ResponseTimeVerification(time);
		  return this;
	  }
	  

	  public getAssetAudio_Validation getAssetAudioInvalidStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(getAssetAudio.getAssetAudio_invalid_Inputs());
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
	  
	  public getAssetAudio_Validation getAssetAudioInvalidIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(getAssetAudio.getAssetAudio_valid_Inputs());
		  hash_Set = InsertValue("code");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  public getAssetAudio_Validation getAssetAudioInvalidKeyPresent()
	  {
		 String APIResponse = getAssetAudio.getAssetAudio_invalid_Inputs();
		  hash_Set = InsertValue("status","message","code");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public getAssetAudio_Validation getAssetAudioInvalidArrayVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(getAssetAudio.getAssetAudio_invalid_Inputs());
		  hash_Set = InsertValue("message");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Array");
			
			}
			return this;
	  }
	  
	  public getAssetAudio_Validation getAssetAudioInvalidStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(getAssetAudio.getAssetAudio_invalid_Inputs());
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

