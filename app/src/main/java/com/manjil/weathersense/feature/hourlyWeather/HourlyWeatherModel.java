package com.manjil.weathersense.feature.hourlyWeather;

import com.manjil.weathersense.api.ApiCallInstance;
import com.manjil.weathersense.api.ApiService;

import retrofit2.Call;
import retrofit2.Retrofit;

public class HourlyWeatherModel implements HourlyWeatherContract.Model{
    @Override
    public Call<HourlyWeatherPojo> getHourlyWeather(double lat, double lon) {
        Retrofit retrofit = new ApiCallInstance().getInstance();
        return retrofit.create(ApiService.class).getHourlyForecast(lat, lon, 24);
    }
}
