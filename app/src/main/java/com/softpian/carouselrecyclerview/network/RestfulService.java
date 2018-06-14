package com.softpian.carouselrecyclerview.network;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

public class RestfulService {

    private RestfulService() {}

    private static class SingletonHelper {

        private static final RestfulService INSTANCE = new RestfulService();
    }

    public static RestfulService getInstance() {

        return SingletonHelper.INSTANCE;
    }

    public <T> T createRetrofit(Class<T> cls, String baseUrl) {

        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(loggingInterceptor)
                .build();

        return new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(MoshiConverterFactory.create())
                .client(client)
                .build()
                .create(cls);
    }
}
