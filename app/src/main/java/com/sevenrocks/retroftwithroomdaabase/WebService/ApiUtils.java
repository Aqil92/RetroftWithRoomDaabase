package com.sevenrocks.retroftwithroomdaabase.WebService;


import com.sevenrocks.retroftwithroomdaabase.WebService.Interfaces.APIService;

/**
 * Created by localadmin on 5/22/2018.
 */

public class ApiUtils {

    private ApiUtils() {}

    public static final String Base_Url = "https://www.xsell.in/webservices/vendor/";


    public static APIService getApiService() {
        return RetrofitClient.getClient(Base_Url).create(APIService.class);
    }



}