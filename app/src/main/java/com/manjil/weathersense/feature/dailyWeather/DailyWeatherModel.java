package com.manjil.weathersense.feature.dailyWeather;

import com.manjil.weathersense.api.ApiCallInstance;
import com.manjil.weathersense.api.ApiService;

import retrofit2.Call;
import retrofit2.Retrofit;

public class DailyWeatherModel implements DailyWeatherContract.Model{
    @Override
    public Call<DailyWeatherPojo> getDailyForecast(double lat, double lon) {
        Retrofit retrofit = new ApiCallInstance().getInstance();
        return retrofit.create(ApiService.class).getDailyForecast(lat,lon);
    }
}
