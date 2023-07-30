package com.manjil.weathersense.feature.hourlyWeather;

import retrofit2.Call;

public interface HourlyWeatherContract {
    interface Model{
        Call<HourlyWeatherPojo> getHourlyWeather(double lat, double lon);
    }
    interface View{
        void setHourlyWeather(HourlyWeatherPojo hourlyWeatherPojo);
        void showErrorMessage(String message);
    }
    interface Presenter{
        void setHourlyWeather(double lat, double lon);
    }
}
