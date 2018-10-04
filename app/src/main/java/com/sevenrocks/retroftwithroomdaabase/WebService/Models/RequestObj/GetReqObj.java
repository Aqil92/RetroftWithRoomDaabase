package com.sevenrocks.retroftwithroomdaabase.WebService.Models.RequestObj;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetReqObj {

    @SerializedName("vendoruniqueid")
    @Expose
    private String vendoruniqueid;

    @SerializedName("usertype")
    @Expose
    private String usertype;

    @SerializedName("action")
    @Expose
    private String action;

    public String getVendoruniqueid() {
        return vendoruniqueid;
    }

    public void setVendoruniqueid(String vendoruniqueid) {
        this.vendoruniqueid = vendoruniqueid;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
