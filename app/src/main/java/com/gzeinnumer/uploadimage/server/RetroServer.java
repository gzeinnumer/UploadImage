package com.gzeinnumer.uploadimage.server;

import com.gzeinnumer.uploadimage.Constants;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroServer {

    public static Retrofit setInit(){
        return new Retrofit.Builder()
                .baseUrl(Constants.IMAGES_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static ApiService getInstance(){
        return setInit().create(ApiService.class);
    }

}
