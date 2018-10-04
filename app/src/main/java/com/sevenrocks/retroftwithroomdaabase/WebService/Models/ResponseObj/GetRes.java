package com.sevenrocks.retroftwithroomdaabase.WebService.Models.ResponseObj;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.sevenrocks.retroftwithroomdaabase.Database.Tables.Detail;

import java.util.List;

public class GetRes {

    @SerializedName("status")
    @Expose
    private boolean status;

    @SerializedName("message")
    @Expose
    private String message;

    @SerializedName("data")
    @Expose
    private List<Detail> data;

    public List<Detail> getData() {
        return data;
    }

    public void setData(List<Detail> data) {
        this.data = data;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "GetRes{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
