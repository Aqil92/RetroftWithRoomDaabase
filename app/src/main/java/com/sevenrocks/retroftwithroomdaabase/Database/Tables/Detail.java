package com.sevenrocks.retroftwithroomdaabase.Database.Tables;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "detail")
public class Detail {

    @NonNull
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name  = "tableid")
    private String tableid;

   @ColumnInfo(name ="serviceno")
    private String serviceno;

   @ColumnInfo(name ="xsellpay")
    private String xsellpay;

   @ColumnInfo(name ="estimatedamount")
    private String estimatedamount;

   @ColumnInfo(name ="pickupdate")
    private String pickupdate;

  @ColumnInfo(name ="pickuptime")
    private String pickuptime;

  @ColumnInfo(name ="orderdate")
    private String orderdate;

  @ColumnInfo(name ="ordertype")
    private String ordertype;

  @ColumnInfo(name ="devicetype")
    private String devicetype;

  @ColumnInfo(name ="brand")
    private String brand;

   @ColumnInfo(name ="series")
    private String series;

    @ColumnInfo(name ="modal")
    private String modal;

    @ColumnInfo(name ="noofdays")
    private String noofdays;

    @NonNull
    public String getTableid() {
        return tableid;
    }

    public void setTableid(@NonNull String tableid) {
        this.tableid = tableid;
    }

    public String getServiceno() {
        return serviceno;
    }

    public void setServiceno(String serviceno) {
        this.serviceno = serviceno;
    }

    public String getXsellpay() {
        return xsellpay;
    }

    public void setXsellpay(String xsellpay) {
        this.xsellpay = xsellpay;
    }

    public String getEstimatedamount() {
        return estimatedamount;
    }

    public void setEstimatedamount(String estimatedamount) {
        this.estimatedamount = estimatedamount;
    }

    public String getPickupdate() {
        return pickupdate;
    }

    public void setPickupdate(String pickupdate) {
        this.pickupdate = pickupdate;
    }

    public String getPickuptime() {
        return pickuptime;
    }

    public void setPickuptime(String pickuptime) {
        this.pickuptime = pickuptime;
    }

    public String getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(String orderdate) {
        this.orderdate = orderdate;
    }

    public String getOrdertype() {
        return ordertype;
    }

    public void setOrdertype(String ordertype) {
        this.ordertype = ordertype;
    }

    public String getDevicetype() {
        return devicetype;
    }

    public void setDevicetype(String devicetype) {
        this.devicetype = devicetype;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getModal() {
        return modal;
    }

    public void setModal(String modal) {
        this.modal = modal;
    }

    public String getNoofdays() {
        return noofdays;
    }

    public void setNoofdays(String noofdays) {
        this.noofdays = noofdays;
    }

    @Override
    public String toString() {
        return "Detail{" +
                "tableid='" + tableid + '\'' +
                ", serviceno='" + serviceno + '\'' +
                ", xsellpay='" + xsellpay + '\'' +
                ", estimatedamount='" + estimatedamount + '\'' +
                ", pickupdate='" + pickupdate + '\'' +
                ", pickuptime='" + pickuptime + '\'' +
                ", orderdate='" + orderdate + '\'' +
                ", ordertype='" + ordertype + '\'' +
                ", devicetype='" + devicetype + '\'' +
                ", brand='" + brand + '\'' +
                ", series='" + series + '\'' +
                ", modal='" + modal + '\'' +
                ", noofdays='" + noofdays + '\'' +
                '}';
    }
}

