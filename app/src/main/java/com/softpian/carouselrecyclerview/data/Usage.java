package com.softpian.carouselrecyclerview.data;

import com.squareup.moshi.Json;

public class Usage{

	@Json(name = "canshare")
	private int canshare;

	@Json(name = "canprint")
	private int canprint;

	@Json(name = "canblog")
	private int canblog;

	@Json(name = "candownload")
	private int candownload;

	public void setCanshare(int canshare){
		this.canshare = canshare;
	}

	public int getCanshare(){
		return canshare;
	}

	public void setCanprint(int canprint){
		this.canprint = canprint;
	}

	public int getCanprint(){
		return canprint;
	}

	public void setCanblog(int canblog){
		this.canblog = canblog;
	}

	public int getCanblog(){
		return canblog;
	}

	public void setCandownload(int candownload){
		this.candownload = candownload;
	}

	public int getCandownload(){
		return candownload;
	}

	@Override
 	public String toString(){
		return 
			"Usage{" + 
			"canshare = '" + canshare + '\'' + 
			",canprint = '" + canprint + '\'' + 
			",canblog = '" + canblog + '\'' + 
			",candownload = '" + candownload + '\'' + 
			"}";
		}
}