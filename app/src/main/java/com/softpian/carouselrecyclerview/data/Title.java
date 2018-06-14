package com.softpian.carouselrecyclerview.data;

import com.squareup.moshi.Json;

public class Title{

	@Json(name = "_content")
	private String content;

	public void setContent(String content){
		this.content = content;
	}

	public String getContent(){
		return content;
	}

	@Override
 	public String toString(){
		return 
			"Title{" + 
			"_content = '" + content + '\'' + 
			"}";
		}
}