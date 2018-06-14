package com.softpian.carouselrecyclerview.data;

import com.squareup.moshi.Json;

public class Photo{

	@Json(name = "server")
	private String server;

	@Json(name = "dateuploaded")
	private String dateuploaded;

	@Json(name = "notes")
	private Notes notes;

	@Json(name = "safety_level")
	private int safetyLevel;

	@Json(name = "usage")
	private Usage usage;

	@Json(name = "description")
	private Description description;

	@Json(name = "secret")
	private String secret;

	@Json(name = "media")
	private String media;

	@Json(name = "title")
	private Title title;

	@Json(name = "urls")
	private Urls urls;

	@Json(name = "editability")
	private Editability editability;

	@Json(name = "originalsecret")
	private String originalsecret;

	@Json(name = "farm")
	private int farm;

	@Json(name = "id")
	private String id;

	@Json(name = "views")
	private int views;

	@Json(name = "owner")
	private Owner owner;

	@Json(name = "comments")
	private Comments comments;

	@Json(name = "visibility")
	private Visibility visibility;

	@Json(name = "publiceditability")
	private Publiceditability publiceditability;

	@Json(name = "rotation")
	private int rotation;

	@Json(name = "dates")
	private Dates dates;

	@Json(name = "people")
	private People people;

	@Json(name = "tags")
	private Tags tags;

	@Json(name = "license")
	private int license;

	@Json(name = "originalformat")
	private String originalformat;

	@Json(name = "isfavorite")
	private int isfavorite;

	public void setServer(String server){
		this.server = server;
	}

	public String getServer(){
		return server;
	}

	public void setDateuploaded(String dateuploaded){
		this.dateuploaded = dateuploaded;
	}

	public String getDateuploaded(){
		return dateuploaded;
	}

	public void setNotes(Notes notes){
		this.notes = notes;
	}

	public Notes getNotes(){
		return notes;
	}

	public void setSafetyLevel(int safetyLevel){
		this.safetyLevel = safetyLevel;
	}

	public int getSafetyLevel(){
		return safetyLevel;
	}

	public void setUsage(Usage usage){
		this.usage = usage;
	}

	public Usage getUsage(){
		return usage;
	}

	public void setDescription(Description description){
		this.description = description;
	}

	public Description getDescription(){
		return description;
	}

	public void setSecret(String secret){
		this.secret = secret;
	}

	public String getSecret(){
		return secret;
	}

	public void setMedia(String media){
		this.media = media;
	}

	public String getMedia(){
		return media;
	}

	public void setTitle(Title title){
		this.title = title;
	}

	public Title getTitle(){
		return title;
	}

	public void setUrls(Urls urls){
		this.urls = urls;
	}

	public Urls getUrls(){
		return urls;
	}

	public void setEditability(Editability editability){
		this.editability = editability;
	}

	public Editability getEditability(){
		return editability;
	}

	public void setOriginalsecret(String originalsecret){
		this.originalsecret = originalsecret;
	}

	public String getOriginalsecret(){
		return originalsecret;
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

	public void setViews(int views){
		this.views = views;
	}

	public int getViews(){
		return views;
	}

	public void setOwner(Owner owner){
		this.owner = owner;
	}

	public Owner getOwner(){
		return owner;
	}

	public void setComments(Comments comments){
		this.comments = comments;
	}

	public Comments getComments(){
		return comments;
	}

	public void setVisibility(Visibility visibility){
		this.visibility = visibility;
	}

	public Visibility getVisibility(){
		return visibility;
	}

	public void setPubliceditability(Publiceditability publiceditability){
		this.publiceditability = publiceditability;
	}

	public Publiceditability getPubliceditability(){
		return publiceditability;
	}

	public void setRotation(int rotation){
		this.rotation = rotation;
	}

	public int getRotation(){
		return rotation;
	}

	public void setDates(Dates dates){
		this.dates = dates;
	}

	public Dates getDates(){
		return dates;
	}

	public void setPeople(People people){
		this.people = people;
	}

	public People getPeople(){
		return people;
	}

	public void setTags(Tags tags){
		this.tags = tags;
	}

	public Tags getTags(){
		return tags;
	}

	public void setLicense(int license){
		this.license = license;
	}

	public int getLicense(){
		return license;
	}

	public void setOriginalformat(String originalformat){
		this.originalformat = originalformat;
	}

	public String getOriginalformat(){
		return originalformat;
	}

	public void setIsfavorite(int isfavorite){
		this.isfavorite = isfavorite;
	}

	public int getIsfavorite(){
		return isfavorite;
	}

	public String getPhotoUrl() {
		return String.format("https://farm%d.staticflickr.com/%s/%s_%s.jpg", farm, server, id, secret);
	}

	@Override
 	public String toString(){
		return 
			"Photo{" + 
			"server = '" + server + '\'' + 
			",dateuploaded = '" + dateuploaded + '\'' + 
			",notes = '" + notes + '\'' + 
			",safety_level = '" + safetyLevel + '\'' + 
			",usage = '" + usage + '\'' + 
			",description = '" + description + '\'' + 
			",secret = '" + secret + '\'' + 
			",media = '" + media + '\'' + 
			",title = '" + title + '\'' + 
			",urls = '" + urls + '\'' + 
			",editability = '" + editability + '\'' + 
			",originalsecret = '" + originalsecret + '\'' + 
			",farm = '" + farm + '\'' + 
			",id = '" + id + '\'' + 
			",views = '" + views + '\'' + 
			",owner = '" + owner + '\'' + 
			",comments = '" + comments + '\'' + 
			",visibility = '" + visibility + '\'' + 
			",publiceditability = '" + publiceditability + '\'' + 
			",rotation = '" + rotation + '\'' + 
			",dates = '" + dates + '\'' + 
			",people = '" + people + '\'' + 
			",tags = '" + tags + '\'' + 
			",license = '" + license + '\'' + 
			",originalformat = '" + originalformat + '\'' + 
			",isfavorite = '" + isfavorite + '\'' + 
			"}";
		}
}