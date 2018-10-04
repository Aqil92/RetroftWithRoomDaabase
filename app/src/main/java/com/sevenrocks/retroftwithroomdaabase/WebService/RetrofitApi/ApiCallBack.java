package com.sevenrocks.retroftwithroomdaabase.WebService.RetrofitApi;

public interface ApiCallBack {
    void onSuccess();
    void onFailed(String errorMsg);
}
