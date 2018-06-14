package com.softpian.carouselrecyclerview.data;

import com.squareup.moshi.Json;

public class Comments{

	@Json(name = "_content")
	private int content;

	public void setContent(int content){
		this.content = content;
	}

	public int getContent(){
		return content;
	}

	@Override
 	public String toString(){
		return 
			"Comments{" + 
			"_content = '" + content + '\'' + 
			"}";
		}
}