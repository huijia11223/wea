package com.example.weather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/12/27 0027.
 */

public class County extends DataSupport {
    private  int id;
    private String countyName;
    private String WwatherId;
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWwatherId() {
        return WwatherId;
    }

    public void setWwatherId(String wwatherId) {
        WwatherId = wwatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
