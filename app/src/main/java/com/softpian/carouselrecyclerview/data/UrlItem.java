package com.softpian.carouselrecyclerview.data;

import com.squareup.moshi.Json;

public class UrlItem{

	@Json(name = "type")
	private String type;

	@Json(name = "_content")
	private String content;

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setContent(String content){
		this.content = content;
	}

	public String getContent(){
		return content;
	}

	@Override
 	public String toString(){
		return 
			"UrlItem{" + 
			"type = '" + type + '\'' + 
			",_content = '" + content + '\'' + 
			"}";
		}
}