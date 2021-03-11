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

import org.json.JSONTokener;

import com.restassured.property.ContentProperty;;

public class addRelatedContent extends CommonPage
{
	
	public String URL = "https://apigateway-staging.allthingsott.com/";
	//
	public CommonAPIs commonapis = new CommonAPIs();
	public ContentProperty ContentProperty = new ContentProperty();
	public String token = commonapis.loginAPI(ContentProperty.getEmail(),ContentProperty.getPassword(),ContentProperty.getProductkey(),ContentProperty.getProducttoken());
	
	
	  public String addRelatedContent_valid_Inputs() 
	  { 
		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
			  		"     \"content_uuid\": \""+gettingContentid()+"\",\r\n" + 
			  		"    \"parent_uuid\": \"cb2661c0bfb74dee8deb476f6841b7ad\",\r\n" + 
			  		"    \"app_token\": \":app_token\",\r\n" + 
			  		"    \"product_key\": \":product_key\"\r\n" + 
			  		"   \r\n" + 
			  		"}");
	  
	  response =  postRequest("relatedcontent/add", token);
	  String resdata = response.getBody().asString();
	  System.out.println(resdata);
	  return resdata;
	  
	  }
	  
	  public long addRelatedContentResponseTime()
	  {

		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
			  		"     \"content_uuid\": \""+gettingContentid()+"\",\r\n" + 
			  		"    \"parent_uuid\": \"cb2661c0bfb74dee8deb476f6841b7ad\",\r\n" + 
			  		"    \"app_token\": \":app_token\",\r\n" + 
			  		"    \"product_key\": \":product_key\"\r\n" + 
			  		"   \r\n" + 
			  		"}");
	  response =  postRequest("relatedcontent/add", token);
	  long responsetime = response.getTimeIn(TimeUnit.MILLISECONDS);
	  return responsetime; 
	  
	  }
	 
	  public String addRelatedContent_invalid_Inputs() 
	  { 
		  baseURI = ContentProperty.getURL();
		 
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
			  		"     \"content_uuid\": \"\",\r\n" + 
			  		"    \"parent_uuid\": \"cb2661c0bfb74dee8deb476f6841b7ad\",\r\n" + 
			  		"    \"app_token\": \":app_token\",\r\n" + 
			  		"    \"product_key\": \":product_key\"\r\n" + 
			  		"   \r\n" + 
			  		"}");
	  
	  response =  postRequest("relatedcontent/add", token);
	  String resdata = response.getBody().asString();
	  System.out.println(resdata);
	  return resdata;
	  
	  } 
	  
	  public String gettingContentid()
	  {
			baseURI = ContentProperty.getURL();
			
			
			//request data (Json data)
			jsonparser("{     \r\n" + 
			  		"\"isuploading\":false,\r\n" + 
			  		"\"content_trans\":[],\r\n" + 
			  		"\"content_asset_type\":1,\r\n" + 
			  		"\"content_template_uuid\":\"1\",\r\n" + 
			  		"\"content_name\":\"Related Content\",\r\n" + 
			  		"\"content_permalink\":\"related-content\",\r\n" + 
			  		"\"content_accessibility\":\"2\",\r\n" + 
			  		"\"content_category_uuid\":\"\\\"5afcbd0d5cd94d73aec217348c36abee\\\"\",\r\n" + 
			  		"\"content_desc\":\"Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.\",\r\n" + 
			  		"\"tags\":\"[automation]\",\r\n" + 
			  		"\"store_key\":\":store_id\",\r\n" + 
			  		"\"app_token\":\":app_token\",\r\n" + 
			  		"\"content_level\":\"0\",\r\n" + 
			  		"\"content_season\":\"\",\r\n" + 
			  		"\"content_episode\":\"\",\r\n" + 
			  		"\"content_asset_uuid\":\"\",\r\n" + 
			  		"\"content_trailer_uuid\":\"\",\r\n" + 
			  		"\"content_poster_uuid\":\"\",\r\n" + 
			  		"\"content_banner_uuid\":\"\",\r\n" + 
			  		"\"content_app_poster_uuid\":\"\",\"cast_type\":\"1DBAEF123456EC3\",\r\n" + 
			  		"\"cast_type_input\":\"\",\r\n" + 
			  		"\"cast_items\":[\r\n" + 
			  		"        {\r\n" + 
			  		"                \"cast_trans_cast_uuid\":\"83ffa1f712b442a5996a77c204c0ad7c\",\r\n" + 
			  		"                \"cast_type_uuid\":\"1DBAEF123456EC3\"\r\n" + 
			  		"                \r\n" + 
			  		"        }\r\n" + 
			  		"                ]\r\n" + 
			  		"        \r\n" + 
			  		"}");
			
			response = postRequest("content/save", token);
			ResponseData = response.jsonPath();
			System.out.println("content_uuid "+ResponseData.get("data.content_uuid"));
			
			return ResponseData.get("data.content_uuid");
	  
	  }
	  
	  
}
