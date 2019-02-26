package com.gzeinnumer.uploadimage.server;

import com.gzeinnumer.uploadimage.model.ResponseGambar;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("getImages_simplifiedcoding.php")
    Call<ResponseGambar> getAllData();
}
