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
import com.restassured.productPage.saveAssetAudio;
import com.restassured.productPage.CommonPage;

import com.restassured.utils.ExtentReportListner;


public class saveAssetAudio_Validation extends CommonPage
{

	public ExtentReportListner report = new ExtentReportListner();
	public  Set<String> hash_Set;
	public saveAssetAudio saveAssetAudio = new saveAssetAudio();
	public JsonExtract JE = new JsonExtract();
	
	
	/*
	 * This method validate the Datatype of the Key is being passed is String or not
	 * If any of the Keys passing in this method found other than String it will fail
	 * In this Function only pass the Key name in the 'hash_Set' and API function name in JSONObject argument.
	 * */
	  public saveAssetAudio_Validation saveAssetAudioStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(saveAssetAudio.saveAssetAudio_valid_Inputs());
		  hash_Set = InsertValue("status","message",
				  "fieldUuid","fieldName","fieldAlias","createdDate",
				  "store_key","app_token","product_key");
		  
		  
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
	public saveAssetAudio_Validation saveAssetAudioIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(saveAssetAudio.saveAssetAudio_valid_Inputs());
		  hash_Set = InsertValue("code","id");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  /*public saveAssetAudio_Validation saveAssetAudioArrayVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(saveAssetAudio.addform_valid_Inputs());
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
	  public saveAssetAudio_Validation saveAssetAudioJsonVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(saveAssetAudio.saveAssetAudio_valid_Inputs());
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
	  public saveAssetAudio_Validation saveAssetAudioyKeyPresent()
	  {
		 String APIResponse = saveAssetAudio.saveAssetAudio_valid_Inputs();
		  hash_Set = InsertValue("status","message",
				  "file_uuid","file_name","file_type","file_size","duration",
				  "video_bitrate","audio_bitrate","bitRate","frame_rate","resolution",
				  "thumbnail_images","user_uuid","created_date","file_url","reference_uuid",
				  "encoding_status","is_embeded_url","media_url","code");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public saveAssetAudio_Validation saveAssetAudioStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(saveAssetAudio.saveAssetAudio_valid_Inputs());
		  hash_Set = InsertValue("code","status","message");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				
				String key = itr.next();
				String keyvalue = JE.getKeyValue(inputJSONObject,key);
				API_assertion.VerifyCodeStatus(key, keyvalue,"200","File uploaded successfully","SUCCESS");
			
			}
			return this;
	  }
	  
	  public saveAssetAudio_Validation ResponseTimeVerification()
	  {
		 long time = saveAssetAudio.saveAssetAudioResponseTime();
		 API_assertion.ResponseTimeVerification(time);
		 //ResponseTimeVerification(time);
		  return this;
	  }
	  

	  public saveAssetAudio_Validation saveAssetAudioInvalidStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(saveAssetAudio.saveAssetAudio_invalid_Inputs());
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
	  
	  public saveAssetAudio_Validation saveAssetAudioInvalidIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(saveAssetAudio.saveAssetAudio_valid_Inputs());
		  hash_Set = InsertValue("code");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  public saveAssetAudio_Validation saveAssetAudioInvalidKeyPresent()
	  {
		 String APIResponse = saveAssetAudio.saveAssetAudio_invalid_Inputs();
		  hash_Set = InsertValue("status","message","code");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public saveAssetAudio_Validation saveAssetAudioInvalidArrayVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(saveAssetAudio.saveAssetAudio_invalid_Inputs());
		  hash_Set = InsertValue("message");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Array");
			
			}
			return this;
	  }
	  
	  public saveAssetAudio_Validation saveAssetAudioInvalidStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(saveAssetAudio.saveAssetAudio_invalid_Inputs());
		  hash_Set = InsertValue("code","status","message");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				
				String key = itr.next();
				String keyvalue = JE.getKeyValue(inputJSONObject,key);
				API_assertion.VerifyCodeStatus(key, keyvalue,"107","File uuid shouldn't be null or empty" ,"FAILURE");
			
			}
			return this;
	  }
	  
	 
}

