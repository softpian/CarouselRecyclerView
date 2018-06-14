package com.softpian.carouselrecyclerview.data;

import com.squareup.moshi.Json;

public class PhotoInfo{

	@Json(name = "stat")
	private String stat;

	@Json(name = "photo")
	private Photo photo;

	public void setStat(String stat){
		this.stat = stat;
	}

	public String getStat(){
		return stat;
	}

	public void setPhoto(Photo photo){
		this.photo = photo;
	}

	public Photo getPhoto(){
		return photo;
	}

	@Override
 	public String toString(){
		return 
			"PhotoInfo{" + 
			"stat = '" + stat + '\'' + 
			",photo = '" + photo + '\'' + 
			"}";
		}
}