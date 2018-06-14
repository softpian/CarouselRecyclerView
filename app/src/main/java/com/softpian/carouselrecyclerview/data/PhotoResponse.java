package com.softpian.carouselrecyclerview.data;

import com.squareup.moshi.Json;

public class PhotoResponse {

	@Json(name = "stat")
	private String stat;

	@Json(name = "photos")
	private Photos photos;

	public void setStat(String stat){
		this.stat = stat;
	}

	public String getStat(){
		return stat;
	}

	public void setPhotos(Photos photos){
		this.photos = photos;
	}

	public Photos getPhotos(){
		return photos;
	}

	@Override
 	public String toString(){
		return 
			"PhotoResponse{" +
			"stat = '" + stat + '\'' + 
			",photos = '" + photos + '\'' + 
			"}";
		}
}