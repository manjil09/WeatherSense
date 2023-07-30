package com.manjil.weathersense.feature.hourlyWeather;

import com.google.gson.annotations.SerializedName;

public class DataItemPojo {

    @SerializedName("pod")
    private String pod;

    @SerializedName("pres")
    private double pres;

    @SerializedName("wind_cdir")
    private String windCdir;

    @SerializedName("clouds")
    private double clouds;

    @SerializedName("wind_spd")
    private double windSpd;

    @SerializedName("ozone")
    private double ozone;

    @SerializedName("pop")
    private double pop;

    @SerializedName("datetime")
    private String datetime;

    @SerializedName("precip")
    private double precip;

    @SerializedName("timestamp_local")
    private String timestampLocal;

    @SerializedName("timestamp_utc")
    private String timestampUtc;

    @SerializedName("weather")
    private WeatherPojo weather;

    @SerializedName("snow_depth")
    private double snowDepth;

    @SerializedName("dni")
    private double dni;

    @SerializedName("clouds_mid")
    private double cloudsMid;

    @SerializedName("uv")
    private double uv;

    @SerializedName("vis")
    private double vis;

    @SerializedName("temp")
    private double temp;

    @SerializedName("dhi")
    private double dhi;

    @SerializedName("clouds_hi")
    private double cloudsHi;

    @SerializedName("app_temp")
    private double appTemp;

    @SerializedName("ghi")
    private double ghi;

    @SerializedName("dewpt")
    private double dewpt;

    @SerializedName("wind_dir")
    private double windDir;

    @SerializedName("solar_rad")
    private double solarRad;

    @SerializedName("wind_gust_spd")
    private double windGustSpd;

    @SerializedName("clouds_low")
    private double cloudsLow;

    @SerializedName("rh")
    private double rh;

    @SerializedName("slp")
    private double slp;

    @SerializedName("snow")
    private double snow;

    @SerializedName("wind_cdir_full")
    private String windCdirFull;

    @SerializedName("ts")
    private double ts;

    public String getPod(){
        return pod;
    }

    public double getPres(){
        return pres;
    }

    public String getWindCdir(){
        return windCdir;
    }

    public double getClouds(){
        return clouds;
    }

    public double getWindSpd(){
        return windSpd;
    }

    public double getOzone(){
        return ozone;
    }

    public double getPop(){
        return pop;
    }

    public String getDatetime(){
        return datetime;
    }

    public double getPrecip(){
        return precip;
    }

    public String getTimestampLocal(){
        return timestampLocal;
    }

    public String getTimestampUtc(){
        return timestampUtc;
    }

    public WeatherPojo getWeather(){
        return weather;
    }

    public double getSnowDepth(){
        return snowDepth;
    }

    public double getDni(){
        return dni;
    }

    public double getCloudsMid(){
        return cloudsMid;
    }

    public double getUv(){
        return uv;
    }

    public double getVis(){
        return vis;
    }

    public double getTemp(){
        return temp;
    }

    public double getDhi(){
        return dhi;
    }

    public double getCloudsHi(){
        return cloudsHi;
    }

    public double getAppTemp(){
        return appTemp;
    }

    public double getGhi(){
        return ghi;
    }

    public double getDewpt(){
        return dewpt;
    }

    public double getWindDir(){
        return windDir;
    }

    public double getSolarRad(){
        return solarRad;
    }

    public double getWindGustSpd(){
        return windGustSpd;
    }

    public double getCloudsLow(){
        return cloudsLow;
    }

    public double getRh(){
        return rh;
    }

    public double getSlp(){
        return slp;
    }

    public double getSnow(){
        return snow;
    }

    public String getWindCdirFull(){
        return windCdirFull;
    }

    public double getTs(){
        return ts;
    }
}
