package com.softpian.carouselrecyclerview.data;

import com.squareup.moshi.Json;

public class People{

	@Json(name = "haspeople")
	private int haspeople;

	public void setHaspeople(int haspeople){
		this.haspeople = haspeople;
	}

	public int getHaspeople(){
		return haspeople;
	}

	@Override
 	public String toString(){
		return 
			"People{" + 
			"haspeople = '" + haspeople + '\'' + 
			"}";
		}
}