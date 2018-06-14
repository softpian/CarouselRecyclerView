package com.softpian.carouselrecyclerview.data;

import com.squareup.moshi.Json;

public class Editability{

	@Json(name = "cancomment")
	private int cancomment;

	@Json(name = "canaddmeta")
	private int canaddmeta;

	public void setCancomment(int cancomment){
		this.cancomment = cancomment;
	}

	public int getCancomment(){
		return cancomment;
	}

	public void setCanaddmeta(int canaddmeta){
		this.canaddmeta = canaddmeta;
	}

	public int getCanaddmeta(){
		return canaddmeta;
	}

	@Override
 	public String toString(){
		return 
			"Editability{" + 
			"cancomment = '" + cancomment + '\'' + 
			",canaddmeta = '" + canaddmeta + '\'' + 
			"}";
		}
}