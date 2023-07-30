package com.manjil.weathersense.api;

import com.manjil.weathersense.feature.currentWeather.CurrentWeatherPojo;
import com.manjil.weathersense.feature.dailyWeather.DailyWeatherPojo;
import com.manjil.weathersense.feature.hourlyWeather.HourlyWeatherPojo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface ApiService {
    @Headers({"X-RapidAPI-Key: 4433b8c9bcmsh567c2114d821c93p1b8766jsncd5d94c028ff",
            "X-RapidAPI-Host: weatherbit-v1-mashape.p.rapidapi.com"})
    @GET("current")
    Call<CurrentWeatherPojo> getCurrentWeather(@Query("lat") double lat, @Query("lon") double lon);

    @Headers({"X-RapidAPI-Key: 4433b8c9bcmsh567c2114d821c93p1b8766jsncd5d94c028ff",
            "X-RapidAPI-Host: weatherbit-v1-mashape.p.rapidapi.com"})
    @GET("forecast/daily")
    Call<DailyWeatherPojo> getDailyForecast(@Query("lat") double lat, @Query("lon") double lon);

    @Headers({"X-RapidAPI-Key: 4433b8c9bcmsh567c2114d821c93p1b8766jsncd5d94c028ff",
            "X-RapidAPI-Host: weatherbit-v1-mashape.p.rapidapi.com"})
    @GET("forecast/hourly")
    Call<HourlyWeatherPojo> getHourlyForecast(@Query("lat") double lat, @Query("lon") double lon, @Query("hours") int hours);

}
