package com.manjil.weathersense.feature.dailyWeather;

import com.google.gson.annotations.SerializedName;

public class DataItemPojo {

    @SerializedName("pres")
    private double pres;

    @SerializedName("moon_phase")
    private double moonPhase;

    @SerializedName("wind_cdir")
    private String windCdir;

    @SerializedName("moonrise_ts")
    private double moonriseTs;

    @SerializedName("clouds")
    private double clouds;

    @SerializedName("low_temp")
    private double lowTemp;

    @SerializedName("wind_spd")
    private double windSpd;

    @SerializedName("ozone")
    private double ozone;

    @SerializedName("pop")
    private double pop;

    @SerializedName("datetime")
    private String datetime;

    @SerializedName("valid_date")
    private String validDate;

    @SerializedName("precip")
    private double precip;

    @SerializedName("min_temp")
    private double minTemp;

    @SerializedName("sunrise_ts")
    private double sunriseTs;

    @SerializedName("weather")
    private WeatherPojo weather;

    @SerializedName("app_max_temp")
    private double appMaxTemp;

    @SerializedName("max_temp")
    private double maxTemp;

    @SerializedName("snow_depth")
    private double snowDepth;

    @SerializedName("max_dhi")
    private double maxDhi;

    @SerializedName("sunset_ts")
    private double sunsetTs;

    @SerializedName("clouds_mid")
    private double cloudsMid;

    @SerializedName("uv")
    private double uv;

    @SerializedName("vis")
    private double vis;

    @SerializedName("high_temp")
    private double highTemp;

    @SerializedName("temp")
    private double temp;

    @SerializedName("clouds_hi")
    private double cloudsHi;

    @SerializedName("app_min_temp")
    private double appMinTemp;

    @SerializedName("moon_phase_lunation")
    private double moonPhaseLunation;

    @SerializedName("dewpt")
    private double dewpt;

    @SerializedName("wind_dir")
    private double windDir;

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

    @SerializedName("moonset_ts")
    private double moonsetTs;

    @SerializedName("ts")
    private double ts;

    public double getPres(){
        return pres;
    }

    public double getMoonPhase(){
        return moonPhase;
    }

    public String getWindCdir(){
        return windCdir;
    }

    public double getMoonriseTs(){
        return moonriseTs;
    }

    public double getClouds(){
        return clouds;
    }

    public double getLowTemp(){
        return lowTemp;
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

    public String getValidDate(){
        return validDate;
    }

    public double getPrecip(){
        return precip;
    }

    public double getMinTemp(){
        return minTemp;
    }

    public double getSunriseTs(){
        return sunriseTs;
    }

    public WeatherPojo getWeather(){
        return weather;
    }

    public double getAppMaxTemp(){
        return appMaxTemp;
    }

    public double getMaxTemp(){
        return maxTemp;
    }

    public double getSnowDepth(){
        return snowDepth;
    }

    public double getMaxDhi(){
        return maxDhi;
    }

    public double getSunsetTs(){
        return sunsetTs;
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

    public double getHighTemp(){
        return highTemp;
    }

    public double getTemp(){
        return temp;
    }

    public double getCloudsHi(){
        return cloudsHi;
    }

    public double getAppMinTemp(){
        return appMinTemp;
    }

    public double getMoonPhaseLunation(){
        return moonPhaseLunation;
    }

    public double getDewpt(){
        return dewpt;
    }

    public double getWindDir(){
        return windDir;
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

    public double getMoonsetTs(){
        return moonsetTs;
    }

    public double getTs(){
        return ts;
    }
}
