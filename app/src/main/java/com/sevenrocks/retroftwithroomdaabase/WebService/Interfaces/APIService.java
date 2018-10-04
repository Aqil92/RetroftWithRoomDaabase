package com.sevenrocks.retroftwithroomdaabase.WebService.Interfaces;



import com.sevenrocks.retroftwithroomdaabase.WebService.Models.RequestObj.GetRequest;
import com.sevenrocks.retroftwithroomdaabase.WebService.Models.ResponseObj.GetRes;

import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import rx.Observable;


public interface APIService {

 //Sku

 @POST("vendor-order-listing.php/")
 @Headers({ "Content-Type: application/json;charset=UTF-8"})
 Observable<GetRes> GetData(@Body GetRequest getRequest);


}