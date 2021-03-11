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

public class deleteRelatedContent extends CommonPage
{
	
	public String URL = "https://apigateway-staging.allthingsott.com/";
	//
	public CommonAPIs commonapis = new CommonAPIs();
	public ContentProperty ContentProperty = new ContentProperty();
	public String token = commonapis.loginAPI(ContentProperty.getEmail(),ContentProperty.getPassword(),ContentProperty.getProductkey(),ContentProperty.getProducttoken());
	
	
	  public String deleteRelatedContent_valid_Inputs() 
	  {

		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
			  		"    \"content_uuid\": \""+gettingContentid()+"\",\r\n" + 
			  		"    \"parent_uuid\": \"da45f330c4f7433ab12d5428b7595db4\",\r\n" + 
			  		"    \"app_token\": \":app_token\",\r\n" + 
			  		"    \"product_key\": \":product_key\",\r\n" + 
			  		"    \"bundle_uuid\": \""+gettingbundleid()+"\"\r\n" + 
			  		"   \r\n" + 
			  		"}    ");
	  
	  response =  deleteRequest("relatedcontent/delete", token);
	  String resdata = response.getBody().asString();
	  System.out.println(resdata);
	  return resdata;
	  
	  }
	  
	  public String gettingbundleid()
	  {
			baseURI = ContentProperty.getURL();
			 jsonparser("{\r\n" + 
				  		"     \"content_uuid\": \""+gettingContentid()+"\",\r\n" + 
				  		"    \"parent_uuid\": \"da45f330c4f7433ab12d5428b7595db4\",\r\n" + 
				  		"    \"app_token\": \":app_token\",\r\n" + 
				  		"    \"product_key\": \":product_key\"\r\n" + 
				  		"   \r\n" + 
				  		"}");
		  
		  response =  postRequest("relatedcontent/add", token);
		  ResponseData = response.jsonPath();
		  System.out.println("Bundle id "+ResponseData.get("data.bundle_uuid[0]"));	
		  
		  return ResponseData.get("data.bundle_uuid[0]");
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
			  		"\"content_name\":\"Automation Test Content\",\r\n" + 
			  		"\"content_permalink\":\"automation-test-content\",\r\n" + 
			  		"\"content_accessibility\":\"2\",\r\n" + 
			  		"\"content_category_uuid\":\"\\\"6fa3ffc279bf4a9986ee0d17bce86fec\\\"\",\r\n" + 
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
			System.out.println("Response token "+ResponseData.get("data.content_uuid"));
			
			return ResponseData.get("data.content_uuid");
			
		}
	  


	public long deleteRelatedContentResponseTime()
	{

		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
			  		"    \"content_uuid\": \""+gettingContentid()+"\",\r\n" + 
			  		"    \"parent_uuid\": \"da45f330c4f7433ab12d5428b7595db4\",\r\n" + 
			  		"    \"app_token\": \":app_token\",\r\n" + 
			  		"    \"product_key\": \":product_key\",\r\n" + 
			  		"    \"bundle_uuid\": \""+gettingbundleid()+"\"\r\n" + 
			  		"   \r\n" + 
			  		"}    ");
	  
	  response =  deleteRequest("relatedcontent/delete", token);
	  long responsetime = response.getTimeIn(TimeUnit.MILLISECONDS);
	  return responsetime; 
	  
	  }
	  

	public String deleteRelatedContent_invalid_Inputs() 
	  { 
		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
		  		"    \"content_uuid\": \"6dc55cef054145e9919a34b830ebd82c\",\r\n" + 
		  		"    \"parent_uuid\": \"18ff5ba932c347b68eba4e412f128083\",\r\n" + 
		  		"    \"app_token\": \":app_token\",\r\n" + 
		  		"    \"product_key\": \":product_key\",\r\n" + 
		  		"    \"bundle_uuid\": \"744c077119a3499aa5526783c98332c8\"\r\n" + 
		  		"   \r\n" + 
		  		"}    ");
	  
	  response =  deleteRequest("relatedcontent/delete", token);
	  String resdata = response.getBody().asString();
	  System.out.println(resdata);
	  return resdata;
	  
	  } 
	 
	 
	
	

}
