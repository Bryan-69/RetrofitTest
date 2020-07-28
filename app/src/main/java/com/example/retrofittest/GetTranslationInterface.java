package com.example.retrofittest;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface GetTranslationInterface {
    @GET("v3/config/district?key=715aa66326d8ee19f030951f6b54d2e7")
    Call<Translation> getCall(@QueryMap Map<String,String> options);
}
