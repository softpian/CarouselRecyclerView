package com.softpian.carouselrecyclerview.data;

import com.squareup.moshi.Json;

public class Owner{

	@Json(name = "nsid")
	private String nsid;

	@Json(name = "iconfarm")
	private int iconfarm;

	@Json(name = "path_alias")
	private String pathAlias;

	@Json(name = "iconserver")
	private String iconserver;

	@Json(name = "location")
	private String location;

	@Json(name = "username")
	private String username;

	@Json(name = "realname")
	private String realname;

	public void setNsid(String nsid){
		this.nsid = nsid;
	}

	public String getNsid(){
		return nsid;
	}

	public void setIconfarm(int iconfarm){
		this.iconfarm = iconfarm;
	}

	public int getIconfarm(){
		return iconfarm;
	}

	public void setPathAlias(String pathAlias){
		this.pathAlias = pathAlias;
	}

	public String getPathAlias(){
		return pathAlias;
	}

	public void setIconserver(String iconserver){
		this.iconserver = iconserver;
	}

	public String getIconserver(){
		return iconserver;
	}

	public void setLocation(String location){
		this.location = location;
	}

	public String getLocation(){
		return location;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getUsername(){
		return username;
	}

	public void setRealname(String realname){
		this.realname = realname;
	}

	public String getRealname(){
		return realname;
	}

	public String getBuddyIcon() {
		return String.format("http://farm%d.staticflickr.com/%s/buddyicons/%s.jpg", iconfarm, iconserver, nsid);
	}

	@Override
 	public String toString(){
		return 
			"Owner{" + 
			"nsid = '" + nsid + '\'' + 
			",iconfarm = '" + iconfarm + '\'' + 
			",path_alias = '" + pathAlias + '\'' + 
			",iconserver = '" + iconserver + '\'' + 
			",location = '" + location + '\'' + 
			",username = '" + username + '\'' + 
			",realname = '" + realname + '\'' + 
			"}";
		}
}