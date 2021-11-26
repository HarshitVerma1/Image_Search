package com.androharshit.image_search.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiUtilities {
    public static final String BASE_URL="https://api.unsplash.com/";
    public static final String Api_key="GFYDoJk0sFL0LV1jkQh75Yu5IkJHHDNIkvE9_ef-fzU";
    public static Retrofit retrofit=null;
    public static ApiInterface getApiInterface()
    {
        if(retrofit==null)
        {
            retrofit=new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit.create(ApiInterface.class);
    }
}
