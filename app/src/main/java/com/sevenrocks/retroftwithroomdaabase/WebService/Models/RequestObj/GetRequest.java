package com.sevenrocks.retroftwithroomdaabase.WebService.Models.RequestObj;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetRequest {

    @SerializedName("vendorapp")
    @Expose
    private GetReqObj vendorapp;

    public GetReqObj getVendorapp() {
        return vendorapp;
    }

    public void setVendorapp(GetReqObj vendorapp) {
        this.vendorapp = vendorapp;
    }
}
