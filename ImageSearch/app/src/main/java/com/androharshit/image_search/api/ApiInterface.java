package com.androharshit.image_search.api;

import static com.androharshit.image_search.api.ApiUtilities.Api_key;

import com.androharshit.image_search.Model.ImageModel;
import com.androharshit.image_search.Model.SearchModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface ApiInterface {
@Headers("Authorization: Client-ID"+Api_key)
    @GET("/photos")
    Call<List<ImageModel>> getImage(
            @Query("page") int page,
            @Query("page") int perPage

);
    @Headers("Authorization: Client-ID"+Api_key)
    @GET("search/photos")
    Call<SearchModel> searchImage(
            @Query("query") String query,
            @Query("page") int perPage

    );
}
