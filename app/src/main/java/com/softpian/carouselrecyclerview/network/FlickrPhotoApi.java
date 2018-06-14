package com.softpian.carouselrecyclerview.network;

import com.softpian.carouselrecyclerview.data.PhotoInfo;
import com.softpian.carouselrecyclerview.data.PhotoResponse;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

public interface FlickrPhotoApi {

    @GET("?method=flickr.photos.search&format=json&nojsoncallback=1")
    Call<PhotoResponse> getFlickrPhotosSearch(@QueryMap Map<String, String> queries);

    @GET("?method=flickr.photos.getInfo&format=json&nojsoncallback=1")
    Call<PhotoInfo> getFlickrPhotoInfo(
            @Query("api_key") String flickrApiKey,
            @Query("photo_id") String photoId
    );
}
