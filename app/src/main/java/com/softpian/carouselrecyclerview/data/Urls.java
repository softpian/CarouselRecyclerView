package com.softpian.carouselrecyclerview.data;

import com.squareup.moshi.Json;

import java.util.List;

public class Urls{

	@Json(name = "url")
	private List<UrlItem> url;

	public void setUrl(List<UrlItem> url){
		this.url = url;
	}

	public List<UrlItem> getUrl(){
		return url;
	}

	@Override
 	public String toString(){
		return 
			"Urls{" + 
			"url = '" + url + '\'' + 
			"}";
		}
}