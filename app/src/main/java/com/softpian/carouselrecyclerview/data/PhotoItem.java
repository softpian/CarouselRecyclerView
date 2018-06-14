package com.softpian.carouselrecyclerview.data;

import com.squareup.moshi.Json;

public class PhotoItem{

	@Json(name = "owner")
	private String owner;

	@Json(name = "server")
	private String server;

	@Json(name = "ispublic")
	private int ispublic;

	@Json(name = "isfriend")
	private int isfriend;

	@Json(name = "farm")
	private int farm;

	@Json(name = "id")
	private String id;

	@Json(name = "secret")
	private String secret;

	@Json(name = "title")
	private String title;

	@Json(name = "isfamily")
	private int isfamily;

	public void setOwner(String owner){
		this.owner = owner;
	}

	public String getOwner(){
		return owner;
	}

	public void setServer(String server){
		this.server = server;
	}

	public String getServer(){
		return server;
	}

	public void setIspublic(int ispublic){
		this.ispublic = ispublic;
	}

	public int getIspublic(){
		return ispublic;
	}

	public void setIsfriend(int isfriend){
		this.isfriend = isfriend;
	}

	public int getIsfriend(){
		return isfriend;
	}

	public void setFarm(int farm){
		this.farm = farm;
	}

	public int getFarm(){
		return farm;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setSecret(String secret){
		this.secret = secret;
	}

	public String getSecret(){
		return secret;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setIsfamily(int isfamily){
		this.isfamily = isfamily;
	}

	public int getIsfamily(){
		return isfamily;
	}

	public String getPhotoUrl() {
		return String.format("https://farm%d.staticflickr.com/%s/%s_%s.jpg", farm, server, id, secret);
	}

	@Override
 	public String toString(){
		return 
			"PhotoItem{" + 
			"owner = '" + owner + '\'' + 
			",server = '" + server + '\'' + 
			",ispublic = '" + ispublic + '\'' + 
			",isfriend = '" + isfriend + '\'' + 
			",farm = '" + farm + '\'' + 
			",id = '" + id + '\'' + 
			",secret = '" + secret + '\'' + 
			",title = '" + title + '\'' + 
			",isfamily = '" + isfamily + '\'' + 
			"}";
		}
}