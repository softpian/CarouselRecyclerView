package com.softpian.carouselrecyclerview.data;

import com.squareup.moshi.Json;

public class TagItem{

	@Json(name = "author")
	private String author;

	@Json(name = "machine_tag")
	private String machineTag;

	@Json(name = "authorname")
	private String authorname;

	@Json(name = "raw")
	private String raw;

	@Json(name = "id")
	private String id;

	@Json(name = "_content")
	private String content;

	public void setAuthor(String author){
		this.author = author;
	}

	public String getAuthor(){
		return author;
	}

	public void setMachineTag(String machineTag){
		this.machineTag = machineTag;
	}

	public String getMachineTag(){
		return machineTag;
	}

	public void setAuthorname(String authorname){
		this.authorname = authorname;
	}

	public String getAuthorname(){
		return authorname;
	}

	public void setRaw(String raw){
		this.raw = raw;
	}

	public String getRaw(){
		return raw;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setContent(String content){
		this.content = content;
	}

	public String getContent(){
		return content;
	}

	@Override
 	public String toString(){
		return 
			"TagItem{" + 
			"author = '" + author + '\'' + 
			",machine_tag = '" + machineTag + '\'' + 
			",authorname = '" + authorname + '\'' + 
			",raw = '" + raw + '\'' + 
			",id = '" + id + '\'' + 
			",_content = '" + content + '\'' + 
			"}";
		}
}