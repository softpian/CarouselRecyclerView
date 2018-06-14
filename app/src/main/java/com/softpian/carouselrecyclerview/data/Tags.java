package com.softpian.carouselrecyclerview.data;

import com.squareup.moshi.Json;

import java.util.List;

public class Tags{

	@Json(name = "tag")
	private List<TagItem> tag;

	public void setTag(List<TagItem> tag){
		this.tag = tag;
	}

	public List<TagItem> getTag(){
		return tag;
	}

	@Override
 	public String toString(){
		return 
			"Tags{" + 
			"tag = '" + tag + '\'' + 
			"}";
		}
}