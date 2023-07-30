package com.manjil.weathersense.feature.currentWeather;

import com.manjil.weathersense.api.ApiCallInstance;
import com.manjil.weathersense.api.ApiService;

import retrofit2.Call;
import retrofit2.Retrofit;

public class CurrentWeatherModel implements CurrentWeatherContract.Model{
    @Override
    public Call<CurrentWeatherPojo> getCurrentWeather(double lat, double lon) {
        Retrofit retrofit = new ApiCallInstance().getInstance();
        return retrofit.create(ApiService.class).getCurrentWeather(lat, lon);
    }
}
