package com.softpian.carouselrecyclerview.data;

import com.squareup.moshi.Json;

import java.util.List;

public class Notes{

	@Json(name = "note")
	private List<Object> note;

	public void setNote(List<Object> note){
		this.note = note;
	}

	public List<Object> getNote(){
		return note;
	}

	@Override
 	public String toString(){
		return 
			"Notes{" + 
			"note = '" + note + '\'' + 
			"}";
		}
}