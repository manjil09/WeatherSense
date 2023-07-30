package com.manjil.weathersense.feature.currentWeather;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class CurrentWeatherPojo {

    @SerializedName("data")
    private List<DataItemPojo> data;

    @SerializedName("count")
    private int count;

    public List<DataItemPojo> getData(){
        return data;
    }

    public int getCount(){
        return count;
    }
}
