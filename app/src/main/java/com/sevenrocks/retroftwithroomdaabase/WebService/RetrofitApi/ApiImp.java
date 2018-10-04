package com.sevenrocks.retroftwithroomdaabase.WebService.RetrofitApi;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.sevenrocks.retroftwithroomdaabase.Database.Extras.DbUtils;
import com.sevenrocks.retroftwithroomdaabase.Database.Extras.DbUtilsCallBack;
import com.sevenrocks.retroftwithroomdaabase.WebService.ApiUtils;
import com.sevenrocks.retroftwithroomdaabase.WebService.Models.RequestObj.GetRequest;
import com.sevenrocks.retroftwithroomdaabase.WebService.Models.ResponseObj.GetRes;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class ApiImp implements DbUtilsCallBack{
    ApiCallBack apiCallBack;
    Context context;
    DbUtils dbUtils;


    public ApiImp(Context context) {
        this.context = context;
        dbUtils=new DbUtils(this);
    }

   public void setApiCallBack(ApiCallBack apiCallBack){
        this.apiCallBack=apiCallBack;
    }

    public void hitApi( GetRequest getRequest){
        ApiUtils.getApiService().GetData(getRequest).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<GetRes>() {
                    @Override
                    public void onCompleted() {}

                    @Override
                    public void onError(Throwable e) {
                        apiCallBack.onFailed(e.toString());
                    }
                    @Override
                    public void onNext(GetRes getRes) {
                        Log.v("getApiService",""+getRes.toString());
                        if(!getRes.isStatus())
                            apiCallBack.onFailed(getRes.getMessage());
                        else{
                            dbUtils.insertData(getRes.getData());
                        }
                    }
                });
    }

    @Override
    public void onInsertComplete() {
        apiCallBack.onSuccess();
    }

    @Override
    public void onInsertFailed(String msg) {
        apiCallBack.onFailed(msg);
    }
}
