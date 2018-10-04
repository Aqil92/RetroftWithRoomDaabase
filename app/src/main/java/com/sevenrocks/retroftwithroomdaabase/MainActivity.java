package com.sevenrocks.retroftwithroomdaabase;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.sevenrocks.retroftwithroomdaabase.Database.Extras.Daos;
import com.sevenrocks.retroftwithroomdaabase.Database.Tables.Detail;
import com.sevenrocks.retroftwithroomdaabase.WebService.Models.RequestObj.GetReqObj;
import com.sevenrocks.retroftwithroomdaabase.WebService.Models.RequestObj.GetRequest;
import com.sevenrocks.retroftwithroomdaabase.WebService.RetrofitApi.ApiCallBack;
import com.sevenrocks.retroftwithroomdaabase.WebService.RetrofitApi.ApiImp;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity implements ApiCallBack {

    ApiImp apiImp;
    @BindView(R.id.pro)
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        apiImp=new ApiImp(this);
        apiImp.setApiCallBack(this);

        hiGetApi();
    }

    private void hiGetApi(){
        GetReqObj getReqObj=new GetReqObj();
        getReqObj.setAction("complete");
        getReqObj.setUsertype("vendor");
        getReqObj.setVendoruniqueid("9140067763");

        GetRequest getRequest=new GetRequest();
        getRequest.setVendorapp(getReqObj);
        apiImp.hitApi(getRequest);
    }


    @Override
    public void onSuccess() {
        this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(MainActivity.this, "SeeLogs of the list", Toast.LENGTH_SHORT).show();
                progressBar.setVisibility(View.GONE);
                getValuesForLog();
            }
        });
    }

    private void getValuesForLog() {

        List<Detail> list=new ArrayList();

        list= Daos.detailDao.getAll();

        Log.v("getApiService",""+list);
    }

    @Override
    public void onFailed(final String errorMsg) {
        this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(MainActivity.this, errorMsg, Toast.LENGTH_SHORT).show();
                progressBar.setVisibility(View.GONE);
            }
        });

    }
}
